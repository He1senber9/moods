/**
 * Copyright (C), 2015-2017
 * FileName: DruidDataPool
 * Author:   fanyun
 * Date:     2017/12/3 15:51
 * Description: Druid数据池
 */
package club.vann.springframework.db;

import club.vann.springframework.util.PropertiesUtils;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;
import java.util.Properties;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/3
 * @since 1.0.0
 */
public class DruidDataPool {
    private static DruidDataSource dataSource = null;

    private static class DruidDataPoolHolder{
        public static DruidDataPool dataPool = new DruidDataPool();
    }

    static {
        /* 默认需要从类文件根目录下读取 */
        Properties properties = PropertiesUtils.loadProperties("db/db_conf.properties");

        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 单例
     */
    private DruidDataPool(){}

    private void init(){
        DruidPooledConnection connection;
    }

    /**
     * 数据库连接池实例。
     * @return
     */
    public static DruidDataPool getInstance(){
        return DruidDataPoolHolder.dataPool;
    }

    /**
     * 得到一个数据库连接。
     * @return
     * @throws SQLException
     */
    public static DruidPooledConnection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 释放链接到数据库池中。
     *
     */
    public static void close(){
        dataSource.close();
    }
}
