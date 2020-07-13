package com.codedifferently.casino;

import java.util.Scanner;

public class Casino {

    public static void main(String[]args){
        Player Bob = new Player("Bob", 21);
        Player Lil = new Player("Lil", 23);
        boolean winnerFound = false;
        String winner = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Casino, what game would you like to play today?");
        System.out.println("******** CASINO GAMES ********\nGo Fish\nBlackJack");
        String gameName = scanner.nextLine();

        if(gameName.equalsIgnoreCase("Go Fish")){
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
                System.out.println("Game is about to begin...");
                while(!winnerFound){
                    for (int i = 0; i < game.getPlayersSize(); i++) {
                        Player currentPlayer=game.getPlayers().get(i);
                        System.out.println(currentPlayer.getName()+"'s Hand");
                        for (Card card : currentPlayer.getMyCards()) {
                            System.out.printf("Suit:%s, Rank:%d\n",card.getSuit(), card.getNumber());
                        }
                        System.out.println();
                        Scanner scanStr=new Scanner(System.in);
                        Scanner scanInt=new Scanner(System.in);
                        System.out.println("It's your turn, what card would you like to ask for?\nMUST be exact rank/suit");
                        System.out.println("Type a suit UPPERCASE or leave BLANK (ex: 'Q'): ");
                        String chosenSuit= scanStr.nextLine().toUpperCase();
                        System.out.println("Type a rank (ex: 10): ");
                        int chosenCard = scanInt.nextInt();
                        System.out.println("Player list");
                        for (Player currPlayer : game.getPlayers()) {
                            System.out.println(currPlayer.getName());    
                        }
                        System.out.println("Enter person's name you want to ask for cards");
                        String playerInputted = scanStr.nextLine();
                        for (Player currPlayer : game.getPlayers()) {
                            if(currPlayer.getName().equalsIgnoreCase(playerInputted)){
                                System.out.println(game.askForCards(currentPlayer, currPlayer, new Card(chosenSuit, chosenCard)));
                                /*
                                if(game.askForCards(currentPlayer, currPlayer, new Card(chosenSuit, chosenCard)).equalsIgnoreCase("Go Fish")){
                                    System.out.println("GO FISH!");
                                    game.takeACard(currentPlayer);
                                }
                                else
                                    System.out.println("CARDS TAKEN");

                                    */
                            }
                        }
                        

                        

                        


                        /*
                        game.askForCards(game.getPlayers().get(i), game.getPlayers().get(0)
                        , game.getPlayers().get(0).getMyCards().get(0));
                        if(i != game.getPlayersSize() - 1)
                        {
                            game.askForCards(game.getPlayers().get(i), game.getPlayers().get(i + 1)
                            , game.getPlayers().get(i + 1).getMyCards().get(0));
                        }
                        else
                        {
                            System.out.println("It's your turn, what card would you like to ask for?");
                            game.askForCards(game.getPlayers().get(i), game.getPlayers().get(0)
                            , game.getPlayers().get(0).getMyCards().get(0));
                        }
                    }
                    */
                        if(currentPlayer.getMyCardAmount() == 0){
                            winner = currentPlayer.getName();
                            winnerFound = true;
                        }

                    }
                    
                }
                System.out.println("Congratulations, the player that cleared out their hand the fastest was: " + winner);
                game.endGame();
                
            }

        }




    }

}
