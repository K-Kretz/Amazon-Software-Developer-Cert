import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class EfficientLogger {
    public static void main(String[] args) {
        String filePath = "user_activity.log";
        String newLog = "User logged in at "+System.currentTimeMillis()+"\n";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true))){
            bw.write(newLog);
            System.out.println("Log entry added efficiently");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
