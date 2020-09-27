package eci.edu.TaskPlanner.services.user;

import eci.edu.TaskPlanner.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
