package eleven;

import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class eleven14 {
	public static void main(String[] args) {
		
	LinkedList<Integer> list=new LinkedList<Integer>();
      ListIterator<Integer> it=list.listIterator();
      
	  for(int i=0;i<=10;i++){
		  it.add(i);
		  if(i%2==0){
			  it.previous();//�����б�����һ��Ԫ�أ�������ƶ����λ��
		  }//ÿ��һ�ε�������У׼���λ�ã��Ա�֤��������м�
	  }
	  System.out.println(list);
	}
}
 

