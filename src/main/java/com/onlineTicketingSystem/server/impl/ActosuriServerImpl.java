package com.onlineTicketingSystem.server.impl;


import com.onlineTicketingSystem.dao.ActosuriDao;
import com.onlineTicketingSystem.server.ActosuriServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActosuriServerImpl implements ActosuriServer {


    @Autowired
    ActosuriDao actosuriDao;

    @Override
    public List<String> findAllActosuriByID(int id) {

        List<String> actorsURI=new ArrayList<>();
        actorsURI=actosuriDao.findAllActosuriByID(id);
        return actorsURI;
    }
}
