package com.demo.first.app;

import com.demo.first.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Map<Integer, User> userDb = new HashMap<>();

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userDb.putIfAbsent(user.getId(), user);
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        if (!userDb.containsKey(user.getId())) {
           return ResponseEntity.notFound().build();
        }
        userDb.put(user.getId(), user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        if(!userDb.containsKey(id)) return ResponseEntity.notFound().build() ;
        userDb.remove(id);
//        return ResponseEntity.ok("User Deleted");
        return ResponseEntity.noContent().build(); // no content
    }

    @GetMapping
    public List<User> getUsers(){
        return new ArrayList<>(userDb.values());
    }

//    @GetMapping({"/users", "/user/{id}"})

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(value = "userId", required = false) int id){
        if (!userDb.containsKey(id)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDb.get(id));
    }

    // demo for multiple PathVariable
    @GetMapping("/{userId}/orders/{orderId}")
    public ResponseEntity<User> getUserOrder(
            @PathVariable("userId") int id,
            @PathVariable int orderId
    ){
        System.out.println("ORDER ID: " +orderId);
        if (!userDb.containsKey(id)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDb.get(id));
    }


    // /search?name=john
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUser(
            @RequestParam(required = false, defaultValue = "Alice") String name,
            @RequestParam(required = false, defaultValue = "alice@gmail.com") String email
    ){
        System.out.println(name);


        List<User> users = userDb.values().stream()
                .filter(user -> name == null || user.getName().equalsIgnoreCase(name))
                .filter(user -> email == null || user.getEmail().equalsIgnoreCase(email))
                .toList();
        return ResponseEntity.ok(users);
    }
}
