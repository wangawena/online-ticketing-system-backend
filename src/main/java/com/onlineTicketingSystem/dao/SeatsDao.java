package com.onlineTicketingSystem.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SeatsDao {

    public String findSeatsID(int id,String information);

}