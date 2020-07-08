package test;
import java.sql.*;
public class model {
    public void getCon() {
        Connection con = null;
        String username = "root";
        String password = "lcglcg";
        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:8030/future-login-message";
        try {
            Class.forName(Driver);
            System.out.println("1驱动加载成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("2连接成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}