package com.onlineTicketingSystem.controller;

import com.onlineTicketingSystem.pojo.Classify;
<<<<<<< HEAD
import com.onlineTicketingSystem.pojo.Description;
import com.onlineTicketingSystem.pojo.Location;
import com.onlineTicketingSystem.pojo.Moive;
import com.onlineTicketingSystem.server.*;
=======
import com.onlineTicketingSystem.pojo.Location;
import com.onlineTicketingSystem.pojo.Moive;
import com.onlineTicketingSystem.server.ClassifyServer;
import com.onlineTicketingSystem.server.LocationServer;
import com.onlineTicketingSystem.server.MovieServer;
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
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

<<<<<<< HEAD
    @Autowired
    DescriptionServer descriptionServer;

    @Autowired
    GalleryuriServer galleryuriServer;

    @Autowired
    ActosuriServer actosuriServer;

    @Autowired
    SeatsServer seatsServer;

=======
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
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
<<<<<<< HEAD
            for(int j=0;j<locationList.size();j++)
            {
                String information=locationList.get(i).getInformation();
                locationList.get(i).setSeats(seatsServer.findSeatsByName(name,information));
            }

=======
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
            moiveList.get(i).setLocation(locationList);

            Classify classify=new Classify();
            classify=classifyServer.findAllClassifyByName(name);
            moiveList.get(i).setClassify(classify);

<<<<<<< HEAD
            Description description=new Description();
            description=descriptionServer.findAllDescByName(name);

            List<String> galleryURI=new ArrayList<>();
            galleryURI=galleryuriServer.findAllGalleryURIByName(name);
            description.setGallery(galleryURI);

            List<String> actorsURI=new ArrayList<>();
            actorsURI=actosuriServer.findAllActosuriByName(name);
            description.setActor(actorsURI);


            moiveList.get(i).setDescription(description);

=======
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
        }

        return moiveList;
    }
}
