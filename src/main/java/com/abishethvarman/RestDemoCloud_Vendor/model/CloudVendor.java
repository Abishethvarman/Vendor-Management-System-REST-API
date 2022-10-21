package com.abishethvarman.RestDemoCloud_Vendor.model;

//the data model for the cloud vendor service
public class CloudVendor {
    private String vendorId;
    private String vendorName;
    private String vendorPhone;
    private String vendorAddress;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorPhone, String vendorAddress) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorPhone = vendorPhone;
        this.vendorAddress = vendorAddress;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
}
