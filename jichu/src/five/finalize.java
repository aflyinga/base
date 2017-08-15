package five;

public class finalize {
      @Override
    protected void finalize() throws Throwable {
    System.out.println("sadada");
    }
      
      public static void main(String[] args) {
		new finalize();
		System.gc();//强制进行终结动作
		System.runFinalization();
		//调用System.gc()和System.runFinalization()
		//可能不一定会调用你的终结器（JDK版本不同不确定）
		//这些方法只是一个请求不能保证终结器实际运行。
	}
}
