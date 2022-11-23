package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.LocationDao;
import com.onlineTicketingSystem.pojo.Location;
import com.onlineTicketingSystem.server.LocationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServerImpl implements LocationServer {

    @Autowired
    LocationDao locationDao;

    @Override
    public List<Location> findAllLocationByName(String name) {
        List<Location> locationList=new ArrayList<>();
        locationList=locationDao.selectAllLocationByName(name);
        return locationList;
    }
}
