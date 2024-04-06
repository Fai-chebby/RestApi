package Service;

import Repository.LaundryRepository;
import demo.example.laundry.LaundryApplication;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public abstract class LaundryService implements Laundry{

    LaundryRepository laundryRepository;



    @Override
    public String createLaundryApplication(LaundryApplication laundryApplication) {
        laundryRepository.save(laundryApplication);
        return "Success";
    }

    @Override
    public String updateLaundryApplication(LaundryApplication laundryApplication) {
        laundryRepository.save(laundryApplication);
        return "Success";
    }

    @Override
    public String deleteLaundryId(String laundryId) {
        laundryRepository.deleteById(laundryId);
        return  "success";
    }

    @Override
    public LaundryApplication getLaundryId(String LaundryId) {
        if (laundryRepository.findById(LaundryId).isEmpty())
            throw new LaundryApplicationNotFoundException("Requested LaundryApplication Does Not Exist");

        return laundryRepository.findById(LaundryId).get();
    }

    @Override
    public List<LaundryApplication> getAllLaundryApplication() {
        return laundryRepository.findAll();
    }
}
