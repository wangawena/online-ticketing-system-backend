package com.onlineTicketingSystem.pojo;

import com.onlineTicketingSystem.pojo.son.TickInformation;

import java.util.List;

public class UserTickInformation {

    private String username;
    private List<TickInformation> tickInformation;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<TickInformation> getTickInformation() {
        return tickInformation;
    }

    public void setTickInformation(List<TickInformation> tickInformation) {
        this.tickInformation = tickInformation;
    }
}
