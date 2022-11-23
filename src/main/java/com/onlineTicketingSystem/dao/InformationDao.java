package com.onlineTicketingSystem.dao;


import com.onlineTicketingSystem.pojo.Information;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InformationDao {

    public List<Information> findInformationByName(String username);

}
