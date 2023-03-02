package learninging0910.TCPTest;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Sever {
    public static void main(String[] args) throws Exception{
        //监听9999端口、
        ServerSocket serverSocket = new ServerSocket(9999);
        //没有链接时堵塞，等待链接
        Socket socket = serverSocket.accept();//监听状态，下面不执行
        //如果有链接
        System.out.println("socket ="+socket.getClass());
        InputStream inputStream = socket.getInputStream();
        //创建数组用于读取
        byte[] bytes = new byte[1024];
        int readLine;
        while ((readLine=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readLine));
        }
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
