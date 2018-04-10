package com.dao;

import java.util.List;
import com.pojo.Customer;

public  interface CustomerMapper {
	List<Customer> one2Many();
	List<Customer> many2Many();
}
