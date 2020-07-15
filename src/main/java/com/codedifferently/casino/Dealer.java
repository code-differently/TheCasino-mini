package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;

import com.codedifferently.casino.Chip;
import com.codedifferently.casino.Deck;

public class Dealer {
    private Hand hand;
    private Deck deck;
    private List<Chip> houseChips;

    public Dealer(){
        this.hand = new Hand();
        this.deck = new Deck();
        this.houseChips = new ArrayList<Chip>();
    }
    public void addCards(Card card){
        this.hand.getHand().add(card);
    }
    
    public List<Card> getMyCards(){
        return this.hand.getHand();
    }
    public int getMyCardAmount(){
        return this.hand.getHandSize();
    }
    public void addChips(Chip chip){
        this.houseChips.add(chip);
    }
    
    public int getHouseChipsAmount(){
        return this.houseChips.size();
    }
    public List<Chip> getHouseChips(){
        return this.houseChips;
    }
    public List<Card> getDeck(){
        return this.deck.getCards();
    }
    public void shuffle(){
        this.deck.shuffle();
    }
    public void resetDeck(){
        this.deck.resetDeck();
    }
    public int getDeckSize(){
        return this.deck.getCards().size();
    }
    public Card removeCard(){
        return this.deck.removeCard();
    }

    public void distributeCards(Player player, int amountOfCards){
        this.deck.shuffle();
        for(int i = 0; i < amountOfCards; i++){
            player.addCards(this.deck.removeCard());
            //player.getMyCards().add(this.deck.removeCard());
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
        while(!player.getMyCards().isEmpty()){
            this.deck.getCards().add(player.getMyCards().remove(0));
        }
    }

    public void giveWinningChips(Player player, int amountOfChips){
        for(int i = 0; i < amountOfChips; i++){
            player.addChips(this.houseChips.remove(0));
        }

    }
}