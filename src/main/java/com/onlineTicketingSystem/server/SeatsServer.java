package com.onlineTicketingSystem.server;

public interface SeatsServer {


    public String[][] findSeatsByID(int id,String information);

    public void deleteById(int id);


    public void updateById(int id, String information,String seat);

}
