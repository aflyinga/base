package seven;
//这里编译器合成一个C的构造函数，首先调用基类构造函数，然后调用成员对象构造函数。 行使
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
		super(c);//用super来调用基类带参数的构造器
	}
	B b=new B("a");  
}
