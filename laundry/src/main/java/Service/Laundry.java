package Service;

import demo.example.laundry.LaundryApplication;

import java.util.List;

public interface Laundry {
    public String createUser(Laundry laundry);

    public String updateUser(Laundry laundry);

    public String deleteUser(String laundryId);

    public Laundry getUser(String laundryId);

    public default List<Laundry> getAllUsers() {
        return null;
    }
}