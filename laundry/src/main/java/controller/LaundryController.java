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
        return (LaundryApplication) laundryService.getUser(LaundryId);
    }
    @GetMapping()
    public LaundryApplication getAllLaundryApplicationDetails(){
        return (LaundryApplication) laundryService.getUser();
    }
    @PostMapping


}