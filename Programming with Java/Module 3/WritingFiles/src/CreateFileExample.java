import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter File name to create!");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/"+fileName+".txt");
        try{
            boolean isFileCreated = file.createNewFile();
            if(isFileCreated){
                System.out.println("File \""+fileName+".txt\" created Successfully");
            }
        }catch(IOException e){
            System.out.println("I/O Exception Occurred");
            System.out.println(e.getMessage());
        }

    }
}
