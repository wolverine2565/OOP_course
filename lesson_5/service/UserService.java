package homeLesson5.service;

import java.util.List;

import homeLesson5.model.User;

public interface UserService {
     void saveUser(User user);

     void removeUser(String user);

     void updateUser(int index, User user);

     void inDeposits(String name, Double cash);
     void outDeposits(String name, Double cash);

     List<User> getUserList();
}
