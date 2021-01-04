import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    /* alright to read from a file one must
    * declare a new file (imported from the main method)
    * create a new fileInputStream, with the file as the parameter
    * */


    public void readFile(File file) throws IOException {

        File orderInputFile = file;
        FileInputStream fileInputStream = new FileInputStream(orderInputFile);
        int r = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while ((r = fileInputStream.read()) != -1) {
            stringBuilder.append((char) r);
        }
        String orders = stringBuilder.toString();
        System.out.println(orders);

    }
}
