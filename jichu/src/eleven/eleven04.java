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
			array[i]=fm.next();//��ӵ�������
		}
		return array;
	}
	
	static Collection<String> 
		fill(Collection<String> c){
			for(int i=0;i<5;i++){
				c.add(fm.next());//��ӵ�����collection��
			}
			return c;
		}
	
		public static void main(String[] args) {//��ӡ
			System.out.println(Arrays.toString(fill(new String[5])));//���ַ���ʽ��ӡ
			System.out.println(fill(new ArrayList<String>()));
			System.out.println(fill(new LinkedList<String>()));
			System.out.println(fill(new HashSet<String>()));
			System.out.println(fill(new LinkedHashSet<String>()));
			System.out.println(fill(new TreeSet<String>()));
		}
}

class film{
       String f[]={"Grumpy","Happy","Sleepy","Dopey","Doc","Sneezy","Bashful","Snow White","Witch Queen","Prince"};
       int next;//��ʼ�������next
       public String next(){
    	   String r=f[next];
    	   next=(next+1)%f.length;//ȷ������f.lengthʱ�ص�f[0]
    	   return r;
       }
	
}
