package learninging0910.IO;
import java.io.FileNotFoundException;
import  java.io.FileReader;
import java.io.IOException;

public class FileReaders {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
            fileReader=new FileReader("D:\\狠活\\test\\2.txt");
            char[] chars =new char[10];
            int accont =0;
            while ((accont= fileReader.read(chars))!=-1){
                System.out.println(new String(chars,0,accont));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
