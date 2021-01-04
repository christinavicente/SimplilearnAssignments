import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class FileWriter {
    private String file_path;
    public FileWriter(String path){
        file_path=path;
    }
    public void writeFile(String entry) throws IOException {

            String message = String.format("ENTRY Date:[%s] -- %s\n", new Date(), entry);
            Files.write(
                    Paths.get(file_path),
                    message.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

    }

}
