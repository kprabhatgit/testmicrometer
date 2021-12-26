package com.prabhat.testmicrometer.model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@JsonInclude(value =Include.NON_EMPTY)
public class AddressInfo implements Serializable {
 private String addressId;
 private String street;
 private String houseNumber;
 private String addressLine1;
 private String zip;
 
 public AddressInfo() {
	 
 }

public AddressInfo(String addressId, String street, String houseNumber, String addressLine1, String zip) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.houseNumber = houseNumber;
	this.addressLine1 = addressLine1;
	this.zip = zip;
}

public String getAddressId() {
	return addressId;
}

public void setAddressId(String addressId) {
	this.addressId = addressId;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getHouseNumber() {
	return houseNumber;
}

public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}

public String getAddressLine1() {
	return addressLine1;
}

public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
}

@Override
public int hashCode() {
	return Objects.hash(addressId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AddressInfo other = (AddressInfo) obj;
	return Objects.equals(addressId, other.addressId);
}

@Override
public String toString() {
	ObjectMapper objectMpper = new ObjectMapper();
	try {
		  return  objectMpper.writeValueAsString(this);
	}catch(JsonProcessingException jpe) {
		jpe.printStackTrace();
	}
	return "";
}

	
}
