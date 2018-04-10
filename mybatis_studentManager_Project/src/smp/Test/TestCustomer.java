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
	
	//��ʾ�˵�
	public static void start(){
		System.out.println("1.��¼\t2.ע��\t3.�˳�ϵͳ");
		System.out.print("��ѡ��˵�:");
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
	//��¼
	public static void login(){
		boolean f=true;
		while(f){
			System.out.print("�����������ʺ�:");
			String loginName=sc.next();
			System.out.print("��������������:");
			String loginPwd=sc.next();
			List<Customer> list=cd.queryAllCustomer();
			if(list.size()==0){
				System.out.println("��Ǹ,���ݿ��޸��û�,��ע��!");
				start();
			}else{
				for(Customer c:list){
					if(loginName.equals(c.getLoginname())&&loginPwd.equals(c.getLoginpwd())){
						f=false;
					}
				}
				if(!f){
					System.out.println("��¼�ɹ�!");
					break;
				}else{
					System.out.println("��½ʧ��,�˺Ż��������,������ѡ��!");
					start();
				}
			}
		}
		studentMenu();
	}
	//ע��
	public static void register(){
		System.out.print("������ע���ʺ�:");
		String loginName=sc.next();
		System.out.print("������ע������:");
		String loginPwd=sc.next();
		Customer c=new Customer();
		c.setLoginname(loginName);
		c.setLoginpwd(loginPwd);
		if(cd.insertSingleCustomer(c)){
			System.out.println("ע��ɹ�����ѡ����һ������:");
			start();
		}else{
			System.out.println("ע��ʧ�ܣ�");
			start();
		}
	}
	
	public static void studentMenu(){
		System.out.println("1.���ѧԱ\t2.��ʾѧԱ\t3.�޸�ѧԱ\t4.ɾ��ѧԱ\t5.�˳�����");
		System.out.print("��ѡ��˵�:");
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
	//���ѧԱ
	public static void addStudent(){
		boolean flag=true;
		while(flag){
			System.out.print("������ѧԱ����:");
			String name=sc.next();
			System.out.print("������ѧԱ�Ա�:");
			String gender=sc.next();
			System.out.print("������ѧԱ����:");
			String age=sc.next();
			System.out.print("������ѧԱ����:");
			String birthday=sc.next();
			Student s=new Student(name,gender,age,birthday);
			if(sd.insertSingleStudent(s)){
				System.out.print("��ӳɹ�!�Ƿ�������(y/n):");
				String select=sc.next();
				if("y".equals(select)){
					flag=true;
				}else{
					flag=false;
				}
			}else{
				System.out.println("���ʧ�ܣ�");
			}
		}
		studentMenu();
	}
	//չʾѧԱ��Ϣ
	public static void showStudent(){
		StudentDao sd=new StudentDao();
		List<Student> list=sd.queryAllStudent();
		System.out.println("--------------------ѧԱ��Ϣ��------------------------");
		System.out.println("���\t\t����\t\t�Ա�\t\t����\t\t��������");
		for(Student s:list){
			System.out.println(s.getStuid()+"\t\t"+s.getName()+"\t\t"+s.getGender()+"\t\t"+s.getAge()+"\t\t"+s.getBirthday());
		}
		System.out.println("--------------------------------------------------------");
	}
	public static void showStudentEnd(){
		showStudent();
		studentMenu();
	}
	//�޸�ѧԱ��Ϣ
	public static void changeStudent(){
		showStudent();
		boolean flag=true;
		while(flag){
			System.out.print("��������Ҫ�޸ĵ�ѧԱ���:");
			String stuid=sc.next();
			System.out.print("������ѧԱ����:");
			String name=sc.next();
			System.out.print("������ѧԱ�Ա�:");
			String gender=sc.next();
			System.out.print("������ѧԱ����:");
			String age=sc.next();
			System.out.print("������ѧԱ����:");
			String birthday=sc.next();
			Student s=new Student(stuid,name,gender,age,birthday);
			if(sd.updateSingleStudent(s)){
				System.out.print("�޸ĳɹ�!�Ƿ�����޸�(y/n):");
				String select=sc.next();
				if("y".equals(select)){
					flag=true;
				}else{
					flag=false;
				}
			}else{
				System.out.println("�޸�ʧ�ܣ�");
			}
		}
		studentMenu();
	}
	//ɾ��ѧԱ��Ϣ
	public static void deleteStudent(){
		showStudent();
		System.out.print("��������Ҫɾ����ѧԱ���:");
		String select=sc.next();
		StudentDao sd=new StudentDao();
		System.out.print("�Ƿ�ȷ��ɾ��?(y/n)");
		String sel2=sc.next();
		if("y".equals(sel2)){
			if(sd.deleteSingleStudent(select)){
				System.out.println("ɾ���ɹ�!");
			}else{
				System.out.println("ɾ��ʧ�ܣ�");
			}
			studentMenu();
		}else{
			studentMenu();
		}
}
	
}
