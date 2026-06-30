package com.demo.first.app;

import com.demo.first.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Map<Integer, User> userDb = new HashMap<>();

    @PostMapping
    public String createUser(@RequestBody User user) {
        userDb.putIfAbsent(user.getId(), user);
        return "User Created";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        if (userDb.containsKey(user.getId())) {
            userDb.put(user.getId(), user);
        }
        return "User Updated Successfully ";
    }
}
