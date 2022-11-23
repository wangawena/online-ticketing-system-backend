package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.Location;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LocationDao {

    public List<Location> selectAllLocationByName(String name);
}
