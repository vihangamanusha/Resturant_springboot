package com.tec.restaurant.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant")



public class Restaurant {

    @Id
    private Integer id;
    private String name;
    private String location;
    private Double rating;
    private String cuising;

    public Restaurant() {}

    public Restaurant(Integer id, String name, String location, Double rating, String cuising) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.cuising = cuising;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuising() {
        return cuising;
    }

    public void setCuising(String cuising) {
        this.cuising = cuising;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
