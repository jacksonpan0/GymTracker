package Main;
import java.io.File;
import java.io.IOException;
public class fileCreator {
    public static void createFile(String exercise) {
        try {
            String fileName = exercise + ".txt";
            File newFile = new File(fileName);
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}