import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class FileReader {

    public static void readFileToSet(HashSet<Books> hashBooks, String filePath){
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line != null && !line.trim().isEmpty()){
                String[] arr = line.split(", ");
                if(arr.length == 3) {
                  Books book = new Books(arr[0], arr[1], arr[2]);
                  hashBooks.add(book);
                }
                else System.out.println("\nThe provided file has error in this book: " + arr[0]);
                }
    }
            
        } catch (FileNotFoundException e) {
            System.out.println("\nThere is an error reading this file!");
        }
    }

}