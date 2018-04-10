package smp.customerDao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.utils.MybatisUtils;

import smp.customerDao.CustomerIF;
import smp.customer.Customer;

public class CustomerDao {
	//获取数据
	public List<Customer> queryAllCustomer(){
		SqlSession sse=null;
		try {
			sse=MybatisUtils.getSsf();
			CustomerIF cif=sse.getMapper(CustomerIF.class);
			return cif.queryAllCustomer();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(sse);
		}
		return null;
	}
	

	//插入数据
	public boolean insertSingleCustomer(Customer c){
		SqlSession sse=null;
		try {
			sse=MybatisUtils.getSsf();
			CustomerIF cif=sse.getMapper(CustomerIF.class);
			boolean f=cif.insertSingleCustomer(c);
			sse.commit();
			if(f){
				return  true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MybatisUtils.closeSession(sse);
		}
		return false;
	}
}
