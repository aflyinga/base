package four;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class four04 {
	//打印100以内素数
	public static void main(String[] args) {
		int max=100;
		if(args.length != 0) 
	    max = Integer.parseInt(args[0]);   
		for(int a=1;a<max;a++){
			boolean dd = true;
			for(int i=2;i<a;i++){
				if(a % i ==0)
				   dd=false;
				if(dd)
		         System.out.print(a+" ");		
			}  
		}
	}
     
     
}
