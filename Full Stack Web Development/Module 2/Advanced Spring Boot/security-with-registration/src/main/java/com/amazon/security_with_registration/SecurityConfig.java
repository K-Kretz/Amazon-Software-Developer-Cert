package com.amazon.security_with_registration;

import com.amazon.security_with_registration.service.UserService;
import jakarta.servlet.annotation.ServletSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final UserService userService;

    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/register", "/login").permitAll()
                .anyRequest().authenticated()
                )
                .formLogin( form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/welcome", true)
                )
                .logout( logout -> logout
                .permitAll()
                );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return username ->{
            com.amazon.security_with_registration.model.User user = userService.findByUsername(username);
            if(user==null){
                throw new UsernameNotFoundException("USer not Found");
            }
            UserBuilder builder = User.withUsername(user.getUsername());
            builder.password(user.getPassword());
            if(user.getRole() != null)
            {
                builder.roles(user.getRole());
            }
            return builder.build();
        };
    }
}
