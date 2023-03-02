package learninging0910;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String name =s.next();
        Scanner s2= new Scanner(System.in);
        System.out.println("请输入您的密码");
        String password = s2.next();
        userService a=new userService();
        try {
            a.register(name,password);
        } catch (userNameException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
