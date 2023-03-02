package learninging0910.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class logTest01 {
    public void log(String msg){
        PrintStream p = null;
        try {
            p = new PrintStream(new FileOutputStream("D:\\狠活\\test\\log.txt",true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(p);
        Date date = new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        String s= dateFormat.format(date);
        System.out.println(s +"  :"+msg);
    }
}
