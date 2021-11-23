package com.example.book.dao.impl;

import com.example.book.dao.userDao;
import com.example.book.pojo.User;

public class userDaoImpl extends baseDao implements userDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select 'id','username','password' from user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select 'id','username','password' from user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into user('username','password') values (?,?,?)";
        return update(sql,user.getUsername(),user.getPassword());
    }
}
