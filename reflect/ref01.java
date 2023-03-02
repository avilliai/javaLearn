package learninging0910.reflect;

import java.io.FileReader;
import java.util.Properties;

public class ref01 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("reflect\\af.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        String className = pro.getProperty("className");

        Class c = Class.forName(className);
        c.newInstance();//成功创建对象，同时创建对象类型由配置文件决定，符合ocp原则
    }
}
