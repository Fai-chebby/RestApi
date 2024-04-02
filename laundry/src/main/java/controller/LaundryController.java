package controller;

import Service.LaundryService;
import demo.example.laundry.LaundryApplication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("Laundry")
public class LaundryController {
    LaundryService laundryService;

    @GetMapping("/{LaundryId}")
    public LaundryApplication getLaundryApplicationDetails(@PathVariable String LaundryId){
        return (LaundryApplication) laundryService.getLaundryId(LaundryId);
    }

    @GetMapping()
    public Iterable<LaundryApplication> getAllLaundryApplicationDetails(){
        return laundryService.getAllLaundryApplication();
    }

    @PostMapping
    public String createLaundryApplicationDetails(@RequestBody LaundryApplication laundryApplication){
        laundryService.createLaundryApplication();
        return "LaundryApplication created successfully";
    }

    @PutMapping("/{LaundryId}")
    public String updateLaundryApplicationDetails(@PathVariable String LaundryId, @RequestBody LaundryApplication laundryApplication){
        laundryApplication.setId(LaundryId); // Assuming you need to set the ID for update
        laundryService.update(laundryApplication);
        return "LaundryApplication updated successfully";
    }

    @DeleteMapping("/{LaundryId}")
    public String deleteUserDetails(@PathVariable String LaundryId) {
        laundryService.deleteLaundryApplication(LaundryId);
        return "User Deleted Successfully";
    }
}
