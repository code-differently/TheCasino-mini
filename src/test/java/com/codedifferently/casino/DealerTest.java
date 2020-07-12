package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.List;
import com.codedifferently.casino.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {
    List<Card> hand = new ArrayList<Card>();
    List<Chip> chips = new ArrayList<Chip>();
    @Test
    public void dealerConstructorTest(){
        //Given
        int expectedChips = 0;
        int expectedHandSize = 0;
        int expectedDeckSize = 0;

        //When
        Dealer dealer = new Dealer();
        int actualChips = dealer.getHouseChipsAmount();
        int actualHandSize = dealer.getMyCardAmount();
        int actualDeckSize = dealer.getDeckSize();

        //Then
        Assert.assertEquals(expectedChips, actualChips);
        Assert.assertEquals(expectedHandSize, actualHandSize);
        Assert.assertEquals(expectedDeckSize, actualDeckSize);
    }
    @Test
    public void addCardsTest(){
        //Given
        int expected = 1;
        //When
        Dealer dealer = new Dealer();
        dealer.addCards(new Card("K", 10));
        int actual = dealer.getMyCardAmount();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test 
    public void getMyCardsTest(){
        //Given
        int expected = 0;
        //When
        Dealer dealer = new Dealer();
        int actual = dealer.getMyCardAmount();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getMyCardAmountTest(){
        //Given
        int expectedSize = 0;
        //When
        Dealer dealer = new Dealer();
        int actualSize = dealer.getMyCardAmount();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void addChipsTest(){
        //Given
        int expectedSize = 1;

        //When
        Dealer dealer = new Dealer();
        dealer.addChips(new Chip());
        int actualSize = dealer.getHouseChipsAmount();
            
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void getMyChipAmountTest(){
        //Given
        int expectedSize = 0;

        //When
        Dealer dealer = new Dealer();
        int actualSize = dealer.getHouseChipsAmount();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void getMyChipsTest(){
        //Given
        int expectedSize = 2;

        //When
        Dealer dealer = new Dealer();
        dealer.addChips(new Chip());
        dealer.addChips(new Chip());
        int actualSize = dealer.getHouseChipsAmount();
            
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void getDeck(){
        //Given
        int expected = 0;

        //When
        Dealer dealer = new Dealer();
        int actual = dealer.getDeckSize();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDeckSize(){
        //Given
        int expected = 0;

        //When
        Dealer dealer = new Dealer();
        int actual = dealer.getDeckSize();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void shuffleTest(){
        //Given
        int expected = 52;

        //When
        Dealer dealer = new Dealer();
        dealer.shuffle();
        int actual = dealer.getDeckSize();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void resetDeckTest(){
        //Given
        int expected = 52;

        //When
        Dealer dealer = new Dealer();
        dealer.resetDeck();
        int actual = dealer.getDeckSize();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeCardTest(){
        //Given
        int expectedDeckSize = 51;
        //When
        Dealer dealer = new Dealer();
        dealer.shuffle();
        dealer.removeCard();
        int actualDeckSize = dealer.getDeckSize();
        //Then
        Assert.assertEquals(expectedDeckSize, actualDeckSize);


    }
    @Test
    public void distributeCardsTest(){
        //Given
        int expectedTabbyAmountCards = 5;
        int expectedDeckSize = 47;
        //When
        Dealer dealer = new Dealer();
        Player Tabby = new Player("Tabby", 23);
        dealer.distributeCards(Tabby, 5);
        int actualTabbyCards = Tabby.getMyCardAmount();
        int actualDeckSize = dealer.getDeckSize();
        //Then
        Assert.assertEquals(expectedTabbyAmountCards, actualTabbyCards);
        Assert.assertEquals(expectedDeckSize, actualDeckSize);

    }

    @Test 
    public void getChipsTest(){
        //Given
        int expectedTabbyChips = 1;
        int expectedHouseChipsSize = 4;
        //When
        Dealer dealer = new Dealer();
        Player Tabby = new Player("Tabby", 23);
        Tabby.addChips(new Chip());
        Tabby.addChips(new Chip());
        Tabby.addChips(new Chip());
        Tabby.addChips(new Chip());
        Tabby.addChips(new Chip());
        dealer.getChips(Tabby, 4);
        int actualTabbyChips = Tabby.getMyChipAmount();
        int actualHouseChipsSize = dealer.getHouseChipsAmount();
        //Then
        Assert.assertEquals(expectedTabbyChips, actualTabbyChips);
        Assert.assertEquals(expectedHouseChipsSize, actualHouseChipsSize);

    }

    @Test
    public void getCardsTest() {
        //Given
        int expectedTabbyCards = 0;
        int expectedDeckCards = 52;
        //int expected = 2;
        //When
        Dealer dealer = new Dealer();
        Player Tabby = new Player("Tabby", 23);
        dealer.distributeCards(Tabby, 2);
        //int actual = Tabby.getMyCardAmount();
        dealer.getCards(Tabby);
        int actualTabbyCards = Tabby.getMyCardAmount();
        int actualDeckCards = dealer.getDeckSize();
        //Then
       // Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedTabbyCards, actualTabbyCards);
        Assert.assertEquals(expectedDeckCards, actualDeckCards);

    }

    @Test
    public void giveWinningChipsTest(){
        //Given
        int expectedHouseChips = 3;
        int expectedPlayerChips = 2;
        //When
        Dealer dealer = new Dealer();
        Player player = new Player("Bill", 21);
        dealer.addChips(new Chip());
        dealer.addChips(new Chip());
        dealer.addChips(new Chip());
        dealer.addChips(new Chip());
        dealer.addChips(new Chip());
        dealer.giveWinningChips(player, 2);
        int actualHouseChips = dealer.getHouseChipsAmount();
        int actualPlayerChips = player.getMyChipAmount();
        //Then
        Assert.assertEquals(expectedHouseChips, actualHouseChips);
        Assert.assertEquals(expectedPlayerChips, actualPlayerChips);
    }

}