package smp.customerDao;

import java.util.List;

import smp.customer.Customer;

public interface CustomerIF {
	 public List<Customer> queryAllCustomer();
	 public boolean insertSingleCustomer(Customer c);
}
