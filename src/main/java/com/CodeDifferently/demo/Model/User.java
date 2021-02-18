package com.CodeDifferently.demo.Model;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name ="Activities")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "favoriteActivities")
    private ArrayList<Activity> favoriteActivities;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<Activity> getFavoriteActivities() {
        return favoriteActivities;
    }

    public void setFavoriteActivities(ArrayList<Activity> favoriteActivities) {
        this.favoriteActivities = favoriteActivities;
    }


}
