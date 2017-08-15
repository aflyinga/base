package sqlconnection;

import java.sql.ResultSet;

public class Demo {

	static String sql=null;
	static ConnectionMysql dbl=null;
	static ResultSet ret=null;
	
	public static void main(String[] args) {
		sql="select * from score";//sql语句
		dbl=new ConnectionMysql(sql);
		
		try {
			
			
			ret=dbl.pst.executeQuery();//执行语句 得到结果集
			while(ret.next()){
				String ID=ret.getString(1);
				String name=ret.getString(2);
				String age=ret.getString(3);
				String sex=ret.getString(4);
				String score=ret.getString(5);
			 System.out.println(ID+"\t"+name+"\t"+age+"\t"+sex+"\t"+score);
				
			}//显示数据
			ret.close();
			dbl.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
