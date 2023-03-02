package learninging0910;

public class userService {
    public void  register(String name,String password) throws userNameException {
        if (name==null|name.length()<6 |name.length()>14){
            throw new userNameException("用户名不合法");
        }else {
            System.out.println("注册成功");
        }
    }
}
