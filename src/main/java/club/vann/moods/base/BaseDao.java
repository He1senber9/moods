/**
 * Copyright (C), 2015-2017
 * FileName: BaseDao
 * Author:   fanyun
 * Date:     2017/12/7 20:16
 * Description:
 */
package club.vann.moods.base;

import club.vann.springframework.db.DruidDataPool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/7
 * @since 1.0.0
 */
public class BaseDao {

    public Connection getConnection() throws SQLException {
        return DruidDataPool.getConnection();
    }
}
