package com.example.user.dao.impl;

import com.example.user.pojo.User;
import com.example.user.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private QueryRunner queryRunner = new QueryRunner();
    public User getUserByName(String username){
        Connection con = JdbcUtils.getConnection();
        String sql = "select 'id','username','password' from user where username = ?";
        try {
            return queryRunner.query(con,sql,new BeanHandler<User>(User.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(con);
        }
        return null;
    }
    public List<User> getAll(){
        String sql = "select 'id','username','password' from user";
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con,sql,new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }
    public User getUser(String username, String password){
        Connection con = JdbcUtils.getConnection();
        String sql = "select 'username' from user where username = ? and password = ? ";
        try {
            return queryRunner.query(con,sql,new BeanHandler<User>(User.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(con);
        }
        return null;
    }
}
