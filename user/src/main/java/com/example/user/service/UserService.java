package com.example.user.service;


import com.example.user.dao.impl.UserDao;
import com.example.user.pojo.User;

import java.util.List;

public class UserService {
        UserDao userDao = new UserDao();
       public User getUser(String username,String password){
               return userDao.getUser(username,password);
       }
       public List<User> getAll(){
               return userDao.getAll();
       }
}
