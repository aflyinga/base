package five;

public class five02 {
		String a="定义时的初始化";
		String b;
		public five02(String b2) {
			b=b2;
		}
		public static void main(String[] args) {
			five02 x=new five02("在构造器初始化");
			System.out.println("x.a="+x.a);
			System.out.println("x.b="+x.b);
		}
}
