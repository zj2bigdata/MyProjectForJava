package com.pojo;

import java.util.List;

public class Product {
	private String productId;
	private String areaId;
	private String categoryId;
	private String shopId;
	private String title;
	private String productDesc;
	private String originalPrice;
	private String currentPrice;
	private String picture;
	private String iscommEnd;
	private String saleScount;
	private Shop shop;
	private List<OrdersDetail> odList;
	private Category category;
	private Area area;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getIscommEnd() {
		return iscommEnd;
	}
	public void setIscommEnd(String iscommEnd) {
		this.iscommEnd = iscommEnd;
	}
	public String getSaleScount() {
		return saleScount;
	}
	public void setSaleScount(String saleScount) {
		this.saleScount = saleScount;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<OrdersDetail> getOdList() {
		return odList;
	}
	public void setOdList(List<OrdersDetail> odList) {
		this.odList = odList;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
