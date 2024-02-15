package demo.example.userapplication.repository;

import demo.example.userapplication.User.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class userRepositoryTest {
    // given
    @Autowired
    private UserRepository userRepository;
    User user;

    @BeforeEach
    void setUp() {
        user= new User("1","Rop","uas","1234");
     userRepository.save(user);
    }

    @AfterEach
    void tearDown() {
        user=null;
        userRepository.deleteAll();

    }
    // test case success
    @Test
    void testFindByVendorName_Found()
    {
       List<User>userList=  userRepository.findByUserNames("Rop");
       assertThat(userList.get(0).getUserId()).isEqualTo(user.getUserId());
       assertThat(userList.get(0).getUserAddress()).isEqualTo(user.getUserAddress());
       
    }
    // Test case fail
}
