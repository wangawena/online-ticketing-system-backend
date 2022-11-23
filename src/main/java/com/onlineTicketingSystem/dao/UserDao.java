package com.onlineTicketingSystem.dao;

import com.onlineTicketingSystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    //查询用户
    public User selectUser(User user);


    //根据用户名查询用户
    public String selectByUsername(String username);

    //新增用户
    public void  createUser(User user);

<<<<<<< HEAD

    public List<String> findAllUesr();

=======
>>>>>>> fb62187ea2a516bc84e041260b64858f1b6012ea
}
