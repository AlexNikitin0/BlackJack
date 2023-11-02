package com.pluralsight;

public class Player {

    private String name;

    private Hand hand;

    private int score;

    public Player(Hand hand,String name){
        this.hand = hand;
        this.name = name;
        this.score = 0;
    }
    public void setName(String name){
        name = name;
    }

    public String getName(){
        return name;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }
}
