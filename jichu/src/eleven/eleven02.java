package eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.mysql.jdbc.MiniAdmin;

public class eleven02 {
     public static void main(String[] args) {
		Collection<Integer> c=new HashSet<Integer>();
		
		for(int i=0;i<10;i++){
			c.add(i);
		}
		for(Integer i:c){//foreach语法  把c中元素都给i并打印
			System.out.println(i+"");
		}
	}
}
