package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Description;
import sun.security.krb5.internal.crypto.Des;

public interface DescriptionServer {

    public Description findAllDescByID(int id);


    public void deleteById(int id);

    public void insertById(int id, Description description);
}
