import java.util.Scanner;

public class FinalProcess {

    public  static void finalProcess(){
    final Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("\nHow can we help you?");
        System.out.println("Enter the number for the command.");
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("1. Register");
        System.out.println("2. UserHistory");
        System.out.println("3. Look Up");
        System.out.println("4. Loan Books");
        System.out.println("5. Return Books");
        System.out.println("6. Exit");
        System.out.println("* * * * * * * * * * * * \n");

        System.out.println("Your input: ");
        String command = scanner.nextLine();

        switch(command){
            case "1":
                System.out.println("Enter your name: ");
                String name1 = scanner.nextLine();
                User.userRegister(name1);
                System.out.println("You have registered your name!");
                break;
            case "2":
                System.out.println("Enter your name: ");
                String name2 = scanner.nextLine();
                UserHistory.userHistory(name2);
                break;
            case "3":
                System.out.println("How do you want to look up your book?");
                System.out.println("1. Book Title");
                System.out.println("2. Author");
                System.out.println("3. ISBN Code");
                System.out.println("Type \"All\" if you want to look at all the books in our collection");
                System.out.println("Enter the command number: ");
                String command2 = scanner.nextLine();
                FinalLookUp.finalLookUp(command2);
                break;
            case "4":
                System.out.println("Enter your name: ");
                String userName = scanner.nextLine();
                System.out.println("Enter ISBN of the book to loan: ");
                String isbn = scanner.nextLine();
                User user = User.findUserByName(userName);
                Books book = Books.findBookByISBN(isbn);
                Loan.loanBooks(user , book);
                break;
            case "5":
                System.out.println("Enter your name: ");
                String returnerName = scanner.nextLine();
                System.out.println("Enter ISBN of the book you want to return: ");
                String ISBN = scanner.nextLine();
                User returnUser = User.findUserByName(returnerName);
                Books returnBook = Books.findBookByISBN(ISBN);
                Loan.returnBooks(returnUser, returnBook);
                break;
            case "6":
                return;
            default:
                System.out.println("Invalid option. Please try again");
        
            }  
        }

}
}