package yj04.part2;

import yj04.part1.Father;

public class Demo4 extends Father {
	public static void main(String[] args) {
		Father fa=new Father();
		fa.name="Сͷ�ְ�";
		//fa.house="�ҵĺ�����";protectdҲֻ�ܱ�ͬһ���������
		//fa.passport="�������";Ĭ�����ε�ֻ�ܱ�ͬһ���������
		//fa.money=50;���ܷ���˽�е�
		
		Demo4 de=new Demo4();
		de.house="�̳й����ĺ�����";//��������ΪFather�����࣬�ǿ��Է��ʸ����б�protected���ε�����
		
		/*
		 * �ܽ�������η�       
		 * ���η�				  public      protected      default     private
		 * ͬһ����			  true			true          true         true
		 * ͬһ�����е���		  true          true          true         false
		 * ��ͬ��������   		  true          true          false        false
		 * ��ͬ���Ҳ�������		  true          false         false        false
		 * �������η���Χ��С��public > protected > default > private
		 * */
	}
}
