package com.codedifferently.casino;

import java.util.Scanner;

public class Casino {

    public static void main(String[]args){
        Player Bob = new Player("Bob", 21);
        Player Lil = new Player("Lil", 23);
        boolean winner = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Casino, what game would you like to play today?");
        System.out.println("******** CASINO GAMES ********\nGo Fish\nBlackJack");
        String gameName = scanner.nextLine();

        if(gameName.equals("Go Fish")){
            System.out.println("You have chosen to play Go Fish");
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("What is your age?");
            int age = scanner.nextInt();
            if(age < 21){
                System.out.println("Sorry, you're not 21 or up, come back when you're older.");
            }
            else{
                GoFish game = new GoFish();
                game.addPlayers(Bob);
                game.addPlayers(Lil);
                game.addPlayers(new Player(name, age));
                game.goFish();
                while(!winner){
                    for (int i = 0; i < game.getPlayersSize(); i++) {
                        if(i != game.getPlayersSize() - 1 && i != game.getPlayersSize() - 2){
                        game.askForCards(game.getPlayers().get(i), game.getPlayers().get(i + 1), game.getPlayers().get(i + 1).getMyCards().get(0));
                        }
                        else if(i == game.getPlayersSize() - 2){
                            System.out.println("It is " + game.getPlayers().get(i).getName() + "s turn");
                            if(game.getPlayers().get(i))





                            
                            System.out.println(game.getPlayers().get(i).getName() + " is asking for "




                            game.askForCards(game.getPlayers().get(i), game.getPlayers().get(i + 1), card)
                        }

                    }
                }
                
            }

        }




    }

}
