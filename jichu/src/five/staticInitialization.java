package five;

public class staticInitialization {  

	public static void main(String[] args) {
		System.out.println("创建一个Cupboard()在main里");
		new Cupboard();
		System.out.println("创建一个Cupboard()在main里");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	
	static Table table=new Table();
	static Cupboard cupboard=new Cupboard();
}
class Bowl{
	
    Bowl(int marker){
    	System.out.println("Bowl("+marker+")");
    }
    
    void f1(int marker){
    	System.out.println("f1("+marker+")");
    }
}
       
class Table{//如果没有Table此对象 静态的Bowl b1和b2 永远不会被创建
	     //只有在第一个Table对象或第一次访问静态数据时，它们才会被初始化！！！！且只初始化一次！！！！
    static Bowl bowl1=new Bowl(1);//静态成员b1
    
    Table(){
    	System.out.println("Table()");
    	bowl2.f1(1);//必要时才会被创建
    }
    
    void f2(int marker){
    	System.out.println("f2("+marker+")");
    }
    
    static Bowl bowl2=new Bowl(2);//静态成员b2
}
class Cupboard{
	
	Bowl bowl3=new Bowl(3);//非静态成员b3
	static Bowl bowl4=new Bowl(4);
	
	public Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	
	void f3(int marker){
    	System.out.println("f3("+marker+")");
    }
	
	static Bowl bowl5=new Bowl(5);
	
}
       
       
       