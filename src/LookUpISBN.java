import java.util.HashSet;

public class LookUpISBN{

    public static void lookUpISBN(HashSet<Books> books, String ISBN){
        for(Books book: books){
            if(ISBN.equals(book.getISBN())) System.out.println(book.toString());
        }  
    }
}
