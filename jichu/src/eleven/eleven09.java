package eleven;


import java.io.PrintWriter;
import java.util.*;

import javax.print.attribute.HashAttributeSet;

import five.staticInitialization;

public class eleven09{
	public static void Print(Iterator<?> it){
		while(it.hasNext()){//使用iterator遍历collection并打印tostring
			System.out.println(it.next().toString());
		}
	}
   public static void main(String[] args) {
	List<Collection<String>> ca=Arrays.<Collection<String>>asList(
			new ArrayList<String>(),
			new LinkedList<String>(),
			new HashSet<String>(),
			new TreeSet<String>());
	   for(Collection<String> c:ca){
		   eleven04.fill(c);
	   }
	   for(Collection<String> c: ca){
		   Print(c.iterator());
	   }
	   
   }

}

