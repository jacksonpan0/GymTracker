package Main;
public class welcomeMessage {
    static String spacer = "-*-*-*-*-*-*-*-*-*-*-*-*-*-*";
    public static void printMessage() {
    System.out.println(spacer);
    System.out.println("Hi, welcome to your personal lift tracker!");
    System.out.println("What would you like to do today?");
    System.out.println(spacer);
    System.out.println("If you want to create a new exercise file, type 'create' and press enter.");
    System.out.println("If you would like to record a session for an already existing exercise, type 'record' and press enter.");
    System.out.println("If you would like to see all previous entries of an already existing exercise, type 'print' and press enter");
    System.out.println("If you wish to exit the program type 'exit' and press enter");
    System.out.println(spacer);
    }
}
