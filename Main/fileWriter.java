package Main;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter {
    public static void writeToFile(String fileName, String weight, String reps, String sets, String timeEntered) {
        try {
            FileWriter myWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
            bufferedWriter.write("Date Recorded: " + timeEntered + "\n");
            bufferedWriter.write("Weight: " + weight + " Reps: " + reps + " Sets: " + sets + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
