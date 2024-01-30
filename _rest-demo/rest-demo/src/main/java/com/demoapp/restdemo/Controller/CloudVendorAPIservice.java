package com.demoapp.restdemo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoapp.restdemo.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIservice {
	
	CloudVendor cloudVendor;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudvendorDetails( @PathVariable String vendorId) {
	return  cloudVendor;
	 //(  "c1", "vendor 1", "Address one","xxxx");	
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	    this.cloudVendor = cloudVendor;
	    return "Cloud vendor created successfully";
	}

	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	    this.cloudVendor = cloudVendor;
	    return "Cloud vendor updated successfully";
	}

	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails ( String vendorId) {
		this.cloudVendor =null;
		return " cloud vendor Deleted successfuly";
	}

}
 