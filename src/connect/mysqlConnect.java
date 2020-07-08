package connect;
import java.sql.*;
public class mysqlConnect {
    public Connection getCon() {   //定义类型为Connection的getCon（）方法
        Connection con = null;
        String username = "root";
        String password = "lcglcg";
        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/future-login-message";
        try {
            Class.forName(Driver);
            System.out.println("123驱动加载成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("123123连接成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;    //返回值为Connection con
    }
}