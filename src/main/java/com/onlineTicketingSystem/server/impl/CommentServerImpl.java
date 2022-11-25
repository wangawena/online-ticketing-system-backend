package com.onlineTicketingSystem.server.impl;

import com.onlineTicketingSystem.dao.CommentDao;
import com.onlineTicketingSystem.pojo.Comment;
import com.onlineTicketingSystem.server.CommentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServerImpl  implements CommentServer {

    @Autowired
    CommentDao commentDao;

    @Override
    public List<Comment> findAllCommentByID(int id) {
        List<Comment> commentList=new ArrayList<>();
        commentList=commentDao.findAllCommentByID(id);

        return commentList;
    }
}
