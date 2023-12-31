package com.example.yatra.Model;


public class BookingModel {
    private String img_url;
    private String description;

//    private String discount;

    private String room_type;
    private int room_count;
    private String UserId;
    private boolean rated; // Indicates whether the hotel has been rated
    private String booking_id;
    private String hotel_name;
    private String check_in_date;
    private String check_out_date;
    private int total_price;
    private String room_price;
    private String location;

    private Double rating;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public BookingModel() {
        // Required empty public constructor
    }

    public BookingModel(String room_type, boolean rated,String description, String img_url, String UserId, String booking_id, int total_price, String room_price, String location, int room_count, String hotel_name, String check_in_date, String check_out_date, Double rating, String status) {
        this.room_type = room_type;
        this.description = description;
        this.rated = rated;
//        this.discount = discount;
        this.img_url = img_url;
        this.UserId = UserId;
        this.booking_id = booking_id;
        this.room_count = room_count;
        this.hotel_name = hotel_name;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.room_price = room_price;
        this.total_price = total_price;
        this.location = location;
        this.rating = rating;
        this.status =status;
//        this.hotel_id = hotel_id;
    }


    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getRoom_price() {
        return room_price;
    }

    public void setRoom_price(String room_price) {
        this.room_price = room_price;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getRoom_count() {
        return room_count;
    }

    public void setRoom_count(int room_count) {
        this.room_count = room_count;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(String check_out_date) {
        this.check_out_date = check_out_date;
    }


    public boolean hasRated() {
        return rated;
    }

    public void setRated(boolean rated) {
        this.rated = rated;
    }
}
