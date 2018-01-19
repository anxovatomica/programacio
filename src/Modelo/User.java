package Modelo;

import java.util.*;


public class User {
    private String username;
    private String password;
    private Integer stucoins;
    private int level;
    private String place;
    private int points;
    private ArrayList<Contact> amigos;
    private ArrayList<Inventory> inventario;

    public User(String username, String password, Integer stucoins, int level, String place, int points) {
        this.username = username;
        this.password = password;
        this.stucoins = stucoins;
        this.level = level;
        this.place = place;
        this.points = points;
        amigos = new ArrayList<>();
        inventario = new ArrayList<>();
        
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStucoins() {
        return stucoins;
    }

    public void setStucoins(Integer stucoins) {
        this.stucoins = stucoins;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
}
