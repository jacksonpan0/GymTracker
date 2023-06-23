package Main;
import java.util.Scanner;
import java.io.File;
public class actionMethod {
    public static void doAction(String action) {
        Scanner sc = new Scanner(System.in);
        if(action.equals("create")) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Enter the exercise you are creating a new record for.");
            System.out.println("If you wish to exit the program type 'exit' and press enter");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            String exerciseName = sc.nextLine();
            String fileName = exerciseName +".txt";
            File f = new File(fileName);
            if(!f.exists()) {
            fileCreator.createFile(exerciseName);
            }
            else if(f.exists()) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("This exercise file already exists.");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            }
        }
        if(action.equals("record")) {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Please enter the name of the exercise you are attempting to record.");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            String exerciseName = sc.nextLine();
            String fileName = exerciseName + ".txt";
            File f = new File(fileName);
            if(f.exists()) {
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println("Please enter the exercise session in the order, weight, reps, and sets.");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                String numTotal = sc.nextLine();
                String[] userInput = null;
                userInput = numTotal.split(" ");
                String weight = userInput[0];
                String reps = userInput[1];
                String sets = userInput[2];
            }
            else {

            }
        }
    }
}
