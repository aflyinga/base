package seven;
//����������ϳ�һ��C�Ĺ��캯�������ȵ��û��๹�캯����Ȼ����ó�Ա�����캯���� ��ʹ
public class seven05{
	public static void main(String[] args) {
		new C("a");
	}
}
class A{
	public A(String a){
		System.out.println("A");
	}
}
class B{
	public B(String b){
		System.out.println("B");
	}
	
}
class C extends A{
	public C(String c){
		super(c);//��super�����û���������Ĺ�����
	}
	B b=new B("a");  
}
