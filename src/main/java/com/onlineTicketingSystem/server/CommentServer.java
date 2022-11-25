package com.onlineTicketingSystem.server;

import com.onlineTicketingSystem.pojo.Comment;

import java.util.List;

public interface CommentServer {

    public List<Comment> findAllCommentByID(int id);
}
