package learninging0910.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public class FanXuLieHua  {
    public static void main(String[] args) throws Exception{
        ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("IO\\users"));
       // Object obj= objectInputStream.readObject();
        //System.out.println("----------------------");
        List<userss> userssList = (List<userss>) objectInputStream.readObject();
        for (userss user:userssList){
            System.out.println(user);
        }
        objectInputStream.close();
    }
}
