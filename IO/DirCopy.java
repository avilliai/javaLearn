package learninging0910.IO;

import java.io.*;

public class DirCopy {
    public static void main(String[] args) {
        File src = new File("D:\\狠活");
        File dest = new File("E:\\");
        copyDir(src,dest);
        System.out.println("拷贝完成");
    }

    private static void copyDir(File src, File dest) {
        if (src.isFile()){//如果src是一个文件
            FileInputStream fileInputStream=null;//创建输入流
            FileOutputStream fileOutputStream= null;//创建输出流
            try {
                fileInputStream = new FileInputStream(src);//实例化输入流对象
                fileOutputStream= new FileOutputStream((dest.getAbsolutePath().endsWith("\\")? dest.getAbsolutePath(): dest.getAbsolutePath()+"\\")+src.getAbsolutePath().substring(3));
                byte[] bytes=new byte[1024*1024];//创建数组
                int ints=0;//读到的字节数
                while ((ints=fileInputStream.read(bytes))!=-1){
                    fileOutputStream.write(bytes,0,ints);
                }
                fileOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fileInputStream!=null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileOutputStream!=null){
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] files=src.listFiles();
        System.out.println("剩余单位数量"+files.length);//查看文件（以及文件夹数量）
        for (File file:files){
           // System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                String srcDir = file.getAbsolutePath();//获取当前文件的绝对路径
                String destDir = (dest.getAbsolutePath().endsWith("\\")? dest.getAbsolutePath(): dest.getAbsolutePath()+"\\")+srcDir.substring(3);//+"\\"+srcDir.substring(3);//创建目标的目录
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
                System.out.println("已创建目录---------->"+destDir);

            }
            copyDir(file,dest);//巧妙地递归
        }
    }

}
