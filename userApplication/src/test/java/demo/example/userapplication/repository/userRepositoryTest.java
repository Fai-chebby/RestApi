package demo.example.userapplication.repository;

import demo.example.userapplication.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class userRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    User user;
}
