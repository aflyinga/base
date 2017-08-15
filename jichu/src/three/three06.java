package three;

public class three06 {
   public static void main(String[] args) {
	Dog1 spot=new Dog1();//创建实例

	spot.setName("spot");
	spot.setSays("Ruff!!!!");
	spot.showName();
	spot.showSays();
	Dog1 scruffy=new Dog1();
	scruffy.setName("scruffy");
	scruffy.setSays("Wurf!!!!");
	scruffy.showName();
	scruffy.showSays();
	Dog1 hehe=new Dog1();
	hehe.setName("spot");
	hehe.setSays("Ruff!!!!");
	hehe.showName();
	hehe.showSays();

	
   System.out.println("比较如下：");
   System.out.println("spot==hehe:"+(spot==hehe));//把布尔类型转为string
   System.out.println("spot.equals(hehe):"+spot.equals(hehe));//equals本身返回布尔类型
   System.out.println("hehe.equals(spot):"+hehe.equals(spot));
   System.out.println("比较spot=hehe");
   spot=hehe;
   System.out.println("比较如下：");
   System.out.println("spot==hehe:"+(spot==hehe));//把布尔类型转为string
   System.out.println("spot.equals(hehe):"+spot.equals(hehe));//equals本身返回布尔类型
   System.out.println("hehe.equals(spot):"+hehe.equals(spot));//equals默认比较引用
   System.out.println("spot:");
   spot.showName();
   spot.showSays();
   System.out.println("hehe:");
   hehe.showName();
   hehe.showSays();
   
}
}
class Dog1{//一旦创建新类时 equals默认比较引用，要在新类中覆盖equals方法！！！！
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
