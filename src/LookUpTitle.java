import java.util.HashSet;

public class LookUpTitle {
    
    public static void lookUpTitle(HashSet<Books> books, String title){
        for(Books book : books){
            if(title.equals(book.getTitleString())) System.out.println(book.toString());
        }
       
    }
}
