package Nom5;

import java.util.Random;
import java.util.Scanner;

/**
 * Ӣ������
 * @author pengsir
 *
 */
public class LOL {
	public static void main(String[] args) throws InterruptedException {
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
	    //����2.չʾӢ�۵��б���Ϣ����ȡӢ�۶���
		Hero hero = lol.selectHero();
		/* ����3.�������ִ�
		 * 1).Ӣ����Ϣ
		 * 2).������
		 * 3).����װ��
		 * 4).�˳���Ϸ
		 */
		lol.newPerson(hero);
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
		if(name.equals("zj")&&pass.equals("666")){
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
	
	//�������ִ�
	public void newPerson(Hero hero) throws InterruptedException{
		System.out.println("------------");
		System.out.println("*��ӭ�������ִ�*");
		System.out.println("------------");
		System.out.println("1.ȷ����Ϣ");
		System.out.println("2.������");
		System.out.println("3.����װ��");
		System.out.println("4.�˳���Ϸ");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Ӣ�ۣ�"+hero.name);
			System.out.println("��飺"+hero.desc);
			System.out.println("�ȼ���"+hero.level);
			System.out.println("�˺���"+hero.attact);
			System.out.println("������"+hero.defense);
			break;
		case 2:
			fight(hero);
			//����һ����ֵķ���
			break;
		case 3:
			//��װ��
			break;
		case 4:
			//�˳���Ϸ
			break;
		default:
			System.out.println("�ݲ��ṩ�˷���");
			break;
		}
	}
	
	//��ַ���
	public void fight(Hero hero) throws InterruptedException{
		//1)��ʼ��������Ϣ
		Monster dragon = new Monster("��ʲ�о�",80,50,1000,1000);
		Monster stone = new Monster("���Ҿ���",40,50,500,500);
		Monster gnome = new Monster("�ؾ�",20,10,80,200);
		Monster ghost = new Monster("����",20,60,200,300);
		Monster corpse = new Monster("��ʬ��",100,20,500,600);
		//2)ʹ�ù�������װ�ع������
		Monster[] mons = {dragon,stone,gnome,ghost,corpse};
		//3)�������������
		int num = new Random().nextInt(5);
		System.out.println("����Ӣ���Ѿ�����ս��״̬�����˻���30�뵽��ս��");
		System.out.println(hero.name+"��������"+mons[num].name);
		//�ҶԹ�����ɵ��˺�
		int atth = 0;
		//���������ɵ��˺�
		int attm = 0;
		do {
			//���Ӣ�۶Թ�����Ϊ���˺�����ֱ�Ӱѱ����˺���0
			if(hero.attact - mons[num].defanse <0){
				atth = 0;
			}else{
				//���򱾴��˺����������ݼ���
				atth = hero.attact - mons[num].defanse;
			}
			//��������Ӣ����ɸ����˺���Ҳ�ѱ����˺���0
			if(mons[num].attact - hero.defense <0){
				attm = 0;
			}else{
				//���򱾴��˺����������ݼ���
				attm = mons[num].attact - hero.defense;
			}
			System.out.println(hero.name+"��"+mons[num].name+"�����"+atth+"���˺�");
			System.out.println(mons[num].name+"��"+hero.name+"�����"+attm+"���˺�");
			//���㱾��ս�����Ѫ��
			hero.life = hero.life - attm;
			mons[num].life = mons[num].life - atth;
			//���Ӣ�۸������������
			if(hero.life < 0){
				hero.life = 0;
				System.out.println(hero.name+"��ʣ"+hero.life+"������==="+mons[num].name+"��ʣ"+mons[num].life+"������");
				//�������δ�ֵĲ������������ִ�����
				break;
			}
			//��ܹ����������ָ���
			if(mons[num].life < 0){
				mons[num].life = 0;
				System.out.println(hero.name+"��ʣ"+hero.life+"������==="+mons[num].name+"��ʣ"+mons[num].life+"������");
				break;
			}
			System.out.println(hero.name+"��ʣ"+hero.life+"������==="+mons[num].name+"��ʣ"+mons[num].life+"������");
			new Thread().sleep(500);//�����̵߳�sleep�������õ�ǰ�߳�����500����
		} while (hero.life>0&&mons[num].life>0);
		//�ж�����������ˣ����ȡ�������Ľ��
		if(mons[num].life <= 0){
			System.out.println(mons[num].name+"�ѱ�ɱ��"+hero.name+"�����"+mons[num].killMoney);
			hero.money = hero.money + mons[num].killMoney;
			System.out.println("�����Ƿ������֣�<y/n>");
			String key = new Scanner(System.in).next();
			if(key.equals("y")){
				fight(hero);//�������
			}else{
				newPerson(hero);//�����ִ�
			}
	    //���Ӣ�����ˣ���ص����ִ�
		}else if(hero.life <= 0){
			System.out.println(hero.name+"�Ѿ��������������ִ�");
			hero.life = 500;
			newPerson(hero);//���ý������ִ巽��
		}
	}
}
