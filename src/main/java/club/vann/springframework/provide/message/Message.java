/**
 * Copyright (C), 2015-2017
 * FileName: Message
 * Author:   fanyun
 * Date:     2017/12/2 19:10
 * Description: 框架内消息传递中间件
 */
package club.vann.springframework.provide.message;

import club.vann.springframework.bean.BaseBean;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/2
 * @since 1.0.0
 */
public interface Message {
    /**
     * 判断流程是否为成功状态。
     *
     * @return
     */
    public boolean isSuccess();

    public Map<String, Object> getDataMap();

    public List<Map<String, Object>> getDataList();

    public List<BaseBean> getBaseDataList();
}
