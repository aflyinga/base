package five;


//验证a引用被初始化了null；
public class five01 {
	String a;//a的应用
	public static void main(String[] args) {
		five01 s=new five01();//本类对象
		System.out.println("s.a="+s.a);
	}       
}
