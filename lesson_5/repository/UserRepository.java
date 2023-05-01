package homeLesson5.repository;

import homeLesson5.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository  {

    private List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        System.out.println("remove user");
        userList.remove(user);
    }

    public void updateUser(int index, User user) {
        userList.set(index, user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public User getUser(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}

// public void saveUser(User user){
// try(FileWriter fileWriter = new FileWriter("users.txt", true)){
// fileWriter.write(user.toString());

// }catch (Exception e){
// System.out.println("error in repo");
// }
// }
