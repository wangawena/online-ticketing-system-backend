package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.dao.MovieDao;
import com.onlineTicketingSystem.pojo.Moive;

import java.util.List;

public interface MovieServer {

    public List<Moive> selectAllInformation();


    public void deleteById(int id);

    public void addMovie(Moive moive);

    public int findIdByName(String name);
}
