package com.pojo;

import java.util.List;

public class Area {
	private String areaId;
	private String areaName;
	private String p_areaId;
	private List<Product> productList;
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getP_areaId() {
		return p_areaId;
	}
	public void setP_areaId(String p_areaId) {
		this.p_areaId = p_areaId;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
