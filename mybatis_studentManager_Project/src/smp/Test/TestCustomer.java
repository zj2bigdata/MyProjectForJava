package smp.Test;


import java.util.List;
import java.util.Scanner;

import smp.customer.Customer;
import smp.customerDao.CustomerDao;
import smp.student.Student;
import smp.studentDao.StudentDao;

public class TestCustomer {
	private static CustomerDao cd=new CustomerDao();
	private static StudentDao sd=new StudentDao();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		start();
	}
	
	//显示菜单
	public static void start(){
		System.out.println("1.登录\t2.注册\t3.退出系统");
		System.out.print("请选择菜单:");
		int sel=sc.nextInt();
		switch (sel) {
		case 1:
			login();
			break;
		case 2:
			register();
			break;
		case 3:
			System.exit(0);
		default:
			break;
		}
	}
	//登录
	public static void login(){
		boolean f=true;
		while(f){
			System.out.print("请输入您的帐号:");
			String loginName=sc.next();
			System.out.print("请输入您的密码:");
			String loginPwd=sc.next();
			List<Customer> list=cd.queryAllCustomer();
			if(list.size()==0){
				System.out.println("抱歉,数据库无该用户,请注册!");
				start();
			}else{
				for(Customer c:list){
					if(loginName.equals(c.getLoginname())&&loginPwd.equals(c.getLoginpwd())){
						f=false;
					}
				}
				if(!f){
					System.out.println("登录成功!");
					break;
				}else{
					System.out.println("登陆失败,账号或密码错误,请重新选择!");
					start();
				}
			}
		}
		studentMenu();
	}
	//注册
	public static void register(){
		System.out.print("请输入注册帐号:");
		String loginName=sc.next();
		System.out.print("请输入注册密码:");
		String loginPwd=sc.next();
		Customer c=new Customer();
		c.setLoginname(loginName);
		c.setLoginpwd(loginPwd);
		if(cd.insertSingleCustomer(c)){
			System.out.println("注册成功！请选择下一步操作:");
			start();
		}else{
			System.out.println("注册失败！");
			start();
		}
	}
	
	public static void studentMenu(){
		System.out.println("1.添加学员\t2.显示学员\t3.修改学员\t4.删除学员\t5.退出操作");
		System.out.print("请选择菜单:");
		int sel=sc.nextInt();
		switch (sel) {
		case 1:
			addStudent();
			break;
		case 2:
			showStudentEnd();
			break;
		case 3:
			changeStudent();
		break;
		case 4:
			deleteStudent();
		break;
		default:
			start();
			break;
		}
	}
	//添加学员
	public static void addStudent(){
		boolean flag=true;
		while(flag){
			System.out.print("请输入学员姓名:");
			String name=sc.next();
			System.out.print("请输入学员性别:");
			String gender=sc.next();
			System.out.print("请输入学员年龄:");
			String age=sc.next();
			System.out.print("请输入学员生日:");
			String birthday=sc.next();
			Student s=new Student(name,gender,age,birthday);
			if(sd.insertSingleStudent(s)){
				System.out.print("添加成功!是否继续添加(y/n):");
				String select=sc.next();
				if("y".equals(select)){
					flag=true;
				}else{
					flag=false;
				}
			}else{
				System.out.println("添加失败！");
			}
		}
		studentMenu();
	}
	//展示学员信息
	public static void showStudent(){
		StudentDao sd=new StudentDao();
		List<Student> list=sd.queryAllStudent();
		System.out.println("--------------------学员信息表------------------------");
		System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t生日日期");
		for(Student s:list){
			System.out.println(s.getStuid()+"\t\t"+s.getName()+"\t\t"+s.getGender()+"\t\t"+s.getAge()+"\t\t"+s.getBirthday());
		}
		System.out.println("--------------------------------------------------------");
	}
	public static void showStudentEnd(){
		showStudent();
		studentMenu();
	}
	//修改学员信息
	public static void changeStudent(){
		showStudent();
		boolean flag=true;
		while(flag){
			System.out.print("请输入需要修改的学员编号:");
			String stuid=sc.next();
			System.out.print("请输入学员姓名:");
			String name=sc.next();
			System.out.print("请输入学员性别:");
			String gender=sc.next();
			System.out.print("请输入学员年龄:");
			String age=sc.next();
			System.out.print("请输入学员生日:");
			String birthday=sc.next();
			Student s=new Student(stuid,name,gender,age,birthday);
			if(sd.updateSingleStudent(s)){
				System.out.print("修改成功!是否继续修改(y/n):");
				String select=sc.next();
				if("y".equals(select)){
					flag=true;
				}else{
					flag=false;
				}
			}else{
				System.out.println("修改失败！");
			}
		}
		studentMenu();
	}
	//删除学员信息
	public static void deleteStudent(){
		showStudent();
		System.out.print("请输入需要删除的学员编号:");
		String select=sc.next();
		StudentDao sd=new StudentDao();
		System.out.print("是否确认删除?(y/n)");
		String sel2=sc.next();
		if("y".equals(sel2)){
			if(sd.deleteSingleStudent(select)){
				System.out.println("删除成功!");
			}else{
				System.out.println("删除失败！");
			}
			studentMenu();
		}else{
			studentMenu();
		}
}
	
}
