package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ConnectionMysql {
	
    public static final String url="jdbc:mysql://127.0.0.1/student";
	public static final String name="com.mysql.jdbc.Driver";
	public static final String user="root";
	public static final String password="123456789";
	
	public Connection conn=null;
	public PreparedStatement pst=null;
	
	public ConnectionMysql(String sql){
		try {
			
			Class.forName(name);//指定连接类型
			conn =DriverManager.getConnection(url,user,password);//获取连接
			pst=conn.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//关闭连接。。关闭资源
	public void close(){
		try {
			
			this.conn.close();
			this.pst.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
}
