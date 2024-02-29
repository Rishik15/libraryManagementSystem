import java.util.HashSet;

public class LookUpAuthor {
    public static void lookUpAuthor(HashSet<Books> books, String author){
        for(Books book : books){
            if(author.equals(book.getAuthoString())) System.out.println(book.toString());

    }

}
}
