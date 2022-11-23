package com.onlineTicketingSystem.server.impl;


import com.onlineTicketingSystem.dao.InformationDao;
import com.onlineTicketingSystem.pojo.Information;
import com.onlineTicketingSystem.server.InformationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InformationServerImpl implements InformationServer {

    @Autowired
    InformationDao informationDao;

    @Override
    public List<Information> findInformationByName(String username) {

        List<Information> informationList=new ArrayList<>();
        informationList=informationDao.findInformationByName(username);
        return informationList;
    }
}
