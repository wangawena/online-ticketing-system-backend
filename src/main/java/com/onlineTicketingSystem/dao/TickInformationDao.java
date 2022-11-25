package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.UserTickInformation;
import com.onlineTicketingSystem.pojo.son.TickInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;

@Mapper
@Repository
public interface TickInformationDao {

    public List<TickInformation> findAllTickByName(String username);

    public void ByTick(@Param("username") String username, @Param("tickInformation") TickInformation tickInformation);


    public HashSet<String> findAllTickName();

}
