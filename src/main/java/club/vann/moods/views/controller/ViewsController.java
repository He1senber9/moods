/**
 * Copyright (C), 2015-2017
 * FileName: ViewsController
 * Author:   fanyun
 * Date:     2017/12/2 19:00
 * Description:前台数据控制器
 */
package club.vann.moods.views.controller;

import club.vann.moods.base.BaseController;
import club.vann.moods.base.RequestParam;
import club.vann.moods.base.ResponseParam;
import club.vann.moods.views.service.ViewService;
import club.vann.springframework.provide.message.Message;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/2
 * @since 1.0.0
 */
@Controller
@RequestMapping("/views")
public class ViewsController extends BaseController {
    protected final Log log = LogFactory.getLog(getClass());

    @Autowired
    private ViewService viewService;

    @RequestMapping("/index")
    public void index(){
        System.out.println("******* TAG");
    }

    /**
     * 拉取数据。数据形式以Json格式返回。
     *
     * @return
     */
    @RequestMapping("/refresh")
    public String refreshDate(RequestParam requestParam){
        super.actionRequest(requestParam);
        Message message = null;
        message.isSuccess();
        ResponseParam responseParam = viewService.queryParagraphList(requestParam);
        return responseToClient(responseParam);
    }

    @RequestMapping("/insert")
    public void insertParagarph(){

    }
}
