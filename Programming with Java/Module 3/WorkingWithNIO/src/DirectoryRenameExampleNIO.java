import java.io.IOException;
import java.nio.file.*;

public class DirectoryRenameExampleNIO {
    public static void main(String[] args) {
        Path sourceDirectory = Paths.get("user_data/jo_grey");

        Path targetDirectory = Paths.get("user_data/john_smith");

        try{
            if(Files.exists(sourceDirectory)){
                Files.move(sourceDirectory,targetDirectory, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Directory renamed successfully: "+ targetDirectory);
            } else{
                System.out.println("Source Directory doesn't exist: "+ sourceDirectory);
            }

        }catch(IOException e){
           e.getStackTrace();
        }
    }
}
