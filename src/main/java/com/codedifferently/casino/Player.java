package com.codedifferently.casino;
import com.codedifferently.casino.Chip;
import com.codedifferently.casino.Hand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private Chip chip;
    private Hand hand;
    private Card card;
    private String name;
    private int age;
    private List<Chip> myChips;

public Player(String name, int age){
    this.chip = new Chip();
    this.hand = new Hand();
    this.card = new Card("", 0);
    this.name = name;
    this.age = age;
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
public void addCards(Card card){
    this.hand.addHand(card);
   // this.hand.getHand().add(card);
}

public List<Card> getMyCards(){
    return this.hand.getHand();
}
public int getMyCardAmount(){
    return this.hand.getHandSize();
}

public void giveCards(Player player, Card card){
        List<Card> newHand= this.hand.removeHand(card); //what is this the cards removed from the ha
        
        Iterator<Card> iter = newHand.iterator();
        while(iter.hasNext()){
            Card currentCard = iter.next();
            player.addCards(currentCard); // or player.addCards(iter.next())
            iter.remove();
        }
        

    }
public void addChips(Chip chip){
    this.myChips.add(chip);
}

public int getMyChipAmount(){
    return this.myChips.size();
}
public List<Chip> getMyChips(){
    return this.myChips;
}

public void gamble(int amountOfChips){
    if(this.myChips.size() > 0){
        for(int i = 0; i < amountOfChips; i++){
            this.myChips.remove(0);
        }
    } 
}

}