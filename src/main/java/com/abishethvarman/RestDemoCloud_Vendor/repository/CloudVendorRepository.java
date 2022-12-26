package com.abishethvarman.RestDemoCloud_Vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abishethvarman.RestDemoCloud_Vendor.model.CloudVendor;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
    List<CloudVendor> findByVendorName(String vendorName);
}
