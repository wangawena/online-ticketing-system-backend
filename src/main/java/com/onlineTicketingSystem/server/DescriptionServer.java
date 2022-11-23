package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Description;

public interface DescriptionServer {

    public Description findAllDescByName(String name);

}
