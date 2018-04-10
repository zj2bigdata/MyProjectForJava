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
	
	//显示数据
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
		//修改学员信息 跟新 UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
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
		//删除数据
		public boolean deleteS(String s){
			String sql="delete from stu where stuid=?";//插入
			try {
				con=DBUtils.getConnection();
				ps=con.prepareStatement(sql);
				ps.setString(1,s);
				int row=ps.executeUpdate();//用于插入,返回int类型
				if(row>0){
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				DBUtils.close(rs, ps, con);
			}
			return false;	
		}
}
