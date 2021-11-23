package com.example.book.dao.impl;

import com.example.book.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class baseDao {
    // 使用DbUtils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 此方法可以执行：Insert，update，delete语句
     * @param sql 传入的sql语句
     * @param args 动态参数对应sql的参数值
     * @return 返回-1说明失败
     */
    public int update(String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 此方法用于执行查询一个数据的sql语句
     * @param type 返回对向的类型
     * @param sql 传入的sql语句
     * @param args 动态参数对应sql的参数值
     * @param <T> 返回类型的 泛型
     * @return 返回null表示失败
     */
    public <T> T queryForOne(Class<T> type,String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }

    /**
     * 此方法用于执行查询多个数据的sql语句
     * @param type 返回的对象类型
     * @param sql 传入的sql语句
     * @param args 动态参数对应sql的参数值
     * @param <T> 返回的类型的泛型
     * @return 返回null表示失败
     */
    public <T> List<T> queryForList(Class<T> type,String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}












