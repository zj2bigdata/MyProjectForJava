package Nom2;

import java.util.Scanner;

/**
 * Ӣ������
 * @author pengsir
 *
 */
public class LOL {
	public static void main(String[] args) {
		//�����Ϸ����
		System.out.println("--------------");
		System.out.println("----Ӣ������----");
		System.out.println("--------------");
		//����1.�û���¼
		//ѭ�������û���¼��������½�ɹ���ֹͣ����
		LOL lol = new LOL();
		boolean key = false;
		do {
		    key = lol.login();
		} while (key == false);
	    System.out.println("������Ϸ..........");
	}
	
	//��½����
	public boolean login(){
		System.out.println("��ӭ����Ӣ�����ˣ����ȵ�¼��");
		System.out.println("�û�����");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("���룺");
		Scanner sc1 = new Scanner(System.in);
		String pass = sc.next();
		if(name.equals("pengsir")&&pass.equals("666")){
			System.out.println("��ϲ�㣬��½�ɹ�");
			System.out.println("��ӭ��������֮������!");
			System.out.println("��ߴ�½�ϵ������Թ�������ϲ����Ⱥ��������ս������������");
			System.out.println("���ۺ�ʱս���Ľ�����߶���ħ��!");
			return true;
		}else{
			System.out.println("�˺��������������µ�½");
			System.out.println("------------------");
			return false;
		}
	} 
}
