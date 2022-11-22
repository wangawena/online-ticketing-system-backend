package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.MovieDao;
import com.onlineTicketingSystem.pojo.Moive;
import com.onlineTicketingSystem.server.MovieServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServerImpl implements MovieServer {

    @Autowired
    MovieDao movieDao;

    @Override
    public List<Moive> selectAllInformation() {
        List<Moive> list=new ArrayList<>();
        list=movieDao.selectAllInformation();
        return list;
    }
}
