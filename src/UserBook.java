public class UserBook {
    
    Books book;
    User user;

    public UserBook(User user, Books book){
         this.book= book;
         this.user = user;
    }

    public String getUserName(){
        return user.getName();
    }

    public String toString(){
        return this.book.getTitleString();
    }

}
