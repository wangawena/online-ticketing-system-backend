package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.TickInformationDao;
import com.onlineTicketingSystem.dao.UserDao;
import com.onlineTicketingSystem.pojo.UserTickInformation;
import com.onlineTicketingSystem.pojo.son.TickInformation;
import com.onlineTicketingSystem.server.SeatsServer;
import com.onlineTicketingSystem.server.TickInformationServer;
import com.onlineTicketingSystem.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class TickInformationServerImpl implements TickInformationServer {


    @Autowired
    private TickInformationDao tickInformationDao;

    @Autowired
    SeatsServer seatsServer;

    @Autowired
    UserDao userDao;

    @Override
    public List<TickInformation> findAllTickByName(String username) {

        List<TickInformation> informationList=new ArrayList<>();
        informationList=tickInformationDao.findAllTickByName(username);
        return informationList;
    }

    @Override
    public void ByTick(String username, TickInformation tickInformation) {
        tickInformationDao.ByTick(username,tickInformation);
        String seat=tickInformation.getSeatNumber();
        int id=userDao.selectIdByName(username);
        String information=tickInformation.getInformation();
        seatsServer.updateById(id,information,seat);
    }

    @Override
    public HashSet<String> findAllTickName() {
        HashSet<String> nameList=new HashSet<>();
        nameList=tickInformationDao.findAllTickName();
        return nameList;
    }


}
