package demo.example.userapplication.controller;

import demo.example.userapplication.User.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserAPIService {
    @GetMapping("/{userid}") // Use curly braces for path variable
    public user getUserDetails(@PathVariable String userid){ // Add @PathVariable annotation

        return new user("C1", "User1", "Address 1", "567");
    }
}
