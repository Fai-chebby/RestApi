package demo.example.userapplication.repository;

import demo.example.userapplication.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User, String>{
    List<User>findByUserNames (String userNames);
}
