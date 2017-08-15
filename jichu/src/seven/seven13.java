package seven;

public class seven13 {
       public static void main(String[] args) {
		bbb x=new bbb();
		x.hehe('a');
		x.hehe(1);
		x.hehe(2.4);
		x.hehe("adada");
	}
}

class aaa{
	public void hehe(){
		System.out.println("没有参数");
	}
	public void hehe(char a){
		System.out.println("string");
	}
	public void hehe(int i){
		System.out.println("int");
	}
	public void hehe(double b){
		System.out.println("short");
	}
}
class bbb extends aaa{
	public void hehe(String s){//重载父类hehe方法
		System.out.println("string s");
	}
}
