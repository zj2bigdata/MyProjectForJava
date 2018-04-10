package smp.studentDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.utils.MybatisUtils;

import smp.student.Student;

public class StudentDao {

	
	public boolean insertSingleStudent(Student s){
		SqlSession sse=null;
		try {
			sse=MybatisUtils.getSsf();
			StudentIF sif=sse.getMapper(StudentIF.class);
			boolean f=sif.insertSingleStudent(s);
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
	
	//显示数据
		public List<Student> queryAllStudent(){
			SqlSession sse=null;
			try {
				sse=MybatisUtils.getSsf();
				StudentIF sif=sse.getMapper(StudentIF.class);
				return sif.queryAllStudent();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(sse);
			}
			
			return null;
		}
		//修改学员信息 跟新 UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
		public boolean updateSingleStudent(Student s){
			SqlSession sse=null;
			try {
				sse=MybatisUtils.getSsf();
				StudentIF sif=sse.getMapper(StudentIF.class);
				if(sif.updateSingleStudent(s)){
					sse.commit();
					return true;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				MybatisUtils.closeSession(sse);
			}
			return false;
			
		}
		//删除数据
		public boolean deleteSingleStudent(String s){
			SqlSession sse=null;
			try {
				sse=MybatisUtils.getSsf();
				StudentIF sif=sse.getMapper(StudentIF.class);
				if(sif.deleteSingleStudent(s)){
					sse.commit();
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//5.关闭资源
				MybatisUtils.closeSession(sse);
			}
			return false;	
		}
}
