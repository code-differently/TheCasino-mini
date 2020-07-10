package com.codedifferently.casino;
import com.codedifferently.casino.Chip;
import com.codedifferently.casino.Hand;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private Chip chip;
    private Hand hand;
    private Card card;
    private String name;
    private int age;
    private List<Chip> myChips;

public Player(String name, int age){
    this.name = name;
    this.age = age;
    this.hand.getHand();
    this.myChips = new ArrayList<Chip>();
}

public String getName(){
    return this.name;
}

public int getAge(){
    if(this.age >= 21){
    return this.age;
    }
    else{
        return 0;
    }

}
public List<Card> getMyCards(){
    return this.hand.getHand();
}

public void giveCards(Player player, Card card){
    if(this.hand.getHandSize() > 0){
        for(int i = 0; i < this.hand.getHandSize(); i++){
            if(this.hand.getHand().get(i).getSuit() == card.getSuit() &&
            this.hand.getHand().get(i).getNumber() == card.getNumber())
            {
                player.getMyCards().add(this.hand.removeHand(this.hand.getHand().get(i)));
            }
        }
    }
    
}
public int getMyChipAmount(){
    return this.myChips.size();
}

public void gamble(int amountOfChips){
    if(this.myChips.size() > 0){
        for(int i = 0; i < amountOfChips; i++){
            this.myChips.remove(chip);
        }
    } 
}

}