package com.syntacticsugar.sequence;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck extends Card 
{	
	// 'deck' contains two full sets of cards, plus Jokers.
	static ArrayList<Card> deck = new ArrayList<Card>();

 	public Deck() 
 	{	
 		// Clubs - 1
 		
 		deck.add(0, new Card("A", "Clubs"));
 		deck.add(1, new Card("2", "Clubs"));
 		deck.add(2, new Card("3", "Clubs"));
 		deck.add(3, new Card("4", "Clubs"));
 		deck.add(4, new Card("5", "Clubs"));
 		deck.add(5, new Card("6", "Clubs"));
 		deck.add(6, new Card("7", "Clubs"));
 		deck.add(7,  new Card("8", "Clubs"));
 		deck.add(8,  new Card("9", "Clubs"));
 		deck.add(9,  new Card("10", "Clubs"));
 		deck.add(10,  new Card("J", "Clubs"));
 		deck.add(11,  new Card("Q", "Clubs"));
 		deck.add(12,  new Card("K", "Clubs"));
 		
 		// Clubs - 2
 		
 		deck.add(13,  new Card("A", "Clubs"));
 		deck.add(14,  new Card("2", "Clubs"));
 		deck.add(15,  new Card("3", "Clubs"));
 		deck.add(16,  new Card("4", "Clubs"));
 		deck.add(17,  new Card("5", "Clubs"));
 		deck.add(18,  new Card("6", "Clubs"));
 		deck.add(19,  new Card("7", "Clubs"));
 		deck.add(20,  new Card("8", "Clubs"));
 		deck.add(21,  new Card("9", "Clubs"));
 		deck.add(22,  new Card("10", "Clubs"));
 		deck.add(23,  new Card("J", "Clubs"));
 		deck.add(24,  new Card("Q", "Clubs"));
 		deck.add(25,  new Card("K", "Clubs"));
 		
 		// Diamonds - 1
 		
 		deck.add(26,  new Card("A", "Diamonds"));
 		deck.add(27,  new Card("2", "Diamonds"));
 		deck.add(28,  new Card("3", "Diamonds"));
 		deck.add(29,  new Card("4", "Diamonds"));
 		deck.add(30,  new Card("5", "Diamonds"));
 		deck.add(31,  new Card("6", "Diamonds"));
 		deck.add(32,  new Card("7", "Diamonds"));
 		deck.add(33,  new Card("8", "Diamonds"));
 		deck.add(34,  new Card("9", "Diamonds"));
 		deck.add(35,  new Card("10", "Diamonds"));
 		deck.add(36,  new Card("J", "Diamonds"));
 		deck.add(37,  new Card("Q", "Diamonds"));
 		deck.add(38,  new Card("K", "Diamonds"));
 		
 		// Diamonds - 2
 		
 		deck.add(39,  new Card("A", "Diamonds"));
 		deck.add(40,  new Card("2", "Diamonds"));
 		deck.add(41,  new Card("3", "Diamonds"));
 		deck.add(42,  new Card("4", "Diamonds"));
 		deck.add(43,  new Card("5", "Diamonds"));
 		deck.add(44,  new Card("6", "Diamonds"));
 		deck.add(45,  new Card("7", "Diamonds"));
 		deck.add(46,  new Card("8", "Diamonds"));
 		deck.add(47,  new Card("9", "Diamonds"));
 		deck.add(48,  new Card("10", "Diamonds"));
 		deck.add(49,  new Card("J", "Diamonds"));
 		deck.add(50,  new Card("Q", "Diamonds"));
 		deck.add(51,  new Card("K", "Diamonds"));
 		
 		// Hearts - 1
 		
 		deck.add(52,  new Card("A", "Hearts"));
 		deck.add(53,  new Card("2", "Hearts"));
 		deck.add(54,  new Card("3", "Hearts"));
 		deck.add(55,  new Card("4", "Hearts"));
 		deck.add(56,  new Card("5", "Hearts"));
 		deck.add(57,  new Card("6", "Hearts"));
 		deck.add(58,  new Card("7", "Hearts"));
 		deck.add(59,  new Card("8", "Hearts"));
 		deck.add(60,  new Card("9", "Hearts"));
 		deck.add(61,  new Card("10", "Hearts"));
 		deck.add(62,  new Card("J", "Hearts"));
 		deck.add(63,  new Card("Q", "Hearts"));
 		deck.add(64,  new Card("K", "Hearts"));
 		
 		// Hearts - 2
 		
 		deck.add(65,  new Card("A", "Hearts"));
 		deck.add(66,  new Card("2", "Hearts"));
 		deck.add(67,  new Card("3", "Hearts"));
 		deck.add(68,  new Card("4", "Hearts"));
 		deck.add(69,  new Card("5", "Hearts"));
 		deck.add(70,  new Card("6", "Hearts"));
 		deck.add(71,  new Card("7", "Hearts"));
 		deck.add(72,  new Card("8", "Hearts"));
 		deck.add(73,  new Card("9", "Hearts"));
 		deck.add(74,  new Card("10", "Hearts"));
 		deck.add(75,  new Card("J", "Hearts"));
 		deck.add(76,  new Card("Q", "Hearts"));
 		deck.add(77,  new Card("K", "Hearts"));
 		
 		// Spades - 1
 		
 		deck.add(78,  new Card("A", "Spades"));
 		deck.add(79,  new Card("2", "Spades"));
 		deck.add(80,  new Card("3", "Spades"));
 		deck.add(81,  new Card("4", "Spades"));
 		deck.add(82,  new Card("5", "Spades"));
 		deck.add(83,  new Card("6", "Spades"));
 		deck.add(84,  new Card("7", "Spades"));
 		deck.add(85,  new Card("8", "Spades"));
 		deck.add(86,  new Card("9", "Spades"));
 		deck.add(87,  new Card("10", "Spades"));
 		deck.add(88,  new Card("J", "Spades"));
 		deck.add(89,  new Card("Q", "Spades"));
 		deck.add(90,  new Card("K", "Spades"));
 		
 		// Spades - 2
 		
 		deck.add(91,  new Card("A", "Spades"));
 		deck.add(92,  new Card("2", "Spades"));
 		deck.add(93,  new Card("3", "Spades"));
 		deck.add(94,  new Card("4", "Spades"));
 		deck.add(95,  new Card("5", "Spades"));
 		deck.add(96,  new Card("6", "Spades"));
 		deck.add(97,  new Card("7", "Spades"));
 		deck.add(98,  new Card("8", "Spades"));
 		deck.add(99,  new Card("9", "Spades"));
 		deck.add(100,  new Card("10", "Spades"));
 		deck.add(101,  new Card("J", "Spades"));
 		deck.add(102,  new Card("Q", "Spades"));
 		deck.add(103,  new Card("K", "Spades"));
 		
 		// Jokers - 1
 		
 		deck.add(104,  new Card("Joker", "One"));
 		deck.add(105,  new Card("Joker", "Two"));
 	
 		// Jokers - 2
 		
 		deck.add(106,  new Card("Joker", "One"));
 		deck.add(107,  new Card("Joker", "Two"));
 		
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
 			int min = 0; int max = Deck.deck.size();
 			int randomCard = rand.nextInt(max + 1) + min;

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
}