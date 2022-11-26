package com.onlineTicketingSystem.server;

import java.util.List;

public interface GalleryuriServer {

    public List<String> findAllGalleryURIByID(int id);

    public void deleteById(int id);

    public void insertById(int id,List<String> gallery);

}
