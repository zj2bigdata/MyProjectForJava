package Nom4;

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
	    //����2.չʾӢ�۵��б���Ϣ
		Hero hero = lol.selectHero();
	}
	
	//��½����
	public boolean login(){
		System.out.println("��ӭ����Ӣ�����ˣ����ȵ�¼��");
		System.out.print("�û�����");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("���룺");
		Scanner sc1 = new Scanner(System.in);
		String pass = sc1.next();
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
	
	//��ʼ��Ӣ�ۣ�ѡ��Ӣ��
	public Hero selectHero() {
		// 1)��ʼ��Ӣ����Ϣ
		Hero jia = new Hero("��������", "����Ӣ������ʱ����������Ϊ������ҳ�Ա", 1, 43, 35, 500, 400);
		Hero ka = new Hero("��������", "������Ų���֮��", 1, 65, 30, 500, 400);
		Hero gai = new Hero("����", "�Ҿ��ǵ�������֮��", 1, 37, 40, 500, 400);
		Hero zhao = new Hero("����", "���ǹ�����ҵ�˽���ܹܣ���Ұ����", 1, 45, 35, 500, 400);
		Hero ai = new Hero("��ϣ", "��������һ�����Ҿ��Ǻ������֣�", 1, 55, 30, 500, 400);
		// 2)����Ӣ�����飬װ��Ӣ�۶���
		Hero[] heros = new Hero[] { jia, ka, gai, zhao, ai };
		// 3)ʹ��ѭ������Ӣ�����飬չʾӢ���б�
		System.out.println("-----Ӣ���б�------");
		int i = 1;
		for (Hero hero : heros) {
			System.out.println(i + "." + hero.name);
			i++;
		}
		System.out.println("��ѡ������Ӣ��------");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no >= 1 && no <= 5) {
			System.out.println("���Ѿ�ѡ��" + heros[no - 1].name + "������������֮�ص�ð��֮�ð�");
			return heros[no - 1];//�����Ѿ�ѡ��õ�Ӣ��
		} else {
			System.out.println("�Բ�����δ���ţ�������ѡ��");
			return selectHero(); //��ʾ�ݹ���ã��Լ������Լ�
		}
	}
}
