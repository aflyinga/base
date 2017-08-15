package three;

public class three05 {
   public static void main(String[] args) {
	Dog spot=new Dog();//创建实例

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
    void setName(String n){//设置名字
    	name=n;
    }
    void setSays(String s){//设置叫声
    	say=s;
    }
    void showName(){
    	 System.out.println(name);//打印方法
    }
    void showSays(){
    	 System.out.println(say);
    }
}
