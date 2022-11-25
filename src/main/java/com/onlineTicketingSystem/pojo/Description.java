package com.onlineTicketingSystem.pojo;

import java.util.List;

public class Description {
    private List<String> actor;
    private List<String> gallery;
    private String text;
    private List<Comment> comments;

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

    private String actors;



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
