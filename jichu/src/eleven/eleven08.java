package eleven;

import java.util.ArrayList;
import java.util.Iterator;

import javax.rmi.CORBA.Tie;

public class eleven08 {
		public static void main(String[] args) {
	      ArrayList< Gerbil> gerbils=new ArrayList<Gerbil>();
	      for(int i=0;i<10;i++){
	    	  gerbils.add(new Gerbil(i));//���i��gerbils�����У����Ԫ�أ�
	      }
	      for(Iterator<Gerbil> it=gerbils.iterator();//����iterator
	    	  it.hasNext();//����������Ƿ���Ԫ��
	    	  it.next().hop());//������е���һ��Ԫ��
	      
		}
}
