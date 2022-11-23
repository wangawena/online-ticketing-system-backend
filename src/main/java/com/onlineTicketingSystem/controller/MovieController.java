package com.onlineTicketingSystem.controller;

import com.onlineTicketingSystem.pojo.Classify;
import com.onlineTicketingSystem.pojo.Location;
import com.onlineTicketingSystem.pojo.Moive;
import com.onlineTicketingSystem.server.ClassifyServer;
import com.onlineTicketingSystem.server.LocationServer;
import com.onlineTicketingSystem.server.MovieServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    MovieServer movieServer;

    @Autowired
    LocationServer locationServer;

    @Autowired
    ClassifyServer classifyServer;

    @GetMapping("/findAll")
    public List<Moive> findAll()
    {
        List<Moive> moiveList=new ArrayList<>();
        moiveList=movieServer.selectAllInformation();

        int size=moiveList.size();
        for(int i=0;i<size;i++)
        {
            String name=moiveList.get(i).getName();

            List<Location> locationList=new ArrayList<>();
            locationList=locationServer.findAllLocationByName(name);
            moiveList.get(i).setLocation(locationList);

            Classify classify=new Classify();
            classify=classifyServer.findAllClassifyByName(name);
            moiveList.get(i).setClassify(classify);

        }

        return moiveList;
    }
}
