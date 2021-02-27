package com.CodeDifferently.demo.Controller;

import com.CodeDifferently.demo.Model.User;
import com.CodeDifferently.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findById(@PathVariable long id) {
        return ResponseEntity.ok().body(this.userService.findById(id));
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(this.userService.getAllUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return (ResponseEntity<User>) ResponseEntity.ok().body(this.userService.createUser(user));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id, User user) {
        return ResponseEntity.ok().body(this.userService.updateUser(id, user));
    }

    @DeleteMapping("/user/{id}")
        public HttpStatus deleteUser(@PathVariable long id){
        this.userService.deleteById(id);
        return HttpStatus.OK;
    }
}