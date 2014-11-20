package com.syntacticsugar.sequence;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck extends Card 
{	
	// 'deck' contains two full sets of cards, plus Jokers.
	public ArrayList<Card> deck = new ArrayList<Card>();

 	public Deck() 
 	{	
 		// Clubs - 1
 		deck.add(new Card("A", "Clubs"));
 		deck.add(new Card("2", "Clubs"));
 		deck.add(new Card("3", "Clubs"));
 		deck.add(new Card("4", "Clubs"));
 		deck.add(new Card("5", "Clubs"));
 		deck.add(new Card("6", "Clubs"));
 		deck.add(new Card("7", "Clubs"));
 		deck.add(new Card("8", "Clubs"));
 		deck.add(new Card("9", "Clubs"));
 		deck.add(new Card("10", "Clubs"));
 		deck.add(new Card("J", "Clubs"));
 		deck.add(new Card("Q", "Clubs"));
 		deck.add(new Card("K", "Clubs"));
 		
 		// Clubs - 2
 		
 		deck.add(new Card("A", "Clubs"));
 		deck.add(new Card("2", "Clubs"));
 		deck.add(new Card("3", "Clubs"));
 		deck.add(new Card("4", "Clubs"));
 		deck.add(new Card("5", "Clubs"));
 		deck.add(new Card("6", "Clubs"));
 		deck.add(new Card("7", "Clubs"));
 		deck.add(new Card("8", "Clubs"));
 		deck.add(new Card("9", "Clubs"));
 		deck.add(new Card("10", "Clubs"));
 		deck.add(new Card("J", "Clubs"));
 		deck.add(new Card("Q", "Clubs"));
 		deck.add(new Card("K", "Clubs"));
 		
 		// Diamonds - 1
 		
 		deck.add(new Card("A", "Diamonds"));
 		deck.add(new Card("2", "Diamonds"));
 		deck.add(new Card("3", "Diamonds"));
 		deck.add(new Card("4", "Diamonds"));
 		deck.add(new Card("5", "Diamonds"));
 		deck.add(new Card("6", "Diamonds"));
 		deck.add(new Card("7", "Diamonds"));
 		deck.add(new Card("8", "Diamonds"));
 		deck.add(new Card("9", "Diamonds"));
 		deck.add(new Card("10", "Diamonds"));
 		deck.add(new Card("J", "Diamonds"));
 		deck.add(new Card("Q", "Diamonds"));
 		deck.add(new Card("K", "Diamonds"));
 		
 		// Diamonds - 2
 		
 		deck.add(new Card("A", "Diamonds"));
 		deck.add(new Card("2", "Diamonds"));
 		deck.add(new Card("3", "Diamonds"));
 		deck.add(new Card("4", "Diamonds"));
 		deck.add(new Card("5", "Diamonds"));
 		deck.add(new Card("6", "Diamonds"));
 		deck.add(new Card("7", "Diamonds"));
 		deck.add(new Card("8", "Diamonds"));
 		deck.add(new Card("9", "Diamonds"));
 		deck.add(new Card("10", "Diamonds"));
 		deck.add(new Card("J", "Diamonds"));
 		deck.add(new Card("Q", "Diamonds"));
 		deck.add(new Card("K", "Diamonds"));
 		
 		// Hearts - 1
 		
 		deck.add(new Card("A", "Hearts"));
 		deck.add(new Card("2", "Hearts"));
 		deck.add(new Card("3", "Hearts"));
 		deck.add(new Card("4", "Hearts"));
 		deck.add(new Card("5", "Hearts"));
 		deck.add(new Card("6", "Hearts"));
 		deck.add(new Card("7", "Hearts"));
 		deck.add(new Card("8", "Hearts"));
 		deck.add(new Card("9", "Hearts"));
 		deck.add(new Card("10", "Hearts"));
 		deck.add(new Card("J", "Hearts"));
 		deck.add(new Card("Q", "Hearts"));
 		deck.add(new Card("K", "Hearts"));
 		
 		// Hearts - 2
 		
 		deck.add(new Card("A", "Hearts"));
 		deck.add(new Card("2", "Hearts"));
 		deck.add(new Card("3", "Hearts"));
 		deck.add(new Card("4", "Hearts"));
 		deck.add(new Card("5", "Hearts"));
 		deck.add(new Card("6", "Hearts"));
 		deck.add(new Card("7", "Hearts"));
 		deck.add(new Card("8", "Hearts"));
 		deck.add(new Card("9", "Hearts"));
 		deck.add(new Card("10", "Hearts"));
 		deck.add(new Card("J", "Hearts"));
 		deck.add(new Card("Q", "Hearts"));
 		deck.add(new Card("K", "Hearts"));
 		
 		// Spades - 1
 		
 		deck.add(new Card("A", "Spades"));
 		deck.add(new Card("2", "Spades"));
 		deck.add(new Card("3", "Spades"));
 		deck.add(new Card("4", "Spades"));
 		deck.add(new Card("5", "Spades"));
 		deck.add(new Card("6", "Spades"));
 		deck.add(new Card("7", "Spades"));
 		deck.add(new Card("8", "Spades"));
 		deck.add(new Card("9", "Spades"));
 		deck.add(new Card("10", "Spades"));
 		deck.add(new Card("J", "Spades"));
 		deck.add(new Card("Q", "Spades"));
 		deck.add(new Card("K", "Spades"));
 		
 		// Spades - 2
 		
 		deck.add(new Card("A", "Spades"));
 		deck.add(new Card("2", "Spades"));
 		deck.add(new Card("3", "Spades"));
 		deck.add(new Card("4", "Spades"));
 		deck.add(new Card("5", "Spades"));
 		deck.add(new Card("6", "Spades"));
 		deck.add(new Card("7", "Spades"));
 		deck.add(new Card("8", "Spades"));
 		deck.add(new Card("9", "Spades"));
 		deck.add(new Card("10", "Spades"));
 		deck.add(new Card("J", "Spades"));
 		deck.add(new Card("Q", "Spades"));
 		deck.add(new Card("K", "Spades"));
 		/*
 		// Jokers - 1
 		
 		deck.add(new Card("Joker", "One"));
 		deck.add(new Card("Joker", "Two"));
 	
 		// Jokers - 2
 		
 		deck.add(new Card("Joker", "One"));
 		deck.add(new Card("Joker", "Two"));
 		*/
 	}
 	
 	// Generates a Hand of six from the Deck for the Player
 	// Removes those six cards from the Deck
 	public List<Card> generateHand()
 	{
 		List<Card> hand = new ArrayList<Card>();
 		Random rand = new Random(System.currentTimeMillis());
 		
 		int i = 0; int numCards = 0;
 		while (numCards < 6)
 		{
 			int min = 0; int max = deck.size();
 			int randomCard = rand.nextInt(max) + min;

 			if (!(deck.get(randomCard) == null))
 			{

 				hand.add(i, deck.get(randomCard));
 				removeCard(randomCard); // This should be working to delete card
 				numCards++;
 				i++;
 			}
 		}
 		
 		return hand;
 		
 	}
 	
 	public void removeCard(int index)
 	{
 		deck.remove(index);
 	}
 	
 	public ArrayList<Card> getDeck(){
 		
 		return deck;
 	}

 	public int indexOf(Card c)
 	{	
 		for (int i = 0; i < deck.size(); i++)
 		{
 			if (c.equalsDeck(deck.get(i)))
 			{
 				return i;
 			}
 		}
 		
 		return 0;
 	}
 	
 	// Returns index of dead cards - cards that have already been played twice
 	// Returns -1 if the card can be played - not really useful
 	public int returnDeadIndex(Board b, List<Card> hand){
 		
 		int index = -1;
 		for (int i=0; i < hand.size(); i++)
 			if (deck.indexOf(hand.get(i)) == -1 && b.existsInHighlightedBoard(hand.get(i)) == false){
 					System.out.println("Dead card found!");
 					index = i;
 					
 					
 			}
 


 		
 		
 		return index;
 	}
 		
}