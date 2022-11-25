package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Information;

import java.util.List;

public interface InformationServer {

    public List<Information> findInformationByName(String username);
}
