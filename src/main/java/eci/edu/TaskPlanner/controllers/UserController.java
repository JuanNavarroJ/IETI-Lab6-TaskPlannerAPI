package eci.edu.TaskPlanner.controllers;

import eci.edu.TaskPlanner.model.User;
import eci.edu.TaskPlanner.services.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServices uService;

    @GetMapping("/users")
    public List<User> getAll() {
        return uService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") String id) {
        return uService.getById(id);
    }

    @PostMapping("/users")
    public User create(@RequestBody User newUser) {
        return uService.create(newUser);
    }

    @PutMapping("/users")
    public User update(@RequestBody User newUser) {
        return uService.update(newUser);
    }

    @DeleteMapping("/users/{id}")
    void remove(@PathVariable String id) {
        uService.remove(id);
    }

}
