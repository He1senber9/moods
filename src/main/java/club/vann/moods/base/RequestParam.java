/**
 * Copyright (C), 2015-2017
 * FileName: RequestParam
 * Author:   fanyun
 * Date:     2017/12/10 20:03
 * Description: 请求定义基类
 */
package club.vann.moods.base;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/10
 * @since 1.0.0
 */
public class RequestParam {
    /** 是否分页，默认是不分页 */
    private boolean isPageing = false;
    /** 分页开始页 */
    private int pageBegin = 1;
    /** 分页结束页 */
    private int pageEnd = 10;

    /** 数据域 */
    private BaseModel model;

    public boolean isPageing() {
        return isPageing;
    }

    public void setPageing(boolean pageing) {
        isPageing = pageing;
    }

    public int getPageBegin() {
        return pageBegin;
    }

    public void setPageBegin(int pageBegin) {
        this.pageBegin = pageBegin;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

    public BaseModel getModel() {
        return model;
    }

    public void setModel(BaseModel model) {
        this.model = model;
    }
}
