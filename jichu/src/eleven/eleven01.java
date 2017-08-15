package eleven;

import java.util.*;

import five.finalize;

public class eleven01 {
  public static void main(String[] args) {
	List<Gerbil> ger=new ArrayList<Gerbil>();
	for(int i=0;i<10;i++){
		ger.add(new Gerbil(i));//添加元素
	}
	for(int i=0;i<ger.size();i++){
		ger.get(i).hop();//打印并调用hop方法
	}
}
      
}

class Gerbil{
	  private final int gerbilNumber;
	  
      public Gerbil(int gerbilNumber) {//构造器初始化
		this.gerbilNumber=gerbilNumber;
      }
      public String toString(){//tostring默认返回  类名@hashcode
    	  						//在此要覆写tostring方法
    	  return "gerbil "+gerbilNumber;
      }
     
      public void hop(){
    	 System.out.println(this+"is hopping ");
      }//this指当前对象的引用
}
