package sqlconnection;

import java.sql.ResultSet;

public class Demo {

	static String sql=null;
	static ConnectionMysql dbl=null;
	static ResultSet ret=null;
	
	public static void main(String[] args) {
		sql="select * from score";//sql���
		dbl=new ConnectionMysql(sql);
		
		try {
			
			
			ret=dbl.pst.executeQuery();//ִ����� �õ������
			while(ret.next()){
				String ID=ret.getString(1);
				String name=ret.getString(2);
				String age=ret.getString(3);
				String sex=ret.getString(4);
				String score=ret.getString(5);
			 System.out.println(ID+"\t"+name+"\t"+age+"\t"+sex+"\t"+score);
				
			}//��ʾ����
			ret.close();
			dbl.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
