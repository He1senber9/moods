/**
 * Copyright (C), 2015-2017
 * FileName: PropertiesUtils
 * Author:   fanyun
 * Date:     2017/12/3 21:27
 * Description: 属性文件操作工具类
 */
package club.vann.springframework.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/3
 * @since 1.0.0
 */
public class PropertiesUtils {
    /**
     * 根据文件全路径加载属性文件。
     *
     * @param filePath
     * @return
     */
    public static Properties loadProperties(String filePath){
        Properties properties = new Properties();
        InputStream inputStream = loadFileToInpuStream(filePath);

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return properties;
    }

    private static InputStream loadFileToInpuStream(String filePath){
        InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream(filePath);

        return inputStream;
    }
}
