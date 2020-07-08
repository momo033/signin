package MessageTest;
import java.sql.*;
import Bean.loginMeaasge;
import connect.mysqlConnect;

public class Test {
    private Connection con;
    private PreparedStatement pst;

    public Test() {      //定义Test的构造函数，实例化getCon方法，连接到数据库（Test对象的实例化在valadite.jsp的JSP:useBean完成）
        con = new mysqlConnect().getCon();//申明的connection对象con=mysqlConnect()对象的getcon方法
                       //new getcon()方法，将其实例化。   本段代码，一个对象等于另一个对象的成员方法？什么操作？
    }
    public boolean valiuser(loginMeaasge user) {     //实例化一个JavaBean对象：loginMeaasge user，用来执行JavaBean操作
        try {
            pst = con.prepareStatement("select * from `future-login-message`.login where name=? and password=?");
            pst.setString(1, user.getName()); //接收username值
            pst.setString(2, user.getPassword());
            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;// try 和catch两个模块都要分别定义返回值
        }
    }
}