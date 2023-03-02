package learninging0910.JavaJDBC;

import java.sql.DriverManager;

public class test01 {
    String stat = "";
    String conn="";

    public static void main(String[] args) {
        try {
            //DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
           // conn=DriverManager.getConnection(jdbc:mysql://localhost:3304)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
