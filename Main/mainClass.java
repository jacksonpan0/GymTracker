package Main;
import java.util.Scanner;
public class mainClass {
    public static void main(String[] args){
        welcomeMessage.printMessage();
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
        actionMethod.doAction(action);
    }
}