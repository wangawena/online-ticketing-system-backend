package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.Moive;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MovieDao {

    public List<Moive> selectAllInformation();


    public void deleteById(int id);

    public void insertMovie(Moive moive);

    public int findIdByName(String name);
}
