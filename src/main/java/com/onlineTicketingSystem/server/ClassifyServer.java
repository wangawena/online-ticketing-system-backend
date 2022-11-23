package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Classify;

import java.util.List;

public interface ClassifyServer {

    public Classify findAllClassifyByID(int id);
}
