package com.pluralsight;
import java.util.*;
public class BlackJack {
    public static void main(String[] args) {
        //declare variables
        String winner = "Winner!";
        String loser = "Loser";
        String tie = "Tie!";
        String playerName;
        int numofPlayers;
        Scanner keyBoard = new Scanner(System.in);
        Deck deck = new Deck();
        int score;
        //hashmap to store player info like name and score
        ArrayList<Player> players = new ArrayList<>();

        //get user input
        System.out.println("Welcome to Black Jack!");
        System.out.println("How many are playing?");
        numofPlayers = keyBoard.nextInt();
        keyBoard.nextLine();
        System.out.println("What is your name?");
//for each player, ask for name and assign hand and name to each
        for(int i=1;i < numofPlayers+1;i++){
            System.out.print(" Player["+ i +"]: ");
            playerName = keyBoard.nextLine();
            Hand hand = new Hand();
            Player player = new Player(hand,playerName);
            deck.shuffle();//for each player, deal card and shuffle twice
            hand.Deal(deck.deal());
            deck.shuffle();
            hand.Deal(deck.deal());
            score = hand.getValue();
            player.setScore(score);
            players.add(player);


        }


        for(int i = 0; i < players.size();i++){



            System.out.println("Player: " + players.get(i).getName() + " Score " + players.get(i).getScore()+"\n");
            //win condition
            //if player is over 21, remove from list
            if(players.get(i).getScore() > 21){
                players.remove(i);
            }


            Comparator<Player> compareScores = (o1, o2) -> Integer.compare(o1.getScore(), o2.getScore());


            Collections.sort(players,compareScores );


        }//end for loop

        System.out.println(players.get(players.size()-1).getName() + " is the Winner with score of: " + players.get(players.size()-1).getScore());





    }//end main
}
