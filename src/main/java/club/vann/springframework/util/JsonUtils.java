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

import java.util.ArrayList;

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
     * @param obj
     * @return
     */
    public static String object2Json(Object obj){
        String jsonStr = gson.toJson(obj);
        return jsonStr;
    }

    /**
     * Json字符串转换为Bean。
     * @return
     */
    public static BaseBean json2Bean(String jsonStr){
        BaseBean bean = null;
        bean = gson.fromJson(jsonStr, BaseBean.class);
        return bean;
    }

    public static <T> T json2BeanByType(String jsonStr, Class<T> clazz){
        T t = gson.fromJson(jsonStr, clazz);
        return t;
    }

    public static void main(String[] args){
        BaseBean bean = new BaseBean();
        bean.setField("FatherField");
        bean.setFieldList(new ArrayList<Object>());

        BaseBean.Work work = new BaseBean().new Work();
        work.setName("work");
        work.setSize(5);

        String str = JsonUtils.object2Json(bean);
        System.out.println("========== Json :"+str);
    }
}
