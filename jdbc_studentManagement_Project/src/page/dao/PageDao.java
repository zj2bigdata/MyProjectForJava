package page.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import page.page.Page;
import smp.student.Student;
import smp.utils.DBUtils;

public class PageDao {
	private Connection con;//���ض����ݿ�����ӣ��Ự������������������ִ�� SQL ��䲢���ؽ����
	private PreparedStatement ps;//��ʾԤ����� SQL ���Ķ���
	private ResultSet rs;
	
	public int countProduct(){
		String sql=" select count(*) from product";//����
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()){
				//�� Java ��������� int ����ʽ������ ResultSet ����ĵ�ǰ����ָ���е�ֵ��
				return rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//5.�ر���Դ
			DBUtils.close(rs, ps, con);
		}
		return 0;	
	}
	
	public List<Student> qureyPage(Page p){
		StringBuffer s=new StringBuffer();
		s.append("select * from (select t.*,rownum rn ")
		.append("from (select * from product) t)")
		.append("where rn between ? and ?");
		List<Student> list=new ArrayList<Student>();
		try {
			//2.��ȡ���ݿ����Ӷ���
			con=DBUtils.getConnection();
			//3.��ȡԤ����Ự����  
			//����һ�� PreparedStatement ���������������� SQL ��䷢�͵����ݿ⡣
			//prepareStatement(String sql)throws SQLException
			ps=con.prepareStatement(s.toString());
			ps.setInt(1,p.getStart());
			ps.setInt(2,p.getEnd());
			//4.ִ��Ԥ������󣬻�ȡ���������
			rs=ps.executeQuery();//select���ʹ�ø÷���
			while(rs.next()){
				String stuid=rs.getString("stuid");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String age=rs.getString("age");
				String birthday=rs.getString("birthday");
				Student student=new Student(stuid,name,gender,age,birthday);
				list.add(student);
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//5.�ر���Դ
			DBUtils.close(rs, ps, con);
		}
		return list;
	}
}
