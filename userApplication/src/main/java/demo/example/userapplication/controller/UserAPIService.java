package demo.example.userapplication.controller;

import demo.example.userapplication.Service.UserService;
import demo.example.userapplication.User.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserAPIService {
    UserService userService;

    public UserAPIService(UserService userService) {
        this.userService = userService;
    }

    User user = null;
    @GetMapping("/{userid}") // Use curly braces for path variable
    public User getUserDetails(@PathVariable String userid){ // Add @PathVariable annotation

        return userService.getUser(userid);
        //new User("C1", "User1", "Address 1", "567");//
    }
    // read all user details
    @GetMapping() // Use curly braces for path variable
    public List<User> getAllUserDetails(){ // Add @PathVariable annotation

        return userService.getAllUsers();
        //new User("C1", "User1", "Address 1", "567");//
    }
    @PostMapping
    public  String createUserDetails(@RequestBody User user){
   userService.createUser(user);
   return "User created Successfully";
    }
    @PutMapping
    public  String updateUserDetails(@RequestBody User user){
        userService.updateUser(user);
        return "User updated  Successfully";
    }
    @DeleteMapping("/{userid}")
    public String deleteUserDetails(@PathVariable String userid) {
        userService.deleteUser(userid); 
        // Implement code to delete user details for the specified userid
        // For example: userRepository.deleteByUserId(userid);
        return "User Deleted Successfully";
    }

}
