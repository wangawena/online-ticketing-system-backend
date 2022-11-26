package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Location;

import java.util.List;

public interface LocationServer {

    public List<Location> findAllLocationByID(int id);

    public void deleteById(int id);

    public void insertById(int id,Location location);
}
