package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassifyDao {

    public Classify findAllClassifyByName(String name);
}
