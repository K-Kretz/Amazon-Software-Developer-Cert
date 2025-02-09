import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExampleNIO {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("user_data/jo_grey");

        try{
            if(Files.exists(directoryPath)){
                System.out.println("Directory already exists: " + directoryPath);
            } else {
                Files.createDirectories(directoryPath);
                System.out.println("Directory created successfully: "+ directoryPath);
            }
        }catch(IOException e){
            e.getStackTrace();
        }
    }
}
