package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.rest.spring.learnrestdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1", "Vendor 1", 
        "Jl. Suryopranoto No. 1", "021843721");

    }
    
}
