package com.demo.first.app.controller;

import com.demo.first.app.model.User;
import com.demo.first.app.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
    private UserService userService = new UserService();
//    private Map<Integer, User> userDb = new HashMap<>();


    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updatedUser = userService.updateUser(user);
        if (updatedUser == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        boolean isDeleted = userService.deleteUser(id);
        if(!isDeleted)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        return ResponseEntity.ok("User Deleted");
        return ResponseEntity.noContent().build(); // no content
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

//    @GetMapping({"/users", "/user/{id}"})

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(value = "userId", required = false) int id){
        User user = userService.getUserById(id);
        if (user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user);
    }

    // demo for multiple PathVariable
    @GetMapping("/{userId}/orders/{orderId}")
    public ResponseEntity<User> getUserOrder(
            @PathVariable("userId") int id,
            @PathVariable int orderId
    ){
        User user = userService.getUserById(id);
        if (user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(user);
    }


    // /search?name=john
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUser(
            @RequestParam(required = false, defaultValue = "Alice") String name,
            @RequestParam(required = false, defaultValue = "alice@gmail.com") String email
    ){
        return ResponseEntity.ok(userService.search(name, email));
    }

    //Request Header
    @GetMapping("/info/{id}")
    public String getInfo(
            @PathVariable int id,
            @RequestParam String name,
            @RequestHeader("User-Agent") String userAgent
    ){
        System.out.println(userAgent);
        return "User Agent: " + userAgent
                + " : " + id
                + " : " + name;
    }
}
