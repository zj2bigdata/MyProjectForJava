package yj04.part1;

//�߼������
//java��ʹ��"&&"��ʾ�߼���
//ʹ��"||"��ʾ�߼���
//ʹ��"��"��ʾ�߼���
//ʹ��"^"��ʾ��
//����&��ʾ�룬|��ʾ��.
public class Demo6 {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=5;
		//λ��������ϵ
		System.out.println((a<b)|(a>c));
		System.out.println((b==c)|(c>a));
		System.out.println((c<b)|(c>a));
		
		//�߼����ϵ(��������ж�·ЧӦ�����ǰ����ʽ��������ִ�к���ĳ���).ʵ�ʿ����Ƽ�ʹ��(Ч�ʸ�)
		System.out.println((a<b)||(a>c));
		System.out.println((b==c)||(c>a));
		System.out.println((c<b)||(c>a));
		
		//λ��������ϵ
		System.out.println((a<b)&(a>c));
		System.out.println((b==c)&(c>a));
		System.out.println((c<b)&(c>a));
		
		//λ������߼����ϵ(��������ж�·ЧӦ�����ǰ����ʽ��������ִ�к���ĳ���).ʵ�ʿ����Ƽ�ʹ��(Ч�ʸ�)
		System.out.println((a<b)&&(a>c));
		System.out.println((b==c)&&(c>a));
		System.out.println((c<b)&&(c>a));
		
		//λ������߼�����ϵ(ͬ��Ϊfalse,����Ϊtrue)
		System.out.println((a<b)^(a>c)); //true
		System.out.println((c==c)^(c>a)); //false
		System.out.println((c<b)^(c<a)); //false
				
		//ȡ�ǹ�ϵ
		System.out.println(!(a<b)&&(a>c));
		System.out.println(!(b==c)||(c>a));
		System.out.println(!(c<b)^(c>a));
	}
}
