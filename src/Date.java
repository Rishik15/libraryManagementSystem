import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static String getCurrentDate(){
        LocalDateTime present = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = present.format(formatter);
        return formattedDateTime;
    }
 
}
