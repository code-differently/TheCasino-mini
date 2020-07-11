package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

import com.codedifferently.casino.Card;
import com.codedifferently.casino.Chip;
import com.codedifferently.casino.Deck;

public class Dealer {
    private Card card;
    private Hand hand;
    private Deck deck;
    private List<Chip> houseChips;

    public Dealer(){
        this.card = new Card("", 0);
        this.hand = new Hand();
        this.deck = new Deck();
        this.houseChips = new ArrayList<Chip>();
    }

    public void distributeCards(Player player, int amountOfCards){
        this.deck.shuffle();
        for(int i = 0; i < amountOfCards; i++){
            player.getMyCards().add(this.deck.removeCard());
        }
    }


    public void getChips(Player player, int amountOfChips){
        for(int i = 0; i < amountOfChips; i++){
            if(player.getMyChipAmount() > 0){
                this.houseChips.add(player.getMyChips().remove(0));
            }
        }
    }

    public void getCards(Player player){
        for(int i = 0; i < player.getMyCardAmount(); i++){
            if(player.getMyCardAmount() > 0){
                this.deck.getCards().add(player.getMyCards().remove(i));
            }
        }
    }

    public void giveWinningChips(Player player, int amountOfChips){
        for(int i = 0; i < amountOfChips; i++){
            player.getMyChips().add(houseChips.remove(i));
        }

    }
}