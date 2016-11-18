package com.yb.domain;


/**
 * Created by 杨波 on 2016/11/15.
 */
public class Flight {
    private Integer fid;
    private String number;
    private String start;
    private String end;
    private String date;
    private String starttime;
    private String endtime;
    private Integer seats;
    private Double price;
    private Integer discountvote;
    private Double discountrate;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getDiscountrate() {
        return discountrate;
    }

    public void setDiscountrate(Double diacountrate) {
        this.discountrate = diacountrate;
    }

    public Integer getDiscountvote() {
        return discountvote;
    }

    public void setDiscountvote(Integer discountvote) {
        this.discountvote = discountvote;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}
