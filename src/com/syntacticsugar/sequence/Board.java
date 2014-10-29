package com.syntacticsugar.sequence;

public class Board {
	
	// 'board' is a 2D array of Cards. Each card will appear twice
	// No Jokers, no Jacks. 4 free spaces
	
	static Card[][] board = new Card[10][10];

 	public Board() {
 		
 		// Row 1
 		
 		board[0][0] = new Card("", "");
 		board[0][1] = new Card("6", "Diamonds");
 		board[0][2] = new Card("7", "Diamonds");
 		board[0][3] = new Card("8", "Diamonds");
 		board[0][4] = new Card("9", "Diamonds");
 		board[0][5] = new Card("10", "Diamonds");
 		board[0][6] = new Card("Q", "Diamonds");
 		board[0][7] = new Card("K", "Diamonds");
 		board[0][8] = new Card("A", "Diamonds");
 		board[0][9] = new Card("", "");
 		
 		// Row 2
 		
 		board[1][0] = new Card("5", "Diamonds");
 		board[1][1] = new Card("3", "Hearts");
 		board[1][2] = new Card("2", "Hearts");
 		board[1][3] = new Card("2", "Spades");
 		board[1][4] = new Card("3", "Spades");
 		board[1][5] = new Card("4", "Spades");
 		board[1][6] = new Card("5", "Spades");
 		board[1][7] = new Card("6", "Spades");
 		board[1][8] = new Card("7", "Spades");
 		board[1][9] = new Card("A", "Clubs");
 		
 		// Row 3
 		
 		board[2][0] = new Card("4", "Diamonds");
 		board[2][1] = new Card("4", "Hearts");
 		board[2][2] = new Card("K", "Diamonds");
 		board[2][3] = new Card("A", "Diamonds");
 		board[2][4] = new Card("A", "Clubs");
 		board[2][5] = new Card("K", "Clubs");
 		board[2][6] = new Card("Q", "Clubs");
 		board[2][7] = new Card("10", "Clubs");
 		board[2][8] = new Card("8", "Spades");
 		board[2][9] = new Card("K", "Clubs");
 		
 		// Row 4
 		
 		board[3][0] = new Card("3", "Diamonds");
 		board[3][1] = new Card("5", "Hearts");
 		board[3][2] = new Card("Q", "Diamonds");
 		board[3][3] = new Card("Q", "Hearts");
 		board[3][4] = new Card("10", "Hearts");
 		board[3][5] = new Card("9", "Hearts");
 		board[3][6] = new Card("8", "Hearts");
 		board[3][7] = new Card("9", "Clubs");
 		board[3][8] = new Card("9", "Spades");
 		board[3][9] = new Card("Q", "Clubs");
 		
 		// Row 5
 		
 		board[4][0] = new Card("2", "Diamonds");
 		board[4][1] = new Card("6", "Hearts");
 		board[4][2] = new Card("10", "Diamonds");
 		board[4][3] = new Card("K", "Hearts");
 		board[4][4] = new Card("3", "Hearts");
 		board[4][5] = new Card("2", "Hearts");
 		board[4][6] = new Card("7", "Hearts");
 		board[4][7] = new Card("8", "Clubs");
 		board[4][8] = new Card("10", "Spades");
 		board[4][9] = new Card("10", "Clubs");
 		
 		// Row 6
 		
 		board[5][0] = new Card("A", "Spades");
 		board[5][1] = new Card("7", "Hearts");
 		board[5][2] = new Card("9", "Diamonds");
 		board[5][3] = new Card("A", "Hearts");
 		board[5][4] = new Card("4", "Hearts");
 		board[5][5] = new Card("5", "Hearts");
 		board[5][6] = new Card("6", "Hearts");
 		board[5][7] = new Card("7", "Clubs");
 		board[5][8] = new Card("Q", "Spades");
 		board[5][9] = new Card("9", "Clubs");
 		
 		// Row 7
 		
 		board[6][0] = new Card("K", "Spades");
 		board[6][1] = new Card("8", "Hearts");
 		board[6][2] = new Card("8", "Diamonds");
 		board[6][3] = new Card("2", "Clubs");
 		board[6][4] = new Card("3", "Clubs");
 		board[6][5] = new Card("4", "Clubs");
 		board[6][6] = new Card("5", "Clubs");
 		board[6][7] = new Card("6", "Clubs");
 		board[6][8] = new Card("K", "Spades");
 		board[6][9] = new Card("8", "Clubs");
 		
 		// Row 8
 		
 		board[7][0] = new Card("Q", "Spades");
 		board[7][1] = new Card("9", "Hearts");
 		board[7][2] = new Card("7", "Diamonds");
 		board[7][3] = new Card("6", "Diamonds");
 		board[7][4] = new Card("5", "Diamonds");
 		board[7][5] = new Card("4", "Diamonds");
 		board[7][6] = new Card("3", "Diamonds");
 		board[7][7] = new Card("2", "Diamonds");
 		board[7][8] = new Card("A", "Spades");
 		board[7][9] = new Card("7", "Clubs");
 		
 		// Row 9
 		
 		board[8][0] = new Card("10", "Spades");
 		board[8][1] = new Card("10", "Hearts");
 		board[8][2] = new Card("Q", "Hearts");
 		board[8][3] = new Card("K", "Hearts");
 		board[8][4] = new Card("A", "Hearts");
 		board[8][5] = new Card("2", "Clubs");
 		board[8][6] = new Card("3", "Clubs");
 		board[8][7] = new Card("4", "Clubs");
 		board[8][8] = new Card("5", "Clubs");
 		board[8][9] = new Card("6", "Clubs");
 		
 		// Row 10
 		
 		board[9][0] = new Card("", "");
 		board[9][1] = new Card("9", "Spades");
 		board[9][2] = new Card("8", "Spades");
 		board[9][3] = new Card("7", "Spades");
 		board[9][4] = new Card("6", "Spades");
 		board[9][5] = new Card("5", "Spades");
 		board[9][6] = new Card("4", "Spades");
 		board[9][7] = new Card("3", "Spades");
 		board[9][8] = new Card("2", "Spades");
 		board[9][9] = new Card("", "");
 	}
}
