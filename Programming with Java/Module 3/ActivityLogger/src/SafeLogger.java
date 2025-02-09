import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SafeLogger {
    public static void main(String[] args) {
        Path filePath = Path.of("user_activity.log");
        String newLog = "User logged in at "+System.currentTimeMillis()+"\n";

        try(FileChannel fc = FileChannel.open(filePath,StandardOpenOption.WRITE,StandardOpenOption.APPEND)){
            FileLock lock = fc.lock(); //Lock channel exclusively
            try{
                //Convert the log entry to a ByteBuffer
                ByteBuffer bb = ByteBuffer.wrap(newLog.getBytes());
                //Write the buffer to the file
                while(bb.hasRemaining()){
                    fc.write(bb);
                }
                System.out.println("Log entry added with safe concurrent access");
            }finally {
                lock.release();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
