package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Classify;

import java.util.List;

public interface ClassifyServer {

    public Classify findAllClassifyByID(int id);


    public void deleteById(int id);

    public void insertById(int id,Classify classify);
}
