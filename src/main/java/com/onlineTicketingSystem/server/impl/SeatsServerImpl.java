package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.SeatsDao;
import com.onlineTicketingSystem.server.SeatsServer;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SeatsServerImpl implements SeatsServer {

    @Autowired
    SeatsDao seatsDao;

    int x=5;

    @Value("${seatsy}")
    int y=6;
    @Override
    public String[][] findSeatsByID(int id,String information) {
        String xy=seatsDao.findSeatsID(id,information);
        String[][] seats=stringToArray(xy);
        return seats;
    }



    public String[][] stringToArray(String xy)
    {
        String[][] seats=new String[x][y];

        for(int i=0;i<x;i++)
            Arrays.fill(seats[i],"false");

        int size=xy.length();
        int now=0;
        System.out.println(xy);
        System.out.println(size);
        while(now <size)
        {
            int a=Integer.valueOf(xy.charAt(now))-48;
            int b=Integer.valueOf(xy.charAt(now+2))-48;
            System.out.println(a+" "+b);
            seats[a][b]="true";
            System.out.println(now);
            now+=4;

        }
        return seats;
    }
}
