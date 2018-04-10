package page.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.utils.DBUtils;

import page.page.Page;
import page.product.Product;

public class PageDao {
	private Connection con;//与特定数据库的连接（会话）。在连接上下文中执行 SQL 语句并返回结果。
	private PreparedStatement ps;//表示预编译的 SQL 语句的对象
	private ResultSet rs;
	
	public int countProduct(){
		String sql=" select count(*) from product";//插入
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()){
				//以 Java 编程语言中 int 的形式检索此 ResultSet 对象的当前行中指定列的值。
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//5.关闭资源
			DBUtils.close(rs, ps, con);
		}
		return 0;	
	}
	
	public List<Product> qureyPage(Page p){
		StringBuffer s=new StringBuffer();
		s.append("select * from (select t.*,rownum rn ")
		.append("from (select * from product) t)")
		.append("where rn between ? and ?");
		List<Product> list=new ArrayList<Product>();
		try {
			//2.获取数据库链接对象
			con=DBUtils.getConnection();
			//3.获取预处理会话对象  
			//创建一个 PreparedStatement 对象来将参数化的 SQL 语句发送到数据库。
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(s.toString());
			ps.setInt(1,p.getStart());
			ps.setInt(2,p.getEnd());
			//4.执行预处理对象，获取结果集对象
			rs=ps.executeQuery();//select语句使用该方法
			while(rs.next()){
				String pId=rs.getString("productid");
				String title=rs.getString("title");
				Product product=new Product(pId,title);
				list.add(product);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.关闭资源
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
}
