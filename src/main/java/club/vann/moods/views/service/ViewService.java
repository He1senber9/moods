/**
 * Copyright (C), 2015-2017
 * FileName: ViewService
 * Author:   fanyun
 * Date:     2017/12/5 22:06
 * Description: 页面数据业务类
 */
package club.vann.moods.views.service;

import club.vann.moods.base.BaseModel;
import club.vann.moods.base.RequestParam;
import club.vann.moods.base.ResponseParam;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/5
 * @since 1.0.0
 */
public interface ViewService {
    /**
     * 根据条件查询范围内数据。
      * @param requestParam
     * @return
     */
    public ResponseParam queryParagraphList(RequestParam requestParam);

    /**
     * 插入一条数据。
     * @param requestParam
     * @return
     */
    public ResponseParam insertParagraph(RequestParam requestParam);
}
