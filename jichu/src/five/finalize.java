package five;

public class finalize {
      @Override
    protected void finalize() throws Throwable {
    System.out.println("sadada");
    }
      
      public static void main(String[] args) {
		new finalize();
		System.gc();//ǿ�ƽ����սᶯ��
		System.runFinalization();
		//����System.gc()��System.runFinalization()
		//���ܲ�һ�����������ս�����JDK�汾��ͬ��ȷ����
		//��Щ����ֻ��һ�������ܱ�֤�ս���ʵ�����С�
	}
}
