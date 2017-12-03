/**
 * Copyright (C), 2015-2017
 * FileName: JsonUtils
 * Author:   fanyun
 * Date:     2017/12/3 15:29
 * Description: 框架内JSON字符串处理工具
 */
package club.vann.springframework.util;

import club.vann.springframework.bean.BaseBean;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/3
 * @since 1.0.0
 */
public class JsonUtils {
    private static Gson gson = new GsonBuilder().create();

    /**
     * 实体类转为Json字符串。
     *
     * @param bean
     * @return
     */
    public static String bean2Json(BaseBean bean){
        String jsonStr = gson.toJson(bean);
        return jsonStr;
    }


    public static BaseBean json2Bean(){
        BaseBean bean = null;
        return bean;
    }
}
