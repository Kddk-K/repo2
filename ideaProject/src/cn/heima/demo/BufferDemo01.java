package cn.heima.demo;

import java.io.*;

public class BufferDemo01 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        //一般方法：基本流
        /*FileInputStream fis = new FileInputStream("C:\\demo");
        FileOutputStream fos = new FileOutputStream("D:\\copy");*/

        //缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\demo"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\demo"));

        int len;
        while((len = bis.read()) != -1){
            try {
                bos.write(len);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        long e = System.currentTimeMillis();
        System.out.println("耗时：" + (e-s) + "毫秒");
    }
}
