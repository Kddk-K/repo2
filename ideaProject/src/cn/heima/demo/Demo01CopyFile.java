package cn.heima.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    /*
        文件复制：一读一写

        数据源：C:\\1.jpg
        数据目的地：D:\\1.jpg

        步骤：
            1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
            2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
            3、使用字节输入流对对象中的方法read读取文件
            4、使用字节输出流中的方法write写入目的地文件
            5、释放资源

     */
    public static void main(String[] args) throws IOException {

        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\1.png");
        FileOutputStream fos = new FileOutputStream("D:\\1.png");


        // 一次读写一个字节，效率低
       /* int len = 0;
        while((len = fis.read()) != -1){
            fos.write(len);
        }*/

        //使用数组缓冲读写多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("耗时：" + (e-s) +"毫秒");

    }
}
