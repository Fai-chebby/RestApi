package demo.example.userapplication.repository;

import demo.example.userapplication.User.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class userRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    User user;

    @BeforeEach
    void setUp() {
        user= new User("1","Rop","uas","1234");

    }

    @AfterEach
    void tearDown() {

    }
}
