package demo.example.userapplication.Service;

import demo.example.userapplication.User.User;

import java.util.List;

public interface UserService {
    public  String createUser( User user);
    public  String updateUser( User user);
    public  String deleteUser( String userId);
    public  String getUser( String userId);
    public List<User> getAllUsers();
}
