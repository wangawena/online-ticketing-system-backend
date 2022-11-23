package com.onlineTicketingSystem.dao;


import com.onlineTicketingSystem.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentDao {

    public List<Comment> findAllCommentByID(int id);
}
