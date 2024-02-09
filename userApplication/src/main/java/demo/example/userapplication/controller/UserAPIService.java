package demo.example.userapplication.controller;

import demo.example.userapplication.User.user;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserAPIService {
    @GetMapping({"userid"})
    public user getUserDetails( String userid){

        return new user(" C1 ","User1","Address 1","567");
    }
}
