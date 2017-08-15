package eleven;

import java.awt.List;
import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.mysql.jdbc.Connection;

import five.finalize;
import five.staticInitialization;

public class eleven04 {
	private static final film fm=new film();
	static String[] fill(String array[]){
		for(int i=0;i<array.length;i++){
			array[i]=fm.next();//添加到数组中
		}
		return array;
	}
	
	static Collection<String> 
		fill(Collection<String> c){
			for(int i=0;i<5;i++){
				c.add(fm.next());//添加到容器collection中
			}
			return c;
		}
	
		public static void main(String[] args) {//打印
			System.out.println(Arrays.toString(fill(new String[5])));//以字符形式打印
			System.out.println(fill(new ArrayList<String>()));
			System.out.println(fill(new LinkedList<String>()));
			System.out.println(fill(new HashSet<String>()));
			System.out.println(fill(new LinkedHashSet<String>()));
			System.out.println(fill(new TreeSet<String>()));
		}
}

class film{
       String f[]={"Grumpy","Happy","Sleepy","Dopey","Doc","Sneezy","Bashful","Snow White","Witch Queen","Prince"};
       int next;//初始化数组和next
       public String next(){
    	   String r=f[next];
    	   next=(next+1)%f.length;//确保大于f.length时回到f[0]
    	   return r;
       }
	
}
