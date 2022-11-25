package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.MovieDao;
import com.onlineTicketingSystem.pojo.Moive;
import com.onlineTicketingSystem.server.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServerImpl implements MovieServer {

    @Autowired
    MovieDao movieDao;

    @Autowired
    ClassifyServer classifyServer;

    @Autowired
    DescriptionServer descriptionServer;

    @Autowired
    LocationServer locationServer;
    @Override
    public List<Moive> selectAllInformation() {
        List<Moive> list=new ArrayList<>();
        list=movieDao.selectAllInformation();
        return list;
    }

    @Override
    public void deleteById(int id) {

        //删除电影类型信息
        classifyServer.deleteById(id);
        //删除电影信息
        descriptionServer.deleteById(id);
        //删除上映信息
        locationServer.deleteById(id);
        //删除电影
        movieDao.deleteById(id);

    }


}
