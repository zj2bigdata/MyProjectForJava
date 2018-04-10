package com.pojo;

import java.io.Serializable;

public class Shop implements Serializable{

	private static final long serialVersionUID = 1L;
	private String shopId;
	private String shopName;
	private String shopAddress;
	private String contact;
	
	public Shop(){}
	
	public Shop(String shopId,String shopName,String shopAddress,String contact){
		this.shopId=shopId;
		this.shopName=shopName;
		this.shopAddress=shopAddress;
		this.contact=contact;
	}
	
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
