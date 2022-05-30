package com.example.netflixbueno;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Valid
@Table(name= "title")
public class Title {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(message = "Id cannot be null")
    private int id;

    @NotEmpty(message = "title cannot be empty")
    private String name;

    private String date_added;

    @Range( min= 100, max = 2022, message = "release_year should be lowe or equals to 2022")
    private String release_year;


    private String rating;

    private String duration;

    private String description;

    @Min(0L)
    private Float user_rating;


    @Min(value = 0, message = "num of ratings cannot be lower than 0")
    private Integer num_ratings;

    public Title() {

    }

    public Title(int id, String name, String date_added, String release_year, String rating, String duration, String description, Float user_rating, Integer num_ratings) {
        this.id = id;
        this.name = name;
        this.date_added = date_added;
        this.release_year = release_year;
        this.rating = rating;
        this.duration = duration;
        this.description = description;
        this.user_rating = user_rating;
        this.num_ratings = num_ratings;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUseer_rating() {
        return user_rating;
    }

    public void setUseer_rating(Float useer_rating) {
        this.user_rating = useer_rating;
    }

    public Integer getNum_ratings() {
        return num_ratings;
    }

    public void setNum_ratings(Integer num_ratings) {
        this.num_ratings = num_ratings;
    }



}
