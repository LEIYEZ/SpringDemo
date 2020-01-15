package cn.imut.jdbc;

import java.sql.*;

//程序耦合
//耦合：程序间的依赖关系：类，方法
//解耦：降低程序间的依赖关系
//实际开发中应该做到编译时不依赖，运行时再依赖
//解耦的思路：
//          1.使用反射来创建对象，而避免使用new 关键字。
//          2.通过读取配置文件来获取要创建的对象全限定类名。
public class JdbcDemo01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册驱动
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver"); //弊端：字符串写死
        //2.获取链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zl?useSSL=true","root","1870535196");
        //3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        //4.执行SQL，得到结果集
        ResultSet rs = pstm.executeQuery();
        //5.便利结果集
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
        //6.释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
