package learninging0910.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest01 {
    public static void main(String[] args) {
        FileInputStream file=null;//放在外边
        /*字节流
        * |inputStream
        * |outputStream
        * 字符流
        * |reader
        * |writer
        * */
        try {
            file = new FileInputStream("D:\\Mirai\\temp");

            //使用while循环进行遍历
           /* while (true){
                int read=file.read();
                if (read==-1){
                    break;
                }
                System.out.println(read);
            }
            */

            //改造while循环
            /*int read = 0;
            while ((read = file.read()) !=-1){
                System.out.println(read);
            }
            //字节流缺点，读取效率较低
            //再度改进、
             */

            /*int read = 0;
            byte[] byteRead = new byte[4];//读取四个字节
            System.out.println(file.read(byteRead));//把字节放进数组
            System.out.println(new String(byteRead,0,2));//

             */
            //将以上代码改造成循环
           /*
           int read = 0;
           byte[] bytes = new byte[5];
            while (true){
                int read = file.read(bytes);
                if (read ==-1){
                    break;
                }
                    System.out.println(new String(bytes));
            }
            */
            //终极改造
            int read =0;
            byte[] bytes = new byte[3];
            while (file.read(bytes)!=-1){
                System.out.println(new String(bytes));
                System.out.println("remains:"+file.available());//剩下的字节数量
            }
            //可以用file.available()新建相应大小数组，不用循环，不适合大文件








        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (file!=null){
                try {
                    file.close();//关闭流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
