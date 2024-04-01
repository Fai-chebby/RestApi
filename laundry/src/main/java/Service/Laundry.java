package Service;

import demo.example.laundry.LaundryApplication;

import java.util.List;

public interface Laundry {
    public String createUser(LaundryApplication laundryApplication);

    public String updateUser(LaundryApplication laundryApplication);

    public String deleteUser(String laundryId);

    public Laundry getUser(String laundryId);

    public default List<Laundry> getAllUsers() {
        return null;
    }
}