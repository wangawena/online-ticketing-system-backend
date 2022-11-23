package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.User;

import java.util.List;

public interface UserServer {

    public User selectuser(User user);

    public int createUser(User user);
<<<<<<< HEAD


    public List<String > findAllUSer();
=======
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
}
