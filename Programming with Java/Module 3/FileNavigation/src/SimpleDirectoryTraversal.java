import java.io.File;
import java.nio.file.Files;

public class SimpleDirectoryTraversal {
    public static void main(String[] args) {

        File directory = new File("user_data");
        File[] filesList = directory.listFiles();

        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                }
            }
        }else{
            System.out.println("The directory does not exist or is not accessible");
        }
    }
}
