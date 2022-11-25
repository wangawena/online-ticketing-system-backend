package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.LocationDao;
import com.onlineTicketingSystem.dao.SeatsDao;
import com.onlineTicketingSystem.pojo.Location;
import com.onlineTicketingSystem.server.LocationServer;
import com.onlineTicketingSystem.server.SeatsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServerImpl implements LocationServer {

    @Autowired
    LocationDao locationDao;

    @Autowired
    SeatsDao seatsDao;

    @Override
    public List<Location> findAllLocationByID(int id) {
        List<Location> locationList=new ArrayList<>();
        locationList=locationDao.selectAllLocationByID(id);
        return locationList;
    }

    @Override
    public void deleteById(int id) {
        locationDao.deleteById(id);
        seatsDao.deleteById(id);
    }
}
