package learninging0910.TCPTest;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketTCP01Client {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);//链接本机的9999端口
        System.out.println("socket Connect");
        //发送信息给服务端
        OutputStream outputStream= socket.getOutputStream();//创建流
        outputStream.write("hello sever".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();//设置写入结束标记防止互锁
        outputStream.close();
        socket.close();
    }
}
