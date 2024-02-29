import java.util.ArrayList;
import java.util.Map;

public class UserHistory {
    private UserBook userBook;
    private String dateTime;

    public UserHistory(UserBook userBook, String dateTime) {
        this.userBook = userBook;
        this.dateTime = dateTime;
    }


    public UserBook getUserBook() {
        return userBook;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Book = " + userBook +
                ", Date and Time = " + dateTime;
    }


    public static void userHistory(String userName) {
        User user = User.findUserByName(userName);
        if(!User.users.contains(user)) System.out.println("\nYou are not yet registered!");
        else{
        ArrayList<UserHistory> history = new ArrayList<>();
        for (Map.Entry<UserBook, String> entry : Loan.userhistory.entrySet()) {
            if (entry.getKey().getUserName().equals(userName)) {
                history.add(new UserHistory(entry.getKey(), entry.getValue()));
            }
        }
        System.out.println("");
        for(UserHistory his : history){
            System.out.println(his.toString());
        }
    }
        
    }
}
