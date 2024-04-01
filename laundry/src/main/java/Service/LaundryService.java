package Service;

import Repository.LaundryRepository;
import demo.example.laundry.LaundryApplication;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class LaundryService implements Laundry{

    LaundryRepository laundryRepository;


    @Override
    public String createUser(LaundryApplication laundryApplication) {
        laundryRepository.save(laundryApplication);
        return "Success";
    }

    @Override
    public String updateUser(LaundryApplication laundryApplication) {
        laundryRepository.save(laundryApplication);
        return "Success";
    }

    @Override
    public String deleteUser(String laundryId) {
        laundryRepository.deleteById(laundryId);
        return  "success";
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
