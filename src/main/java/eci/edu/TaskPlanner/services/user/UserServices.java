package eci.edu.TaskPlanner.services.user;

import eci.edu.TaskPlanner.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServices implements UserService{

    private static ArrayList<User> users = new ArrayList<>(Arrays.asList(new User("Juan","juan@mail","1"),new User("David","david@mail","2")));

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        User ans = null;
        for(User u: users){
            if(u.getId().equals(userId)){
                ans = u;
            }
        }
        return ans;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void remove(String userId) {
        int index = -1;
        for(User u: users){
            if(u.getId().equals(userId)){
                index = users.indexOf(u);
            }
        }
        if(index>=0){
            users.remove(index);
        }
    }
}
