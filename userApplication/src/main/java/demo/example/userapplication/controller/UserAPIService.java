package demo.example.userapplication.controller;

import demo.example.userapplication.User.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserAPIService {
    User user;
    @GetMapping("/{userid}") // Use curly braces for path variable
    public User getUserDetails(@PathVariable String userid){ // Add @PathVariable annotation

        return user;
        //new User("C1", "User1", "Address 1", "567");//
    }
    @PostMapping
    public  String createUserDetails(@RequestBody User user){
   this.user=user;
   return "User created Successfully";
    }
    @PutMapping
    public  String updateUserDetails(@RequestBody User user){
        this.user=user;
        return "User updated  Successfully";
    }
    public  String updateUserDetails(@RequestBody User user){
        this.user=user;
        return "User updated  Successfully";
    }
}
