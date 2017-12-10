/**
 * Copyright (C), 2015-2017
 * FileName: ViewDao
 * Author:   fanyun
 * Date:     2017/12/7 20:05
 * Description:
 */
package club.vann.moods.views.dao;

import club.vann.moods.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/7
 * @since 1.0.0
 */
@Repository
public class ViewDao extends BaseDao{
    public List<Map<String, Object>> queryList() throws SQLException {
        Connection connection = super.getConnection();
        return null;
    }
}
