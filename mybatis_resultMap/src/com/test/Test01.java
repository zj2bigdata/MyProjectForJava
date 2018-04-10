package com.test;

import java.util.List;
import org.junit.Test;

import com.pojo.Category;
import com.pojo.Customer;
import com.pojo.Orders;
import com.pojo.OrdersDetail;
import com.pojo.Product;
import com.service.CategoryService;
import com.service.CustomerService;
import com.service.OrdersService;
import com.service.ProductService;


public class Test01 {
	private CustomerService cs=new CustomerService();
	private OrdersService os=new OrdersService();
	private ProductService ps=new ProductService();
	private CategoryService cys=new CategoryService();
	//查询所有数据(客户名下所有订单信息)
	@Test
	public void one2Many(){
		List<Customer> clist=cs.one2Many();
		for(Customer c:clist){
			System.out.println(c.getCustomerName());
			for(Orders o:c.getOrdersList()){
				System.out.println(o.getCustomerId()+"--"+o.getOrdersDate());
			}
		}
	}
	//查询所有数据(产品所在地址信息)
		@Test
		public void many2One(){
			List<Product> plist=ps.many2One();
			for(Product p:plist){
				System.out.println(p.getProductId()+"--"+p.getTitle()+"--"+p.getShop().getShopName()+"--"+p.getShop().getShopAddress());
			}
		}
		//查询所有数据(订单对应客户信息)
		@Test
		public void many2One2(){
			List<Orders> olist=os.many2One();
			for(Orders o:olist){
				System.out.println(o.getOrdersId()+"--"+o.getCustomer().getCustomerId()+"--"+o.getCustomer().getCustomerName()+"--"+o.getOrdersDate());
			}
		}
		
		@Test
		public void many2Many(){
			List<Customer> clist=cs.many2Many();
			for(Customer c:clist){
				System.out.println(c.getCustomerName());
				System.out.println("订单号"+"\t"+"订单日期"+"\t"+"数量"+"\t\t"+"商品"+"\t\t"+"价格"+"\t"+"数量"+"\t\t"+"商品"+"\t\t\t"+"价格");
				for(Orders o:c.getOrdersList()){
					System.out.print(o.getOrdersId()+"\t"+o.getOrdersDate());
					for(OrdersDetail od:o.getOrdeList()){
						System.out.print("\t"+od.getQuantity()+"\t"+od.getProduct().getTitle()+"\t"+od.getProduct().getCurrentPrice());
					}
					System.out.println();
				}
			}
		}
		@Test
		public void many2Many2(){
			List<Category> clist=cys.many2Many();
			for(Category c:clist){
				System.out.print(c.getCategoryId()+"--"+c.getCategoryName());
				for(Product p:c.getProductList()){
					System.out.println(p.getTitle()+"--"+p.getProductDesc()+"--"+p.getArea().getAreaName());
				}
				System.out.println();
			}
		}
	
}
