package smp.studentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import smp.student.Student;
import smp.utils.DBUtils;

public class StudentDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public boolean insertS(Student s){
		String sql="insert into STU values(SEQ_STUDENT_STUID.nextval,?,?,?,to_date(?,'yyyy-mm-dd'))";
		try {
			con=DBUtils.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,s.getName());
			ps.setString(2,s.getGender());
			ps.setString(3,s.getAge());
			ps.setString(4,s.getBirthday());
			int row=ps.executeUpdate();
			if(row!=0){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.close(rs, ps, con);
		}
		return false;
	}
	
	//��ʾ����
		public List<Student> queryAllS(){
			List<Student> list=new ArrayList<Student>();
			String sql="select * from stu";
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()){
					String stuid=rs.getString("stuid");
					String name=rs.getString("name");
					String gender=rs.getString("gender");
					String age=rs.getString("age");
					String birthday=rs.getString("birthday");
					Student s=new Student(stuid,name,gender,age,birthday);
					list.add(s);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				DBUtils.close(rs, ps, con);
			}
			return list;
		}
		//�޸�ѧԱ��Ϣ ���� UPDATE ������ SET ������ = ��ֵ WHERE ������ = ĳֵ
		public boolean changeS(Student s,String stuid){
			String sql="update stu set name=?,gender=?,age=?,birthday=to_date(?,'yyyy-mm-dd') where stuid=?";
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,s.getName());
				ps.setString(2,s.getGender());
				ps.setString(3,s.getAge());
				ps.setString(4,s.getBirthday());
				ps.setString(5,stuid);
				int row=ps.executeUpdate();
				if(row!=0){
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				DBUtils.close(rs, ps, con);
			}
			
			return false;
			
		}
		//ɾ������
		public boolean deleteS(String s){
			String sql="delete from stu where stuid=?";//����
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,s);
				int row=ps.executeUpdate();//���ڲ���,����int����
				if(row>0){
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.�ر���Դ
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
}
