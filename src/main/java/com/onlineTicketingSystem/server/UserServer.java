package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.User;

public interface UserServer {

    public User selectuser(User user);

    public int createUser(User user);
}
