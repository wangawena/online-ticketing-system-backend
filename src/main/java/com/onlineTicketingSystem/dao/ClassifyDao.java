package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassifyDao {

    public Classify findAllClassifyByID(int id);


    public void deleteById(int id);

    public void insertClassifyById(int id, Classify classify);
}
