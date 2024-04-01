package Service;

import java.util.List;

public class LaundryService implements Laundry{
    @Override
    public String createUser(Laundry laundry) {
        return null;
    }

    @Override
    public String updateUser(Laundry laundry) {
        return null;
    }

    @Override
    public String deleteUser(String laundryId) {
        return null;
    }

    @Override
    public Laundry getUser(String laundryId) {
        return null;
    }

    @Override
    public List<Laundry> getAllUsers() {
        return Laundry.super.getAllUsers();
    }
}
