package five;

public class five04 {
	
	public five04() {//默认构造器   无参构造器
		System.out.println("dsaadad");
	}
	public five04(String i){//重载构造器
		System.out.println("构造器接受的参数为：");
		System.out.println(i);
	}
    public static void main(String[] args) {
    	new five04();
		new five04("i接受的参数");//参数传给构造器
	}
}
