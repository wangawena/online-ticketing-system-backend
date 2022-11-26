package com.onlineTicketingSystem.pojo;

import java.util.List;

//电影评论，演员图片，电影海报
public class Description {
    private List<String> actor;//演员图片
    private List<String> gallery;//电影海报
    private String text;//电影简介
    private List<Comment> comments;//电影评论 //似乎以废弃
    private String actors;//演员列表



    public List<String> getGallery() {
        return gallery;
    }

    public void setGallery(List<String> gallery) {
        this.gallery = gallery;
    }

    public List<String> getActor() {
        return actor;
    }

    public void setActor(List<String> actor) {
        this.actor = actor;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
