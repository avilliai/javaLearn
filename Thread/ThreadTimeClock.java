package learninging0910.Thread;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadTimeClock {
    public static void main(String[] args) throws Exception{
        Timer timer = new Timer();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date firstTime=simpleDateFormat.parse("2022-9-22 21:11:00");
        timer.schedule(new logTimerTask(),firstTime,1000*10);


    }
}
class logTimerTask extends TimerTask{

    @Override
    public void run() {
        PrintStream p = null;
        try {
            p = new PrintStream(new FileOutputStream("Thread\\log.txt",true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(p);//注释以更改输出方向
        Date date = new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        String s= dateFormat.format(date);
        System.out.println(s +"  :"+"执行成功");


        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM:dd HH:mm:ss:SSS");

        String Time=simpleDateFormat.format(new Date());
        System.out.println(Time+"进行了备份");

         */
    }
}