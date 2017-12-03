/**
 * Copyright (C), 2015-2017
 * FileName: AbstractMessage
 * Author:   fanyun
 * Date:     2017/12/2 19:11
 * Description: 中间件消息的抽象实现
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
public class AbstractMessage implements Message{
    private boolean isSuccess;
    private Map<String, Object> dataMap;
    private List<BaseBean> baseDataList;
    private List<Map<String, Object>> dataList;

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public Map<String, Object> getDataMap() {
        return this.dataMap;
    }

    public List<Map<String, Object>> getDataList() {
        return this.dataList;
    }

    public List<BaseBean> getBaseDataList() {
        return this.baseDataList;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

    public void setBaseDataList(List<BaseBean> baseDataList) {
        this.baseDataList = baseDataList;
    }

    public void setDataList(List<Map<String, Object>> dataList) {
        this.dataList = dataList;
    }
}
