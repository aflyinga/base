package five;

public class staticInitialization {  

	public static void main(String[] args) {
		System.out.println("����һ��Cupboard()��main��");
		new Cupboard();
		System.out.println("����һ��Cupboard()��main��");
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
       
class Table{//���û��Table�˶��� ��̬��Bowl b1��b2 ��Զ���ᱻ����
	     //ֻ���ڵ�һ��Table������һ�η��ʾ�̬����ʱ�����ǲŻᱻ��ʼ������������ֻ��ʼ��һ�Σ�������
    static Bowl bowl1=new Bowl(1);//��̬��Աb1
    
    Table(){
    	System.out.println("Table()");
    	bowl2.f1(1);//��Ҫʱ�Żᱻ����
    }
    
    void f2(int marker){
    	System.out.println("f2("+marker+")");
    }
    
    static Bowl bowl2=new Bowl(2);//��̬��Աb2
}
class Cupboard{
	
	Bowl bowl3=new Bowl(3);//�Ǿ�̬��Աb3
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
       
       
       