/**
 * Copyright (C), 2015-2017
 * FileName: IOUtils
 * Author:   fanyun
 * Date:     2017/12/9 18:32
 * Description: 输入输出流工具类
 */
package club.vann.springframework.util;

import java.io.*;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/9
 * @since 1.0.0
 */
public class IOUtils {

    public final static String ENCODING_UTF8 = "UTF-8";
    public final static String ENCODING_GBK = "GBK";

    private final static int DEFAULT_SIZE = 1024 * 10;

    /**
     * 根据文件路径获取文件内容，默认按照UTF-8解析。
     * @param path
     * @return
     */
    public static String getStringByPath(String path) throws IOException {
        return getStringByPath(path, ENCODING_UTF8);
    }

    /**
     * 根据文件路径 文件编码解析文件。
     * @param path
     * @param encoding
     * @return
     * @throws IOException
     */
    public static String getStringByPath(String path, String encoding) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();

        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] by = new byte[DEFAULT_SIZE];
        int len = -1;
        while((len = fileInputStream.read(by)) != -1) {
            stringBuffer.append(new String(by, 0, len, encoding));
        }

        fileInputStream.close();

        return stringBuffer.toString();
    }

    public static String getStringByPathWithBuffer(String path) throws IOException {
        return getStringByPath(path, ENCODING_GBK);
    }

    public static String getStringByPathWithBuffer(String path, String encoding) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        File file = new File(path);
        Reader reader = new FileReader(file);
//        reader.
        return "";
    }

    public static String getStringByPathWithReader(String path) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        char[] ch = new char[DEFAULT_SIZE];
        int len = -1;
        while((len = fileReader.read(ch)) != -1) {
            stringBuffer.append(new String(ch, 0, len));
        }
        fileReader.close();
        return stringBuffer.toString();
    }

    public static void main(String[] args){
        String path = "E:\\WorkSpaces\\moods\\src\\main\\java\\club\\vann\\springframework\\util\\IOUtils.java";
        try {
            String str = IOUtils.getStringByPath(path);
//            String str = IOUtils.getStringByPathWithReader(path);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
