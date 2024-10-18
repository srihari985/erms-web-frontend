package com.erms.ERMS_Application.Quotation.AddParty;

import com.erms.ERMS_Application.Authentication.sales.Sales;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="addParty")

public class AddPartyEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long adId;	
	private String customerName;
	private String mobileNumber;
	private String billingAddress;
	private String state;
	private long pincode;
	private String city;
	private String shippingAddress;
	private String shippingState;
	private long shippingPincode;
	private String shippingCity;
	private String gstIn;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Sales sales;
	
	
	public long getAdId() {
		return adId;
	}
	public void setAdId(long adId) {
		this.adId = adId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingState() {
		return shippingState;
	}
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	public long getShippingPincode() {
		return shippingPincode;
	}
	public void setShippingPincode(long shippingPincode) {
		this.shippingPincode = shippingPincode;
	}
	public String getShippingCity() {
		return shippingCity;
	}
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}
	public String getGstIn() {
		return gstIn;
	}
	public void setGstIn(String gstIn) {
		this.gstIn = gstIn;
	}
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	public AddPartyEntity(long adId, String customerName, String mobileNumber, String billingAddress, String state,
			long pincode, String city, String shippingAddress, String shippingState, long shippingPincode,
			String shippingCity, String gstIn, Sales sales) {
		super();
		this.adId = adId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.billingAddress = billingAddress;
		this.state = state;
		this.pincode = pincode;
		this.city = city;
		this.shippingAddress = shippingAddress;
		this.shippingState = shippingState;
		this.shippingPincode = shippingPincode;
		this.shippingCity = shippingCity;
		this.gstIn = gstIn;
		this.sales = sales;
	}
	public AddPartyEntity() {
		super();
	}
	
	
	
	
	
	


}
