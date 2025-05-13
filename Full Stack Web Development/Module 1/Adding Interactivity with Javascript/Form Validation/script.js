function validateForm(){

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;

    let valid = true;

    document.getElementById("nameError").innerHTML = "";
    document.getElementById("emailError").innerHTML = "";
    document.getElementById("passwordError").innerHTML = "";
    document.getElementById("confirmPasswordError").innerHTML = "";

    if(name === "")
    {
        document.getElementById("nameError").innerHTML = "Name is required!";
        valid = false;
    }

    if(email === "")
    {
        document.getElementById("emailError").innerHTML = "Email is required!";
        valid = false;
    }
     if(password.length < 8)
    {
        document.getElementById("passwordError").innerHTML = "Password doesn't meet the requirements";
        valid = false;
    }
     if(password !== confirmPassword)
    {
        document.getElementById("passwordError").innerHTML = "Password doesn't match with Confirm Password";
        valid = false;
    }

    return valid;
}