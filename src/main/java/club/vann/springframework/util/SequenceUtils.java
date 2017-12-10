/**
 * Copyright (C), 2015-2017
 * FileName: SequenceUtils
 * Author:   fanyun
 * Date:     2017/12/6 21:53
 * Description: 序列生成器
 */
package club.vann.springframework.util;

import java.util.UUID;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/6
 * @since 1.0.0
 */
public class SequenceUtils {
    /**
     * 默认生成的 UUID 格式为 a4279f88-77dc-4bb8-83b3-2cc868976d79
     * @return
     */
    public static String createUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    /**
     * 生成的 UUID 去除‘-’
     * @return
     */
    public static String createStrUUID(){
        String sequence = createUUID();
        return sequence.replaceAll("-", "");
    }

    public static void main(String[] args){
        String sequence = SequenceUtils.createStrUUID();
        System.out.println("UUID: "+sequence);
    }
}
