package eleven;

import java.util.*;

import five.finalize;

public class eleven01 {
  public static void main(String[] args) {
	List<Gerbil> ger=new ArrayList<Gerbil>();
	for(int i=0;i<10;i++){
		ger.add(new Gerbil(i));//���Ԫ��
	}
	for(int i=0;i<ger.size();i++){
		ger.get(i).hop();//��ӡ������hop����
	}
}
      
}

class Gerbil{
	  private final int gerbilNumber;
	  
      public Gerbil(int gerbilNumber) {//��������ʼ��
		this.gerbilNumber=gerbilNumber;
      }
      public String toString(){//tostringĬ�Ϸ���  ����@hashcode
    	  						//�ڴ�Ҫ��дtostring����
    	  return "gerbil "+gerbilNumber;
      }
     
      public void hop(){
    	 System.out.println(this+"is hopping ");
      }//thisָ��ǰ���������
}
