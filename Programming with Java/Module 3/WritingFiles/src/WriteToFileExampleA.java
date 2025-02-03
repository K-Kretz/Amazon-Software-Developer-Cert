import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExampleA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the File name");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/" + fileName + ".txt");
        try(FileOutputStream fos = new FileOutputStream(file)){
            String fileContents = "Hello World";
            byte[] fileContentBytes = fileContents.getBytes();
            fos.write(fileContentBytes);
            System.out.println("Write to file Successfully");
        }catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
