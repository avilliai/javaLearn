package learninging0910.IO;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

public class IoAndProperties {
    public static void main(String[] args) throws Exception{
        //properties是一个map集合，key和value都是String类型
        //想将userinfo中的数据加载到properties对象当中
        //创建输入流对象
        FileInputStream fileInput=new FileInputStream("IO\\userInfo.properties");
        //新建一个Map集合
        Properties properties=new Properties();
        //调用properties对象的load方法将文件中的数据加载到Map中
        properties.load(fileInput);

        String name =properties.getProperty("admin");
        System.out.println("获取到的用户名为： "+name);
        String password=properties.getProperty("password");
        System.out.println("获取到的密码是： "+password);

    }
}
