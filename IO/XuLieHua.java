package learninging0910.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XuLieHua {
    public static void main(String[] args) throws Exception{
        List<userss> userssList=new ArrayList<>();
        userssList.add(new userss(1,"sir A"));
        userssList.add(new userss(2,"sir B"));
        userssList.add(new userss(3,"sir C"));
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("IO\\users"));
        objectOutputStream.writeObject(userssList);//对对象进行序列化
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
