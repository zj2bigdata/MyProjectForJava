package smp.customer;

public class Customer {
	private String loginname;
	private String loginpwd;
	
	public Customer(String loginname,String loginpwd){
		this.loginname=loginname;
		this.loginpwd=loginpwd;
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
