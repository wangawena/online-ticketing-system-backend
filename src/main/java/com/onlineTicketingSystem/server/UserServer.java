package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.User;

import java.util.List;

public interface UserServer {

    public User selectuser(User user);

    public int createUser(User user);


    public List<String > findAllUSer();

}
