package demo.example.userapplication.Service;

import demo.example.userapplication.User.User;
import demo.example.userapplication.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class userImplementationTestS {
    @Mock
    private UserRepository userRepository;
    private UserService userService;
    AutoCloseable autoCloseable;
    User user;

    @BeforeEach
    void setUp() {
        autoCloseable= MockitoAnnotations.openMocks(this);
        userService =new UserServiceImplimentation(userRepository);
        user=new User("1","ROP","USA","12330");
    }

    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    @Test
    void createUser() {
        mock(User.class);
        mock(UserRepository.class);

        when(userRepository.save(user)).thenReturn(user);
        assertThat(userService.createUser(user)).isEqualTo("Success")
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void getUser() {
    }

    @Test
    void getAllUsers() {
    }
}