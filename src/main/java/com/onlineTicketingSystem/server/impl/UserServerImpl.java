package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.UserDao;
import com.onlineTicketingSystem.pojo.User;
import com.onlineTicketingSystem.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UserDao userDao;

    @Override
    public User selectuser(User user) {
       User u=userDao.selectUser(user);
       return u;
    }
}
