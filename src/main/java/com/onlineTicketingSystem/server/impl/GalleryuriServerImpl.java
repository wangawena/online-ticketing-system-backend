package com.onlineTicketingSystem.server.impl;


import com.onlineTicketingSystem.dao.GalleryuriDao;
import com.onlineTicketingSystem.server.GalleryuriServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class GalleryuriServerImpl  implements GalleryuriServer {

    @Autowired
    GalleryuriDao galleryuriDao;

    @Override
    public List<String> findAllGalleryURIByID(int id) {
        List<String> galleryURI=new ArrayList<>();
        galleryURI=galleryuriDao.findAllGalleryURIByID(id);
        return galleryURI;
    }

    @Override
    public void deleteById(int id) {
        galleryuriDao.deleteById(id);
    }

    @Override
    public void insertById(int id, List<String> gallery) {
        galleryuriDao.insertById(id,gallery);
    }
}
