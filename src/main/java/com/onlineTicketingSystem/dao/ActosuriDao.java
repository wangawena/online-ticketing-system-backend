package com.onlineTicketingSystem.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ActosuriDao {


    public List<String> findAllActosuriByID(int id);


    public void deleteById(int id);


    public void insertById(int id,String actor);
}
