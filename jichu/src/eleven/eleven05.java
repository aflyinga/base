package eleven;


import java.util.*;

import com.mysql.fabric.xmlrpc.base.Array;

public class eleven05 {
       public static void main(String[] args) {
		List<Integer> i=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("1:"+i);
		i.add(200);//添加元素
		System.out.println("2:"+i);
		System.out.println("3:"+i.contains(200));
		i.remove(Integer.valueOf(200));//删除200元素，装箱
		Integer a=i.get(3);//返回指定位置的元素、索引为3处的元素
		System.out.println("4:"+a+"  "+i.indexOf(a));//indexOf返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
		Integer j=Integer.valueOf(1);//代表j的整数实例
		System.out.println("5:"+i.indexOf(j));//返回1的索引 不存在返回-1
		System.out.println("6:"+i.remove(j));//如果此列表包含指定的元素，则为true否则false
		System.out.println("7:"+i.remove(a));//同时删除此元素  括号中为元素！！！
		System.out.println("8:"+i);
		i.add(3,0);//在索引为3处添加元素0
		System.out.println("9:"+i);
		List<Integer> sub=i.subList(1, 4);//打印索引1（包含）到4（不包含）的元素
		System.out.println("sublist:"+sub);
		System.out.println("10:"+i.containsAll(sub));
		Collections.sort(sub);//根据其元素的自然顺序将指定的列表按升序排序。列表中的所有元素必须相互可比较
		System.out.println("sorted  sublist:"+sub);
		System.out.println("11:"+i.containsAll(sub));//顺序打乱了也存在i列表中
		Collections.shuffle(sub);//实现随机排列
		System.out.println("shuffle sub:"+sub);
		System.out.println("12:"+i.containsAll(sub));
		List<Integer> copy=new ArrayList<Integer>(i);
		sub=Arrays.asList(i.get(1),i.get(4));//i中1索引 元素和4索引元素
		System.out.println(i);
		System.out.println("sub:"+sub);
		copy.retainAll(sub);//复制sub中所有元素到copy中
		System.out.println("13:"+copy);
		copy=new ArrayList<Integer>(i);//复制i到copy
		copy.remove(2);
		System.out.println("14:"+copy);
		
	}
}
