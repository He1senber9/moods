/**
 * Copyright (C), 2015-2017
 * FileName: ViewsController
 * Author:   fanyun
 * Date:     2017/12/2 19:00
 * Description:前台数据控制器
 */
package club.vann.moods.views.controller;

import club.vann.moods.base.BaseController;
import club.vann.springframework.provide.message.Message;
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
    /**
     * 拉取数据。数据形式以Json格式返回。
     *
     * @return
     */
    @RequestMapping("/refresh")
    public String refreshDate(){
        Message message = null;

        message.isSuccess();
        return "";
    }
}
