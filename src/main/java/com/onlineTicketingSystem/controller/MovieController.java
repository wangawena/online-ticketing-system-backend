package com.onlineTicketingSystem.controller;

import com.onlineTicketingSystem.pojo.*;
import com.onlineTicketingSystem.server.*;
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

    @Autowired
    DescriptionServer descriptionServer;

    @Autowired
    GalleryuriServer galleryuriServer;

    @Autowired
    ActosuriServer actosuriServer;

    @Autowired
    SeatsServer seatsServer;

    @Autowired
    CommentServer commentServer;


    @GetMapping("/findAll")
    public List<Moive> findAll()
    {
        List<Moive> moiveList=new ArrayList<>();
        moiveList=movieServer.selectAllInformation();

        int size=moiveList.size();
        for(int i=0;i<size;i++)
        {
            int  id=moiveList.get(i).getId();

            List<Location> locationList=new ArrayList<>();
            locationList=locationServer.findAllLocationByID(id);
            for(int j=0;j<locationList.size();j++)
            {
                String information=locationList.get(i).getInformation();
                locationList.get(i).setSeats(seatsServer.findSeatsByID(id,information));
            }

            moiveList.get(i).setLocation(locationList);

            Classify classify=new Classify();
            classify=classifyServer.findAllClassifyByID(id);
            moiveList.get(i).setClassify(classify);

            Description description=new Description();
            description=descriptionServer.findAllDescByID(id);

            List<String> galleryURI=new ArrayList<>();
            galleryURI=galleryuriServer.findAllGalleryURIByID(id);
            description.setGallery(galleryURI);

            List<String> actorsURI=new ArrayList<>();
            actorsURI=actosuriServer.findAllActosuriByID(id);
            description.setActor(actorsURI);

            List<Comment> commentList=new ArrayList<>();
            commentList=commentServer.findAllCommentByID(id);
            description.setComments(commentList);

            moiveList.get(i).setDescription(description);

        }

        return moiveList;
    }
}
