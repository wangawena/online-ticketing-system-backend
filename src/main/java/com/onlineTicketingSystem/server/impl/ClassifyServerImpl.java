package com.onlineTicketingSystem.server.impl;


import com.onlineTicketingSystem.dao.ClassifyDao;
import com.onlineTicketingSystem.pojo.Classify;
import com.onlineTicketingSystem.server.ClassifyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassifyServerImpl  implements ClassifyServer {

    @Autowired
    ClassifyDao classifyDao;

    @Override
    public Classify findAllClassifyByID(int id) {
        Classify classifyList=new Classify();
        classifyList=classifyDao.findAllClassifyByID(id);
        return classifyList;
    }

    @Override
    public void deleteById(int id) {
        classifyDao.deleteById(id);
    }
}
