package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.Description;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface DescriptionDao {


    public Description findAllDescByName(String name);
}
