package com.onlineTicketingSystem.pojo.son;


//购票信息
public class TickInformation {

    private String brand;//电影院名称
    private String name;//电影名
    private String date;//排场日期
    private String seatNumber;//厅号 几排几座
    private String image;//电影图片
    private String price;//价格

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TickInformation{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
