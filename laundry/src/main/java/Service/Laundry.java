package Service;

import demo.example.laundry.LaundryApplication;

import java.util.List;

public interface Laundry {
    public String createLaundryApplication(LaundryApplication laundryApplication);

    public String updateLaundryApplication(LaundryApplication laundryApplication);

    public String deleteLaundryId(String laundryId);

    public Laundry getLaundryId(String laundryId);

    public default List<Laundry> getAllLaundryApplication() {
        return null;
    }

    LaundryApplication getUser(String userId);

    List<LaundryApplication> getAllUsers();
}