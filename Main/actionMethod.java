package Main;
import java.util.Scanner;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class actionMethod {
    static String spacer = "-*-*-*-*-*-*-*-*-*-*-*-*-*-*";
    public static void doAction(String action) {
        Scanner sc = new Scanner(System.in);
        if(action.equals("create")) {
            System.out.println(spacer);
            System.out.println("Enter the exercise you are creating a new record for.");
            System.out.println(spacer);
            String exerciseName = sc.nextLine();
            String fileName = exerciseName +".txt";
            File f = new File(fileName);
            if(!f.exists()) {
            fileCreator.createFile(exerciseName);
            }
            else if(f.exists()) {
                System.out.println(spacer);
                System.out.println("This exercise file already exists.");
                System.out.println(spacer);
            }
        }
        if(action.equals("record")) {
            System.out.println(spacer);
            System.out.println("Please enter the name of the exercise you are attempting to record.");
            System.out.println(spacer);
            String exerciseName = sc.nextLine();
            String fileName = exerciseName + ".txt";
            File f = new File(fileName);
            if(f.exists()) {
                System.out.println(spacer);
                System.out.println("Please enter the exercise session in the order, weight, reps, and sets.");
                System.out.println(spacer);
                String numTotal = sc.nextLine();
                String[] userInput = null;
                userInput = numTotal.split(" ");
                String weight = userInput[0];
                String reps = userInput[1];
                String sets = userInput[2];
                LocalDateTime timeDate = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
                String timeEntered = timeDate.format(formatter);
                fileWriter.writeToFile(fileName, weight, reps, sets, timeEntered);
            }
            else {
                System.out.println("Error");
            }
        }
        if(action.equals("exit")) {
            System.exit(0);
        }
    }
}
