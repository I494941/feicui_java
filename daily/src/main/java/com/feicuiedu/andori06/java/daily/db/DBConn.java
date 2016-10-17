package com.feicuiedu.andori06.java.daily.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 数据库的连接
 * <p>
 * Created by chenyan on 2016/10/10.
 */
public class DBConn {

    private static DBConn dbConn;

    private DBConn() {

    }

    public static DBConn getInstance() {

        if (dbConn == null) {
            dbConn = new DBConn();
        }

        return dbConn;
    }


    public Connection getConneciton() throws
            IOException,
            ClassNotFoundException,
            SQLException {

        Properties properties = new Properties();

        InputStream inputStream = DBConn.class.getResourceAsStream("/config.properties");
        Connection connection = null;

        properties.load(inputStream);
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String userName = properties.getProperty("userName");
        String userPassword = properties.getProperty("userPassword");


        Statement st = null;
        ResultSet rs = null;

        // 注册驱动
        Class.forName(driver);

        // 根据驱动获得连接
        connection = DriverManager.getConnection(url,
                userName,
                userPassword);


        return connection;
    }
}
