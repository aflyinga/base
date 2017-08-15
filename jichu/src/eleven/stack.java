package eleven;

import java.util.Stack;

import five.staticInitialization;

public class stack {
	private final static Stack<Character> STACK=new Stack<Character>();
     public static void main(String[] args) {
	 dy(
		 "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---"
	 );
		
	}
   private static void dy(String expr){
	   char data[]=expr.toCharArray();
	   for(int i=0;i<data.length;){
		   switch(data[i++]){
		   case '+':  STACK.push(data[i++]);
		              break;
		   case '-':System.out.println(STACK.pop());
		   }
	   }
   }
}
