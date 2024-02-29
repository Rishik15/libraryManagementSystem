import java.util.HashSet;

public class Main {

    public static HashSet<Books> hashBooks = new HashSet<>();

    public static void main(String[] args) {

        String filePath = "/Users/nikhilareddy/Documents/Rishik/Projects/LibraryManagementSystem/src/books.txt";
        FileReader.readFileToSet(hashBooks, filePath);

        System.out.println("\nWelcome to Rishik's Library!");
        FinalProcess.finalProcess();
        
        }
        
    }


