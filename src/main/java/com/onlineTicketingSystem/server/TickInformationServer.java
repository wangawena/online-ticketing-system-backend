package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Information;
import com.onlineTicketingSystem.pojo.UserTickInformation;
import com.onlineTicketingSystem.pojo.son.TickInformation;

import java.util.HashSet;
import java.util.List;

public interface TickInformationServer {


    public List<TickInformation> findAllTickByName(String username);


    public void ByTick(String username, TickInformation tickInformation);

    public HashSet<String> findAllTickName();
}
