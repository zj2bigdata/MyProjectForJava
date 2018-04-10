package com.pojo;

import java.util.List;

public class Category {
	private String categoryId;
	private String categoryName;
	private String p_categoryId;
	private List<Product> productList;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getP_categoryId() {
		return p_categoryId;
	}
	public void setP_categoryId(String p_categoryId) {
		this.p_categoryId = p_categoryId;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
