/**
 * Copyright (C), 2015-2017
 * FileName: BaseController
 * Author:   fanyun
 * Date:     2017/11/29 21:44
 * Description: 父控制器
 */
package club.vann.moods.base;

import club.vann.springframework.util.JsonUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 *
 * @author fanyun
 * @create 2017/11/29
 * @since 1.0.0
 */
public class BaseController {
    protected Log log = LogFactory.getLog(getClass());

    /**
     * 用于请求参数的统一校验。
     *
     */
    protected void actionRequest(RequestParam requestParam) {
        if(null == requestParam) {
          log.error("请求参数为空！");
          return;
        }
        log.debug("请求参数列表："+JsonUtils.object2Json(requestParam));
    }

    /**
     * 响应信息给客户端。
     * @param responseParam
     * @return
     */
    protected String responseToClient(ResponseParam responseParam){
        return JsonUtils.object2Json(responseParam);
    }
}
