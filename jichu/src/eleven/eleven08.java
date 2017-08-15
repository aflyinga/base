package eleven;

import java.util.ArrayList;
import java.util.Iterator;

import javax.rmi.CORBA.Tie;

public class eleven08 {
		public static void main(String[] args) {
	      ArrayList< Gerbil> gerbils=new ArrayList<Gerbil>();
	      for(int i=0;i<10;i++){
	    	  gerbils.add(new Gerbil(i));//添加i到gerbils对象中（添加元素）
	      }
	      for(Iterator<Gerbil> it=gerbils.iterator();//创建iterator
	    	  it.hasNext();//检查序列中是否有元素
	    	  it.next().hop());//获得序列的下一个元素
	      
		}
}
