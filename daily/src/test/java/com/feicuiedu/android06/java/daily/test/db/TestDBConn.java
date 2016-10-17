package com.feicuiedu.android06.java.daily.test.db;

import com.feicuiedu.andori06.java.daily.db.DBConn;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by chenyan on 2016/10/17.
 */
public class TestDBConn {

    @Test
    public void testGetConnection() {

        Properties properties = new Properties();

        InputStream inputStream = DBConn.class.getResourceAsStream("/config.properties");
        Connection connection = null;

        try {
            properties.load(inputStream);
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String userName = properties.getProperty("userName");
            String userPassword = properties.getProperty("userPassword");

            System.out.println("1234");
            Logger.getLogger("com.feicuiedu.android06.java.daily.test.db.TestDBConn").info(driver);
            System.out.println("5678");

            Statement st = null;
            ResultSet rs = null;

            // 注册驱动
            Class.forName(driver);

            // 根据驱动获得连接
            connection = DriverManager.getConnection(url,
                    userName,
                    userPassword);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
