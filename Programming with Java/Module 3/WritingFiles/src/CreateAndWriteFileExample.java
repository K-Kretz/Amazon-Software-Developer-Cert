import java.io.*;
import java.util.Scanner;

public class CreateAndWriteFileExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the File name");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/" + fileName + ".txt");
        try(FileOutputStream fos = new FileOutputStream(file)){
            String fileContents = "Sample description for the file";
            byte[] fileContentBytes = fileContents.getBytes();
            fos.write(fileContentBytes);
        }catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

}
