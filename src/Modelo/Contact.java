package Modelo;

import java.time.LocalDate;

public class Contact {
    private Character character;
    private LocalDate date;
    private int level;
    private int points;

    public Contact(Character character, LocalDate date, int level, int points) {
       
        this.character = character;
        this.date = date;
        this.level = level;
        this.points = points;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

   
    
}