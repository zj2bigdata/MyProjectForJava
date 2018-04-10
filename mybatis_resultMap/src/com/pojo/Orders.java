package com.pojo;

import java.util.List;

public class Orders {
	private String ordersId;
	private String customerId;
	private String ordersDate;
	private String delivertDate;
	private String amount;
	private Customer customer;
	private List<OrdersDetail> ordeList;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(String ordersId) {
		this.ordersId = ordersId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}
	public String getDelivertDate() {
		return delivertDate;
	}
	public void setDelivertDate(String delivertDate) {
		this.delivertDate = delivertDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public List<OrdersDetail> getOrdeList() {
		return ordeList;
	}
	public void setOrdeList(List<OrdersDetail> ordeList) {
		this.ordeList = ordeList;
	}
	
	
}
