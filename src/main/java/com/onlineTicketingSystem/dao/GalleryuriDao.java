package com.onlineTicketingSystem.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface GalleryuriDao {

    public List<String> findAllGalleryURIByID(int id);


    public void deleteById(int id);


    public void insertById(int id,String gallery);
}
