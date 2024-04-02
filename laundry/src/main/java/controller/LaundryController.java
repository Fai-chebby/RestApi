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
    private demo.example.laundry.LaundryApplication LaundryApplication;

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
        laundryService.createLaundryApplication(LaundryApplication);
        return "LaundryApplication created successfully";
    }

    @PutMapping("/{LaundryId}")
    public String updateLaundryApplicationDetails(@PathVariable String LaundryId, @RequestBody LaundryApplication laundryApplication){

        laundryService.updateLaundryApplication(LaundryApplication);
        return "LaundryApplication updated successfully";
    }

    @DeleteMapping("/{LaundryId}")
    public String deleteUserDetails(@PathVariable String LaundryId) {
        laundryService.deleteLaundryId(LaundryId);
        return "User Deleted Successfully";
    }
}
