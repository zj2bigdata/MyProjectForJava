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
	//��ѯ��������(�ͻ��������ж�����Ϣ)
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
	//��ѯ��������(��Ʒ���ڵ�ַ��Ϣ)
		@Test
		public void many2One(){
			List<Product> plist=ps.many2One();
			for(Product p:plist){
				System.out.println(p.getProductId()+"--"+p.getTitle()+"--"+p.getShop().getShopName()+"--"+p.getShop().getShopAddress());
			}
		}
		//��ѯ��������(������Ӧ�ͻ���Ϣ)
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
				System.out.println("������"+"\t"+"��������"+"\t"+"����"+"\t\t"+"��Ʒ"+"\t\t"+"�۸�"+"\t"+"����"+"\t\t"+"��Ʒ"+"\t\t\t"+"�۸�");
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
