package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {


    public User selectUser(User user);
}
