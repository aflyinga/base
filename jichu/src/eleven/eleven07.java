package eleven;

import java.util.*;

import five.staticInitialization;

public class eleven07 {
	
		public static void main(String[] args) {
			Dog arr[]=new Dog[10];
			for(int a=0;a<arr.length;a++){
				arr[a]=new Dog();
			}
	      List<Dog> dog=new ArrayList<Dog>(Arrays.asList(arr));//把数组转为list
	      System.out.println("dog="+dog);
	      List<Dog> subset=dog.subList(dog.size()/4, dog.size()/2);
	      System.out.println("subset="+subset);
	      subset.clear();
	      System.out.println("dog="+dog);
		}//方法asList（）和subList（）返回不可变列表，因为它们分别由底层数组和列表“支持”。
}
class Dog{
	private static int ID;
	private int i=ID++;
	public String toString(){
		return "IDDog"+i;
	}
}