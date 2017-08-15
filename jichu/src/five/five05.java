package five;

public class five05 {
	
		public static void main(String[] args) {
	       Dog dog=new Dog();//创建对象
	       dog.bark();//调用无参函数的bark方法
	       dog.bark(1.1);
	       dog.bark(1);
		}
		
}

class Dog{
	public void bark(){
		System.out.println("barking");
	}
	public void bark(int s){//重载
		System.out.println("int bark=howling");
	}
	public void bark(double a){//重载
		System.out.println("double bark=barking");
	}
}
