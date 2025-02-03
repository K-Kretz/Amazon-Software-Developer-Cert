import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExampleB {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the File name");
        String fileName = keyboard.next();
        keyboard.close();
        File file = new File("src/" + fileName + ".txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("This sis a sample STring content for the file.");
            System.out.println("File written successfully");
        }catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
