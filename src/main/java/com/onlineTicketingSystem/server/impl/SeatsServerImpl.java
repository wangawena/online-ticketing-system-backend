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

    @Override
    public void deleteById(int id) {
        seatsDao.deleteById(id);
    }

    @Override
    public void updateById(int id, String information, String seat) {
        String seatPast=seatsDao.findSeatsID(id,information);
        String seatNow;
        if("".equals(seatPast))
            seatNow=getXY(seat);
        else
            seatNow=seatPast+" "+getXY(seat);

        System.out.println(seatNow);
        seatsDao.updateById(id,information,seatNow);
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


    public String getXY(String seat)
    {
        String xy="";
        int seatSize=seat.length();

        for(int i=0;i<seatSize;i++)
        {
            if(seat.charAt(i)=='排')
            {
                int xx=Integer.valueOf(seat.charAt(i-1))-48-1;
                int yy=Integer.valueOf(seat.charAt(i+1))-48-1;
                System.out.println("xx:"+xx+" yy:"+yy);
                xy=xx+","+yy;
            }
        }

        System.out.println("xy:" +xy);
        return xy;
    }
}
