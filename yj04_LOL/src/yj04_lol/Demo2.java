package yj04_lol;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*************************");
		System.out.println("*        Ӣ������                       *");
		System.out.println("*************************");
		System.out.println("��ӭ����Ӣ�����ˣ����ȵ�¼��");
		boolean flag = true;
        do{
        	System.out.print("�˺ţ�");
            Scanner sc = new Scanner(System.in);
            String name= sc.next();
    		System.out.print("���룺");
            Scanner sc1 = new Scanner(System.in);
            String pass = sc1.next();
           
            if(name.equals("zj") && pass.equals("666")){
            	System.out.println("��ϲ����½�ɹ�");
            	flag = true;
            }else{
                System.out.println("��������˺��������������µ�¼");
                flag = false;
            }
        }while(flag == false);
        System.out.println("��ӭ��������֮������");
        System.out.println("��Ƭ��½�ϵ������Թ�������ϲ����Ⱥ��������ս���������");
        System.out.println("���ۺ�ʱս�����ԵĹ��߶���ħ��");
        //2.չʾӢ���б�ʹ��Ӣ�����͵�����װ��Ӣ�۶���ʹ��ѭ���������Ӣ�����顣
        Demo2 lol = new Demo2();
        Hero hero = lol.getHero();
        //3.���ý������ִ�
        lol.newPlayer(hero);
	}
	
	//����һ����������չʾ��Ӣ���б�
	//���巽����Ŀ�ģ����ڰ���Ϸ�еĹ��ܣ���һ����ģ�黯�����й���
	public Hero getHero(){
		Hero sun = new Hero("�����","��������Ҳ��",60,25,577,40);
		Hero ka = new Hero("��������","��ʼ��ɱ��ɱ��",60,30,480,40);
		Hero gai = new Hero("����","������������",50,18,430,40);
		Hero pan = new Hero("��ɭ","��ì�޷�ƽ������",55,45,500,40);
		Hero mang = new Hero("äɮ","�һ�ʶ����һ��",60,21,520,40);
		Hero jia = new Hero("��������","���������������棡",55,25,550,50);
		
		//ʹ��Hero����װ��Ӣ�۶���
		Hero[] heros = {sun,ka,gai,pan,mang,jia};
		
		//չʾӢ���б�(��ͷ��Ϣ)
		System.out.println("========================Ӣ���б�========================");
		System.out.println("���\t����\t����\t\t������\t������\t����\t���");
		//չʾӢ���б�(���ݲ��֣�����Ӣ������)
		for (int i = 0; i < heros.length; i++) {
			System.out.println(i+1+"\t"+heros[i].name+"\t"+heros[i].desc+"\t"+heros[i].attack+"\t"+heros[i].defense+"\t"+heros[i].life+"\t"+heros[i].money);
		}
		System.out.println("��ѡ����ϲ����Ӣ�۽�����Ϸ!");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no>=1 && no<=6){
			System.out.println("���Ѿ�ѡ����"+heros[no-1].name+"��������Ϸ������������֮�ص�ð�հ�");
			return heros[no-1];
		}else{
			System.out.println("�޴�Ӣ�ۣ�������ѡ��");
			return getHero();//�ݹ����
		}
		
	}
	
	//չʾ��ѡ��Ӣ��
	public void newPlayer(Hero h) throws InterruptedException{
		System.out.println("========================");
		System.out.println("��ӭ�����������ˣ�");
		System.out.println("1.ȷ����Ϣ\n2.���Ǵ��\n3.����װ��\n4.�˳���Ϸ");
		System.out.println("��ѡ����һ��:");
		System.out.println("========================");
		int key=new Scanner(System.in).nextInt();
		switch (key) {
		case 1:
			System.out.println("==========="+h.name+"Ӣ����Ϣ����==============");
			System.out.println("����:"+h.attack+"\t"+"����:"+h.defense+"\t"+"����:"+h.life+"\t"+"��Ǯ:"+h.money);
			System.out.println("========================================");
			newPlayer(h);
			break;
		case 2:
			killMonster(h);
			break;
		case 3:
			shopping(h);
			break;
		case 4:
			System.out.println("��ȷ���˳���Ϸ��?");
			String answer=new Scanner(System.in).next();
			if(answer.equals("y")){
				System.out.println("�����˳�....");
				for(int i=0;i<5;i++){
					if(i==4){//��������һ�룬������ʾ��Ϸ�ر�
						System.out.println(1);
					}else{
						System.out.println(5-i+"\t");
					}
					//�߳�
					new Thread().sleep(1000);
				}
				System.out.println("�˳��ɹ�!");
				System.exit(0);
			}else{
				newPlayer(h);
			}
			break;

		default:
			System.out.println("�޸�ѡ��!����������");
			newPlayer(h);
			break;
		}
	}
	
	//����װ��
	public void shopping(Hero h) throws InterruptedException{
		Eqiupment drag=new Eqiupment("����",25,50,235.0);
		Eqiupment dragx=new Eqiupment("������",55,0,495.0);
		Eqiupment drags=new Eqiupment("��֮��",100,100,735.0);
		Eqiupment bard=new Eqiupment("Ӣ��",10,70,135.0);
		Eqiupment bardx=new Eqiupment("������",80,45,475.0);
		Eqiupment bards=new Eqiupment("������",100,180,700.0);
		Eqiupment bardm=new Eqiupment("����",10,10,40.0);
		Eqiupment[] eq={drag,dragx,drags,bard,bardx,bards};
		System.out.println("��ӭ����!����Ӣ��:"+h.name+"ӵ�н��:"+h.money);
		System.out.println("============װ���б�==============");
		System.out.println("���\t����\t������\t������\t�۸�");
		for (int i = 0; i < eq.length; i++) {
			System.out.println(i+1+"\t"+eq[i].name+"\t"+eq[i].attack+"\t"+eq[i].defense+"\t"+eq[i].price);
		}
		System.out.println("================================");
		System.out.print("��������Ҫ�����װ�����:");
			int eqNo=new Scanner(System.in).nextInt();
			if(eqNo>=1&&eqNo<=eq.length){
				if(h.money>=eq[eqNo-1].price){
					h.attack+=eq[eqNo-1].attack;
					h.defense+=eq[eqNo-1].defense;
					h.money-=eq[eqNo-1].price;
					System.out.println("����ɹ�!");
				}else{
					System.out.println("����ʧ�ܣ�����Ǯ����Ŷ!");
				}
				System.out.print("��������?(y/n):");
				String y=new Scanner(System.in).next();
				if(y.equals("y")){
					shopping(h);
				}else{
					newPlayer(h);
				}
			}else{
				System.out.println("�ñ��װ����û�ϼ�!");
				shopping(h);
			}
		
	}
	
	//���
	public void killMonster(Hero h) throws InterruptedException{
		Monster mo1=new Monster("ʯͷ��",30,21,800,10);
		Monster mo2=new Monster("��ͷ",24,27,700,30);
		Monster mo3=new Monster("����",38,55,400,20);
		Monster mo4=new Monster("�ڳ�",33,43,960,25);
		Monster[] mos={mo1,mo2,mo3,mo4};
		//Ӣ����������
		System.out.println("�����ƥ�������Ӣ�۲���!��������ʱ...");
		int i=(int)(Math.floor(Math.random()*4));
		System.out.println(h.name+"��������"+mos[i].name+"!");
		//�˺�ֵ(���������洢ÿһ�غ�Ӣ�ۺ͹�����˺�ֵ)
		int hkm=h.attack-mos[i].defense;//Ӣ�۶Թ����˺�
		int mkh=mos[i].attack-h.defense;//�����Ӣ�۵��˺�
		//����˺�Ϊ����
		if(hkm<=0){
			hkm=1;
		}
		if(mkh<=0){
			mkh=1;
		}
		
		//˫��Ѫ������0����ʱ����������
		do{
			//�����˺�������
			//��Ҫע������Ϊ����
			if(hkm==1&&mkh==1){
				System.out.println(h.name+":����ﲻ������,����û����!");
				System.out.println(mos[i].name+":���ܰ�!С��");
				break;
			}
			h.life-=mkh;
			mos[i].life-=hkm;
			if(h.life<0){
				h.life=0;
			}
			if(mos[i].life<0){
				mos[i].life=0;
			}
			System.out.println(h.name+"��"+mos[i].name+"���"+hkm+"���˺�!");
			System.out.println(mos[i].name+"��"+h.name+"���"+mkh+"���˺�!");
			System.out.println("Ӣ�ۻ�ʣ:"+h.life+"��Ѫ!");
			System.out.println("���˻�ʣ:"+mos[i].life+"��Ѫ!");
			System.out.println("----------------------------------------");
		}while(h.life>0&&mos[i].life>0);
		System.out.println(h.life);
		System.out.println(mos[i].life);
		if(h.life==0){
			System.out.println(mos[i].name+":նɱ���治ʹ��!����!");
			System.out.println("���ڷ������ִ�....");
			for(int j=0;j<4;j++){
				if(j==3){//��������һ�룬������ʾ��Ϸ�ر�
					System.out.println(1);
				}else{
					System.out.println(4-j+"\t");
				}
				//�߳�
				new Thread().sleep(1000);
			}
			h.life=500;
			newPlayer(h);
		}
		if(mos[i].life==0){
			h.money+=mos[i].money;
			System.out.println(h.name+":նɱ"+mos[i].name+"�õ�������Ǯ"+mos[i].money+"��");
			System.out.println("�Ƿ�������(y/n):");
			String answer=new Scanner(System.in).next();
			if(answer.equals("y")){
				killMonster(h);
			}else{
				newPlayer(h);
			}
		}
	}
}
