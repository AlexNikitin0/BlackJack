package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){
// only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }
    public String getValue(){
// only return the value if the card is face up
        if(isFaceUp){
// this is the string value of the card
// i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue(){
        //define vars


// only return the value if the card is face up
        if(isFaceUp){

// determine point value and return it
// A = 11
// K, Q, J = 10
// all numeric cards are equal to their face value
            if(value.equalsIgnoreCase("a")){
                return 11;
            }
            else if(value.equalsIgnoreCase("k") || value.equalsIgnoreCase("q") || value.equalsIgnoreCase("j")){
                return 10;
            }
            else if(value.equals("1")){
                return 1;
            }
            else if(value.equals("2")){
                return 2;
            }
            else if(value.equals("3")){
                return 3;
            }
            else if(value.equals("4")){
                return 4;
            }
            else if(value.equals("5")){
                return 5;
            }
            else if(value.equals("6")){
                return 6;
            }
            else if(value.equals("7")){
                return 7;
            }
            else if(value.equals("8")){
                return 8;
            }
            else if(value.equals("9")){
                return 9;
            }
            else {
                return 10;
            }
        } else {
            return 0;
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
