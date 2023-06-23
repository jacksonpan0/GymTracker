package Main;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
public class timeChecker {
    public static void getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();  
    }
}
