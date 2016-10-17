package com.feicuiedu.andori06.java.daily.services;

import com.feicuiedu.andori06.java.daily.dao.UserDao;
import com.feicuiedu.andori06.java.daily.entity.User;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyan on 2016/10/17.
 */
public class UserService {


    public Map<String, String> login(String loginName,
                                     String password) {

        Map<String, String> resultMap = new HashMap<String, String>();

        UserDao userDao = new UserDao();

        User paramUser = new User(loginName,
                password);
        List<User> list = userDao.getUserByCondition(paramUser);

        if (!list.isEmpty()) {
            resultMap.put("result",
                    "success");
            resultMap.put("userId",
                    list.get(0)
                            .getId()
                            .toString());
        } else {
            resultMap.put("result",
                    "failed");
        }

        return resultMap;
    }

    public  Map<String, String> register(String name,
                         String sex,
                         Date birthday,
                         String loginName,
                         String password,
                         String description) {

        long userId = System.currentTimeMillis();

        Map<String, String> resultMap = new HashMap<String, String>();

        User user = new User(
                name,
                loginName,
                sex,
                birthday,
                password,
                description
        );

        BigInteger id = new BigInteger(userId+"");

        user.setId(id);
        UserDao userDao = new UserDao();
        try {
            userDao.saveUser(user);

            resultMap.put("result",
                    "success");
        }
        catch (SQLException e) {
            e.printStackTrace();

            resultMap.put("result",
                    "failed!"+e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();

            resultMap.put("result",
                    "failed!"+e.getMessage());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();

            resultMap.put("result",
                    "failed!"+e.getMessage());
        }

        return resultMap;
    }
}
