import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {

    /* ok for file handling first was is needs to be done is
    1. choose a location for the file
    2. set a path for the file relative to the method that we are working in
    3. create a instance of the file class with the created path

    * */


    public static void main(String args[]) throws IOException {
        int time=1;
        String PEOPLE_RECORDS_PATH = "src/records.txt";
        FileWriter writer=new FileWriter(PEOPLE_RECORDS_PATH);
        FileReader reader;
        File exampleFile = new File(PEOPLE_RECORDS_PATH);
        if (!exampleFile.exists()) {
            Files.createFile(Paths.get(PEOPLE_RECORDS_PATH));
        }
        reader=new FileReader();
        populateFile(writer,time);
        readFile(reader, exampleFile,time);



    }
    public static void populateFile( FileWriter fileWriter, int time) throws IOException {
        fileWriter.writeFile("first entry: " + time);
        fileWriter.writeFile("second entry: " + time);
        fileWriter.writeFile("third entry: " + time);
        fileWriter.writeFile("last entry: " + time);
        System.out.println("added: " + time);
    }
    public static void readFile(FileReader fileReader, File file, int time) throws IOException {
        fileReader.readFile(file);
        System.out.println("finished: "+ time);
    }

}

