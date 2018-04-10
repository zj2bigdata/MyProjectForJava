package com.pojo;

public class Shop {
	private String shopId;
	private String shopName;
	private String shopAddress;
	private String Contact;
	public Shop() {
		System.out.println("Shop()");
	}
		public Shop(String shopId,String shopName,String shopAddress,String Contact) {
			this.shopId=shopId;
			this.shopName=shopName;
			this.shopAddress=shopAddress;
			this.Contact=Contact;
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
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", Contact="
				+ Contact + "]";
	}
	
	
}
