package smp.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.utils.MybatisUtils;

import smp.customer.Customer;
import smp.customerDao.CustomerIF;

public class test {

	public static void main(String[] args) {
		SqlSession ss=null;
		InputStream inputStream=null;
		try {
			String resource = "resources/mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			ss=sqlSessionFactory.openSession();
			CustomerIF cif=ss.getMapper(CustomerIF.class);
			List<Customer> list=cif.queryAllCustomer();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				inputStream.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
