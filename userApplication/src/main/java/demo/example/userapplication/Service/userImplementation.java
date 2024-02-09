package demo.example.userapplication.Service;

import demo.example.userapplication.User.User;
import demo.example.userapplication.repository.UserRepository;

import java.util.List;

public class userImplementation implements UserService   {

    UserRepository userRepository;
    public userImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String deleteUser(String userId) {
        return null;
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
