package com.example.book.service.impl;

import com.example.book.dao.impl.userDaoImpl;
import com.example.book.dao.userDao;
import com.example.book.pojo.User;
import com.example.book.service.userService;

public class userServletImpl implements userService {
    private userDao userDao = new userDaoImpl();
    @Override
    public void registerUser(User user) {
        userDao.saveUser(user);
    }
    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if(userDao.queryUserByUsername(username)==null){
            return false;
        }
        return true;
    }
}
