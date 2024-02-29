import java.util.HashMap;

public class Loan {

    public static HashMap<Books, User> loanedBooks = new HashMap<>();
    public static HashMap<UserBook, String> userhistory = new HashMap<>();
    public static void loanBooks(User user, Books book){
       if(User.users.contains(user)){
        if(!loanedBooks.containsKey(book)){
            loanedBooks.put(book, user);
            UserBook userBook = new UserBook(user, book);
            userhistory.put(userBook, Date.getCurrentDate());
            System.out.println("\nBook was loaned successfully.");
        }else{
            System.out.println("\nThis book is already loaned.");
        }
       }else System.out.println("\nYou are not registered! Please register first to loan books.");
    }
    
    public static void returnBooks(User user, Books book){
        if(loanedBooks.containsKey(book) && loanedBooks.get(book) == user){
            loanedBooks.remove(book);
            UserBook userBook = new UserBook(user, book);
            userhistory.put(userBook, Date.getCurrentDate());
            System.out.println("\nThe book has been returned.");
        }else{
            System.out.println("\nThe user "+user.getName()+" has never borrowed the book \""+book.getTitleString()+"\".");
        }
    }
}


