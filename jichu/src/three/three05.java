package three;

public class three05 {
   public static void main(String[] args) {
	Dog spot=new Dog();//����ʵ��

	spot.setName("spot");
	spot.setSays("Ruff!!!!");
	Dog scruffy=new Dog();
	scruffy.setName("scruffy");
	scruffy.setSays("Wurf!!!!");
	spot.showName();
	spot.showSays();
	scruffy.showName();
	scruffy.showSays();
	
}
}
 class Dog{
	String name;
	String say;
    void setName(String n){//��������
    	name=n;
    }
    void setSays(String s){//���ý���
    	say=s;
    }
    void showName(){
    	 System.out.println(name);//��ӡ����
    }
    void showSays(){
    	 System.out.println(say);
    }
}
