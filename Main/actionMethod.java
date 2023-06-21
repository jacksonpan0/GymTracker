package Main;
import java.util.Scanner;
public class actionMethod {
    public static void doAction(String action) {
        if(action.equals("create")) {
            System.out.println("Enter the exercise you are creating a new record for:");
            Scanner sc = new Scanner(System.in);
            String exerciseName = sc.nextLine();
            fileCreator.createFile(exerciseName);
        }
    }
}
