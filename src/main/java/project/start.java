package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
public class start  {
//    public start()throws Exception{
//        String URL="jdbc:mysql://192.168.89.128:3306/test";
//        String USER="root";
//        String PASSWORD="root";
//        //1.加载驱动程序
//        Class.forName("com.mysql.jdbc.Driver");
//        //2.获得数据库链接
//        Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
//        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
//        Statement st=conn.createStatement();
//        ResultSet rs=st.executeQuery("select * from name");
//        //4.处理数据库的返回结果(使用ResultSet类)
//        while(rs.next()){
//            System.out.println(rs.getString("id")+" "
//                    +rs.getString("name"));
//        }
//
//        //关闭资源
//        rs.close();
//        st.close();
//        conn.close();
//    }
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(start.class);
//    }
    public static void main(String[] args) throws Exception{
        SpringApplication.run(start.class, args);
    }
}
