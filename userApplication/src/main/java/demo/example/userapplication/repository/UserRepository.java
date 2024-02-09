package demo.example.userapplication.repository;

import demo.example.userapplication.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String>{
}
