package seven;

public class seven04 extends hahe{
       public static void main(String[] args) {
		new seven04();
	}
}
class hahe extends hehe{//基类构造器总是被调用，在导出类构造器之前调用
	public hahe(){
		System.out.println("hahe");
	}
}
class hehe extends haha{//基类构造器总是被调用，在导出类构造器之前调用
	public hehe(){
		System.out.println("hehe");
	}
}
class haha{//基类构造器总是被调用，在导出类构造器之前调用
	public haha(){
		System.out.println("haha");
	}
}
