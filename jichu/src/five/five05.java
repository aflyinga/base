package five;

public class five05 {
	
		public static void main(String[] args) {
	       Dog dog=new Dog();//��������
	       dog.bark();//�����޲κ�����bark����
	       dog.bark(1.1);
	       dog.bark(1);
		}
		
}

class Dog{
	public void bark(){
		System.out.println("barking");
	}
	public void bark(int s){//����
		System.out.println("int bark=howling");
	}
	public void bark(double a){//����
		System.out.println("double bark=barking");
	}
}
