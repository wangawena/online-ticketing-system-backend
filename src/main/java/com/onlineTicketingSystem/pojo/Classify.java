package com.onlineTicketingSystem.pojo;

public class Classify {

    private String type;//类型
    private String region;//区域
    private String period;//年代

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeriod() {
        return period;
    }

    public String getRegion() {
        return region;
    }

    public String getType() {
        return type;
    }
}
