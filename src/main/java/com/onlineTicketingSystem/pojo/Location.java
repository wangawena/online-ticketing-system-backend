package com.onlineTicketingSystem.pojo;

public class Location {
    private String information;
    private String[][] seats;
    private String date;
    private String brand;
    private String district;
    private String cinemaType;
    private String service;
    private String address;
    private String price;
    private String time;
    private String language;
    private String room;


    public void setAddress(String address) {
        this.address = address;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCinemaType(String cinemaType) {
        this.cinemaType = cinemaType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }



    public String getDate() {
        return date;
    }

    public String getBrand() {
        return brand;
    }

    public String getDistrict() {
        return district;
    }

    public String getCinemaType() {
        return cinemaType;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }


    public String[][] getSeats() {
        return seats;
    }

    public void setSeats(String[][] seats) {
        this.seats = seats;
    }
}
