package yj04.part2;

import java.util.Scanner;

public class Pratice {
	public static void main(String[] args) {
		System.out.println("----------��ӭ������������------------");
		System.out.println("Ӣ���б�:");
		System.out.println("���\t\t����\t\t̨��\t\t\t����");
		
		
		Heros hero1=new Heros();
		hero1.name="�����ӳ�";
		hero1.dialogue="�ҿ�����,���Ͱ�";
		hero1.skill="�Ӷ���";
		
		Heros hero2=new Heros();
		hero2.name="֩����";
		hero2.dialogue="����Խ������Խ��";
		hero2.skill="֩��˿";
		
		Heros hero3=new Heros();
		hero3.name="����";
		hero3.dialogue="����֮��������";
		hero3.skill="��������";
		
		Heros[] hero=new Heros[3];
		hero[0]= hero1;
		hero[1]= hero2;
		hero[2]= hero3;
		
		for(int i=0;i<hero.length;i++){
			System.out.println(i+1+"\t\t"+hero[i].name+"\t\t"+hero[i].dialogue+"\t\t"+hero[i].skill);
		}
		
		System.out.println("��ѡ������ϲ����Ӣ��:");
		
		int i=new Scanner(System.in).nextInt();
		switch(i-1){
		 case 0:
			 System.out.println("��ѡ�����"+hero[0].name+",������˵:"+hero[0].dialogue+",���ļ�����:"+hero[0].skill);
			 break;
		 case 1:
			 System.out.println("��ѡ�����"+hero[1].name+",������˵:"+hero[1].dialogue+",���ļ�����:"+hero[1].skill);
			 break;
		 case 2:
			 System.out.println("��ѡ�����"+hero[2].name+",������˵:"+hero[2].dialogue+",���ļ�����:"+hero[2].skill);
			 break;
		default:
			System.out.println("����Ӣ�����ڿ�����!�����ڴ���");
			break;
		}
		
	}
}
