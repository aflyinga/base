package three;

public class three06 {
   public static void main(String[] args) {
	Dog1 spot=new Dog1();//����ʵ��

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

	
   System.out.println("�Ƚ����£�");
   System.out.println("spot==hehe:"+(spot==hehe));//�Ѳ�������תΪstring
   System.out.println("spot.equals(hehe):"+spot.equals(hehe));//equals�����ز�������
   System.out.println("hehe.equals(spot):"+hehe.equals(spot));
   System.out.println("�Ƚ�spot=hehe");
   spot=hehe;
   System.out.println("�Ƚ����£�");
   System.out.println("spot==hehe:"+(spot==hehe));//�Ѳ�������תΪstring
   System.out.println("spot.equals(hehe):"+spot.equals(hehe));//equals�����ز�������
   System.out.println("hehe.equals(spot):"+hehe.equals(spot));//equalsĬ�ϱȽ�����
   System.out.println("spot:");
   spot.showName();
   spot.showSays();
   System.out.println("hehe:");
   hehe.showName();
   hehe.showSays();
   
}
}
class Dog1{//һ����������ʱ equalsĬ�ϱȽ����ã�Ҫ�������и���equals������������
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
