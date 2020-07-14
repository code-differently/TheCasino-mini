package com.codedifferently.casino;


import java.util.Scanner;

public class Casino{

    public static void main(String[] args) {
        Player player1 = new Player("player1", 100.0);
        Player player2 = new Player("player2", 50.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Game: \nGoFish\nBlack Jack");
        String input = scanner.nextLine();

        if(input.equals("Go Fish")) {
            GoFish newG = new GoFish();
            newG.startGame();
        } else {
            BlackJack newB = new BlackJack();
            newB.startGame();
        }
    }
}

