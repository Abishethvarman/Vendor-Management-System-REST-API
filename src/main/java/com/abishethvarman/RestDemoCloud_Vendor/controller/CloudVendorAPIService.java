package com.abishethvarman.RestDemoCloud_Vendor.controller;

import com.abishethvarman.RestDemoCloud_Vendor.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return  cloudVendor;
//       return new CloudVendor("C1","name1","ph1", "re");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor successfully created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully.";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetailsByID(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor deleted successfully.";
    }
}
