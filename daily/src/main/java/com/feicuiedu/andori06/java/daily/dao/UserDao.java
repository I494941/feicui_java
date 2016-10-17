package com.feicuiedu.andori06.java.daily.dao;

import com.feicuiedu.andori06.java.daily.db.DBUtils;
import com.feicuiedu.andori06.java.daily.entity.User;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyan on 2016/10/17.
 */
public class UserDao {

    // 新增一笔user_资料

    public void saveUser(User user) throws
            SQLException,
            IOException,
            ClassNotFoundException {


        StringBuilder sql = new StringBuilder();
        sql.append(" insert into ");
        sql.append("    user_ ");
        sql.append("        (id,login_name,name,sex,birthday,password,description)  ");
        sql.append("    values");
        sql.append("         ('" + user.getId() + "','" + user.getLoginName() + "','" + user.getName() + "','" + user.getSex() + "',");
        sql.append("          '" + user.getBirthday() + "','" + user.getPassword() + "','" + user.getDescription() + "')");

        DBUtils.modifyTable(sql.toString());
    }

    // 根据条件 返回user资料集合
    public List<User> getUserByCondition(User user) {

        StringBuilder sb = new StringBuilder();
        sb.append(" select ");
        sb.append("     * ");
        sb.append(" from ");
        sb.append("     user_ ");
        sb.append(" where 1=1 ");

        if (user.getId() != null) {

            sb.append(" and    id = '" + user.getId() + "'");
        }

        if (user.getName() != null) {

            sb.append(" and  name = '" + user.getName() + "'");
        }

        if (user.getBirthday() != null) {

            sb.append(" and  birthday = '" + user.getBirthday()+ "'");
        }

        if (user.getSex() != null) {

            sb.append(" and  sex = '" + user.getSex()+ "'");
        }

        if (user.getLoginName() != null) {

            sb.append(" and  login_name = '" + user.getLoginName()+ "'");
        }

        if (user.getDescription() != null) {

            sb.append(" and  description = '" + user.getDescription()+ "'");
        }

        if (user.getPassword() != null) {

            sb.append(" and  password = '" + user.getPassword()+ "'");
        }

        System.out.println(sb.toString());
        List<User> listUser = new ArrayList<User>();

        List<Map<String, Object>> list = DBUtils.queryTable(sb.toString());

        for (Map<String, Object> map : list) {

            Long id = (Long) map.get("id");
            String name = (String) map.get("name");
            String loginName = (String) map.get("login_name");
            String sex = (String) map.get("sex");
            Date birthday = (Date) map.get("birthday");
            String password = (String) map.get("password");
            String description = (String) map.get("description");


            User tmpUser = new User();

            tmpUser.setId(new BigInteger(id + ""));
            tmpUser.setName(name);
            tmpUser.setLoginName(loginName);
            tmpUser.setSex(sex);
            tmpUser.setBirthday(birthday);
            tmpUser.setPassword(password);
            tmpUser.setDescription(description);
            listUser.add(tmpUser);
        }

        return listUser;
    }
}
