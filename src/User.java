import java.util.ArrayList;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static User findUserByName(String name) {
        for (User user : users) { 
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null; 
    }

    public static ArrayList<User> users = new ArrayList<>();

    public static void userRegister(String name){
        for (User user : users) { 
            if (user.getName().equalsIgnoreCase(name)) {
                System.out.println("Please use a different name. There already exists a user with this name.");
                return;
            }
        }
        users.add(new User(name));
    }
}
