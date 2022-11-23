package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.UserDao;
import com.onlineTicketingSystem.pojo.User;
import com.onlineTicketingSystem.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UserDao userDao;

    //登录
    @Override
    public User selectuser(User user) {
       User u=userDao.selectUser(user);
       return u;
    }

    //注册
    @Override
    public int createUser(User user) {

        String existUser;//判断用户名是否存在
        existUser= userDao.selectByUsername(user.getUsername());
        System.out.println("UserServerImpl exitUser:"+existUser);
        if(Integer.parseInt(existUser)!=0)
<<<<<<< HEAD
            return 402;//用户名重复
=======
            return 202;//用户名重复
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
        else
        {
            userDao.createUser(user);
            return 200;
        }
    }
<<<<<<< HEAD

    @Override
    public List<String> findAllUSer() {
        return userDao.findAllUesr();
    }
=======
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
}
