package learninging0910.path;

import java.util.ResourceBundle;

public class pathTest01 {
    public static void main(String[] args) {
        //在src下的类可以用这种方法
        String path = Thread.currentThread().getContextClassLoader().getResource("afs.properties").getPath();
        System.out.println(path);
        //第二种
        ResourceBundle rb = ResourceBundle.getBundle("adf");
        String CLASS = rb.getString("className");

    }
}
