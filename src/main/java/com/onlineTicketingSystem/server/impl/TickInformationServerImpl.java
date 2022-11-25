package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.TickInformationDao;
import com.onlineTicketingSystem.pojo.UserTickInformation;
import com.onlineTicketingSystem.pojo.son.TickInformation;
import com.onlineTicketingSystem.server.TickInformationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TickInformationServerImpl implements TickInformationServer {


    @Autowired
    private TickInformationDao tickInformationDao;

    @Override
    public List<TickInformation> findAllTickByName(String username) {

        List<TickInformation> informationList=new ArrayList<>();
        informationList=tickInformationDao.findAllTickByName(username);
        return informationList;
    }

    @Override
    public void ByTick(String username, TickInformation tickInformation) {
        tickInformationDao.ByTick(username,tickInformation);
    }



}
