package com.onlineTicketingSystem.pojo;

import com.onlineTicketingSystem.dao.InformationDao;

import java.util.List;


//订单  弃用
public class Order {
    private  String username;
    private List<Information> information;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Information> getInformation() {
        return information;
    }

    public void setInformation(List<Information> information) {
        this.information = information;
    }
}
