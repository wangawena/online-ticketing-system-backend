package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.UserTickInformation;
import com.onlineTicketingSystem.pojo.son.TickInformation;

import java.util.List;

public interface TickInformationServer {


    public List<TickInformation> findAllTickByName(String username);

    public void ByTick(UserTickInformation userTickInformation);
}
