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
			  it.previous();//返回列表中上一个元素，并向后移动光标位置
		  }//每隔一次迭代隐试校准光标位置，以保证插入点在中间
	  }
	  System.out.println(list);
	}
}
 

