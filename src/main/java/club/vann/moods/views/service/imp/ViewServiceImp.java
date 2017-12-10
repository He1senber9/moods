/**
 * Copyright (C), 2015-2017
 * FileName: ViewServiceImp
 * Author:   fanyun
 * Date:     2017/12/5 22:06
 * Description:
 */
package club.vann.moods.views.service.imp;

import club.vann.moods.base.BaseModel;
import club.vann.moods.base.RequestParam;
import club.vann.moods.base.ResponseParam;
import club.vann.moods.views.dao.ViewDao;
import club.vann.moods.views.model.ParagraphModel;
import club.vann.moods.views.service.ViewService;
import club.vann.springframework.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/5
 * @since 1.0.0
 */
@Service
public class ViewServiceImp implements ViewService {
    @Autowired
    private ViewDao viewDao;

    public ResponseParam queryParagraphList(RequestParam requestParam) {
       // List<Map<String, Object>> list = viewDao.queryList();
       // String json = JsonUtils.object2Json(list);
       // System.out.println("TAG : "+json);
        return null;
    }

    public ResponseParam insertParagraph(RequestParam requestParam) {
        return null;
    }
}
