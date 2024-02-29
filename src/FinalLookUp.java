import java.util.Scanner;

public class FinalLookUp {
    public static void finalLookUp(String command){

        Scanner scanner = new Scanner(System.in);
        switch(command){
            case "1":
                System.out.println("Enter the book title: ");
                String title = scanner.nextLine();
                LookUpTitle.lookUpTitle(Main.hashBooks, title);
                break;
            case "2":
                System.out.println("Enter the book author: ");
                String author = scanner.nextLine();
                LookUpAuthor.lookUpAuthor(Main.hashBooks, author);
                break;
             case "3":
                System.out.println("Enter the book title: ");
                String ISBN = scanner.nextLine();
                LookUpISBN.lookUpISBN(Main.hashBooks, ISBN);
                break;
            case "All":
                for(Books book: Main.hashBooks){
                    System.out.println(book);
                }
        }
    }
}
