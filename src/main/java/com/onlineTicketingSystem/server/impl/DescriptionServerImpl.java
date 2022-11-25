package com.onlineTicketingSystem.server.impl;


import com.onlineTicketingSystem.dao.DescriptionDao;
import com.onlineTicketingSystem.pojo.Description;
import com.onlineTicketingSystem.server.DescriptionServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionServerImpl implements DescriptionServer {

    @Autowired
    DescriptionDao descriptionDao;

    @Override
    public Description findAllDescByID(int id) {
        Description description=new Description();
        description=descriptionDao.findAllDescByID(id);
        return description;
    }
}