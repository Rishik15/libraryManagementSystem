public class Books {
    private String title;
    private String author;
    private String ISBN;


    public Books(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitleString(){
        return title;
    }
    
    public String getAuthoString(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    @Override
    public String toString(){
        return "Title: "+title+", Author: "+author+", ISBN: "+ISBN;
    }

    public static Books findBookByISBN(String ISBN){
        for(Books book : Main.hashBooks){
            if(book.getISBN().equals(ISBN)) return book;
        }
        return null;
    }
}