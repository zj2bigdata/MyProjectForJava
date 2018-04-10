package smp.customer;

public class Customer {
	private String customerid;
	private String loginname;
	private String loginpwd;
	
	public Customer(){}
	public Customer(String customerid,String loginname,String loginpwd){
		this.customerid=customerid;
		this.loginname=loginname;
		this.loginpwd=loginpwd;
	}


	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLoginpwd() {
		return loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	
}
