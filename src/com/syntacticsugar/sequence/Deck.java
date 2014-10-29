package com.syntacticsugar.sequence;
import java.util.Random;

public class Deck extends Card {
	
	
	// 'deck' contains two full sets of cards, plus Jokers.
	static Card[] deck = new Card[108];

 	public Deck() {
 		
 		// Clubs - 1
 		
 		deck[0] = new Card("A", "Clubs");
 		deck[1] = new Card("2", "Clubs");
 		deck[2] = new Card("3", "Clubs");
 		deck[3] = new Card("4", "Clubs");
 		deck[4] = new Card("5", "Clubs");
 		deck[5] = new Card("6", "Clubs");
 		deck[6] = new Card("7", "Clubs");
 		deck[7] = new Card("8", "Clubs");
 		deck[8] = new Card("9", "Clubs");
 		deck[9] = new Card("10", "Clubs");
 		deck[10] = new Card("J", "Clubs");
 		deck[11] = new Card("Q", "Clubs");
 		deck[12] = new Card("K", "Clubs");
 		
 		// Clubs - 2
 		
 		deck[13] = new Card("A", "Clubs");
 		deck[14] = new Card("2", "Clubs");
 		deck[15] = new Card("3", "Clubs");
 		deck[16] = new Card("4", "Clubs");
 		deck[17] = new Card("5", "Clubs");
 		deck[18] = new Card("6", "Clubs");
 		deck[19] = new Card("7", "Clubs");
 		deck[20] = new Card("8", "Clubs");
 		deck[21] = new Card("9", "Clubs");
 		deck[22] = new Card("10", "Clubs");
 		deck[23] = new Card("J", "Clubs");
 		deck[24] = new Card("Q", "Clubs");
 		deck[25] = new Card("K", "Clubs");
 		
 		// Diamonds - 1
 		
 		deck[26] = new Card("A", "Diamonds");
 		deck[27] = new Card("2", "Diamonds");
 		deck[28] = new Card("3", "Diamonds");
 		deck[29] = new Card("4", "Diamonds");
 		deck[30] = new Card("5", "Diamonds");
 		deck[31] = new Card("6", "Diamonds");
 		deck[32] = new Card("7", "Diamonds");
 		deck[33] = new Card("8", "Diamonds");
 		deck[34] = new Card("9", "Diamonds");
 		deck[35] = new Card("10", "Diamonds");
 		deck[36] = new Card("J", "Diamonds");
 		deck[37] = new Card("Q", "Diamonds");
 		deck[38] = new Card("K", "Diamonds");
 		
 		// Diamonds - 2
 		
 		deck[39] = new Card("A", "Diamonds");
 		deck[40] = new Card("2", "Diamonds");
 		deck[41] = new Card("3", "Diamonds");
 		deck[42] = new Card("4", "Diamonds");
 		deck[43] = new Card("5", "Diamonds");
 		deck[44] = new Card("6", "Diamonds");
 		deck[45] = new Card("7", "Diamonds");
 		deck[46] = new Card("8", "Diamonds");
 		deck[47] = new Card("9", "Diamonds");
 		deck[48] = new Card("10", "Diamonds");
 		deck[49] = new Card("J", "Diamonds");
 		deck[50] = new Card("Q", "Diamonds");
 		deck[51] = new Card("K", "Diamonds");
 		
 		// Hearts - 1
 		
 		deck[52] = new Card("A", "Hearts");
 		deck[53] = new Card("2", "Hearts");
 		deck[54] = new Card("3", "Hearts");
 		deck[55] = new Card("4", "Hearts");
 		deck[56] = new Card("5", "Hearts");
 		deck[57] = new Card("6", "Hearts");
 		deck[58] = new Card("7", "Hearts");
 		deck[59] = new Card("8", "Hearts");
 		deck[60] = new Card("9", "Hearts");
 		deck[61] = new Card("10", "Hearts");
 		deck[62] = new Card("J", "Hearts");
 		deck[63] = new Card("Q", "Hearts");
 		deck[64] = new Card("K", "Hearts");
 		
 		// Hearts - 2
 		
 		deck[65] = new Card("A", "Hearts");
 		deck[66] = new Card("2", "Hearts");
 		deck[67] = new Card("3", "Hearts");
 		deck[68] = new Card("4", "Hearts");
 		deck[69] = new Card("5", "Hearts");
 		deck[70] = new Card("6", "Hearts");
 		deck[71] = new Card("7", "Hearts");
 		deck[72] = new Card("8", "Hearts");
 		deck[73] = new Card("9", "Hearts");
 		deck[74] = new Card("10", "Hearts");
 		deck[75] = new Card("J", "Hearts");
 		deck[76] = new Card("Q", "Hearts");
 		deck[77] = new Card("K", "Hearts");
 		
 		// Spades - 1
 		
 		deck[78] = new Card("A", "Spades");
 		deck[79] = new Card("2", "Spades");
 		deck[80] = new Card("3", "Spades");
 		deck[81] = new Card("4", "Spades");
 		deck[82] = new Card("5", "Spades");
 		deck[83] = new Card("6", "Spades");
 		deck[84] = new Card("7", "Spades");
 		deck[85] = new Card("8", "Spades");
 		deck[86] = new Card("9", "Spades");
 		deck[87] = new Card("10", "Spades");
 		deck[88] = new Card("J", "Spades");
 		deck[89] = new Card("Q", "Spades");
 		deck[90] = new Card("K", "Spades");
 		
 		// Spades - 2
 		
 		deck[91] = new Card("A", "Spades");
 		deck[92] = new Card("2", "Spades");
 		deck[93] = new Card("3", "Spades");
 		deck[94] = new Card("4", "Spades");
 		deck[95] = new Card("5", "Spades");
 		deck[96] = new Card("6", "Spades");
 		deck[97] = new Card("7", "Spades");
 		deck[98] = new Card("8", "Spades");
 		deck[99] = new Card("9", "Spades");
 		deck[100] = new Card("10", "Spades");
 		deck[101] = new Card("J", "Spades");
 		deck[102] = new Card("Q", "Spades");
 		deck[103] = new Card("K", "Spades");
 		
 		// Jokers - 1
 		
 		deck[104] = new Card("Joker", "One");
 		deck[105] = new Card("Joker", "Two");
 	
 		// Jokers - 2
 		
 		deck[106] = new Card("Joker", "One");
 		deck[107] = new Card("Joker", "Two");
 		
 	}
 	
 	// Generates a Hand of six from the Deck for the Player
 	// Removes those six cards from the Deck
 	public Card[] generateHand()
 	{
 		Card[] hand = new Card[6];
 		// make a Card[] hand
 		
 		Random rand = new Random(System.currentTimeMillis());
 		
 		int i = 0; int numCards = 0;
 		while (numCards < 6){
 			
 			int min = 0; int max = 107;
 			
 			int randomCard = rand.nextInt(max + 1) + min;
 			// System.out.println(randomCard);
 			if (Deck.deck[randomCard].getName() != "null"){
 				hand[i] = Deck.deck[randomCard];
 				Deck.deck[randomCard].printCard(); // Test printCard statement
 				removeCard(randomCard); // This should be working to delete card
 				numCards++;
 				i++;
 			}
 			else{
 				// Try again!
 			}
 		}
 		
 		return hand;
 		
 	}
 
 	
 	public void removeCard(int index)
 	{
 		Deck.deck[index].setName("null");
 	}
 	
 	// Testing.. testing.. 1.. 2..
 	public static void main(String[] args){
 		
 		Deck test = new Deck();
 		Card[] myHand = test.generateHand();
 		
 		
 		
 		
 		
 	}
 	
 	
}