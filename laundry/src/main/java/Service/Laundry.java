package Service;

import demo.example.laundry.LaundryApplication;

import java.util.List;

public interface Laundry {
    public String createLaundryApplication(LaundryApplication laundryApplication);

    public String updateLaundryApplication(LaundryApplication laundryApplication);

    public String deleteLaundryId(String laundryId);

    public LaundryApplication getLaundryId(String laundryId);

    public default List<LaundryApplication> getAllLaundryApplication() {
        return null;
    }


    List<LaundryApplication> getAllUsers();
}