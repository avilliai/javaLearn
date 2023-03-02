package learninging0910.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopy {
    public static void main(String[] args) {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn= new FileInputStream("D:\\狠活\\IGS.mp4");
            fileOut=new FileOutputStream("D:\\狠活\\i got smoke.mp4");
            byte[] bytes=new byte[1024*1024];
            int readAccont =0;
            while ((readAccont=fileIn.read(bytes))!=-1){
                fileOut.write(bytes,0,readAccont);

            }
            fileOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileIn!=null){
                try {
                    fileIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOut!=null){
                try {
                    fileOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
