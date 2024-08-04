package INTERVIEW_QUESTION.SPLITWISE.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController(){
        userList = new ArrayList<>();
    }

    //add User
    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(String userId){
        for(User user : userList){
            if(user.getUserId().equalsIgnoreCase(userId)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return userList;
    }

}
