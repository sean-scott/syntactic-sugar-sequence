package com.syntacticsugar.sequence;

import javax.swing.*;

public class Board extends JPanel
{
	
	// 'board' is a 2D array of Cards. Each card will appear twice
	// No Jokers, no Jacks. 4 free spaces
	
	static BoardCard[][] board = new BoardCard[10][10];

 	public Board() {
 		
 		super(); // JPanel constructor
 		
 		// Row 1
 		// BoardCard(name, suit, highlighted, enabled);
 		board[0][0] = new BoardCard("", "", true, false);
 		board[0][1] = new BoardCard("6", "Diamonds", false, false);
 		board[0][2] = new BoardCard("7", "Diamonds", false, false);
 		board[0][3] = new BoardCard("8", "Diamonds", false, false);
 		board[0][4] = new BoardCard("9", "Diamonds", false, false);
 		board[0][5] = new BoardCard("10", "Diamonds", false, false);
 		board[0][6] = new BoardCard("Q", "Diamonds", false, false);
 		board[0][7] = new BoardCard("K", "Diamonds", false, false);
 		board[0][8] = new BoardCard("A", "Diamonds", false, false);
 		board[0][9] = new BoardCard("", "", true, false);
 		
 		// Row 2
 		
 		board[1][0] = new BoardCard("5", "Diamonds", false, false);
 		board[1][1] = new BoardCard("3", "Hearts", false, false);
 		board[1][2] = new BoardCard("2", "Hearts", false, false);
 		board[1][3] = new BoardCard("2", "Spades", false, false);
 		board[1][4] = new BoardCard("3", "Spades", false, false);
 		board[1][5] = new BoardCard("4", "Spades", false, false);
 		board[1][6] = new BoardCard("5", "Spades", false, false);
 		board[1][7] = new BoardCard("6", "Spades", false, false);
 		board[1][8] = new BoardCard("7", "Spades", false, false);
 		board[1][9] = new BoardCard("A", "Clubs", false, false);
 		
 		// Row 3
 		
 		board[2][0] = new BoardCard("4", "Diamonds", false, false);
 		board[2][1] = new BoardCard("4", "Hearts", false, false);
 		board[2][2] = new BoardCard("K", "Diamonds", false, false);
 		board[2][3] = new BoardCard("A", "Diamonds", false, false);
 		board[2][4] = new BoardCard("A", "Clubs", false, false);
 		board[2][5] = new BoardCard("K", "Clubs", false, false);
 		board[2][6] = new BoardCard("Q", "Clubs", false, false);
 		board[2][7] = new BoardCard("10", "Clubs", false, false);
 		board[2][8] = new BoardCard("8", "Spades", false, false);
 		board[2][9] = new BoardCard("K", "Clubs", false, false);
 		
 		// Row 4
 		
 		board[3][0] = new BoardCard("3", "Diamonds", false, false);
 		board[3][1] = new BoardCard("5", "Hearts", false, false);
 		board[3][2] = new BoardCard("Q", "Diamonds", false, false);
 		board[3][3] = new BoardCard("Q", "Hearts", false, false);
 		board[3][4] = new BoardCard("10", "Hearts", false, false);
 		board[3][5] = new BoardCard("9", "Hearts", false, false);
 		board[3][6] = new BoardCard("8", "Hearts", false, false);
 		board[3][7] = new BoardCard("9", "Clubs", false, false);
 		board[3][8] = new BoardCard("9", "Spades", false, false);
 		board[3][9] = new BoardCard("Q", "Clubs", false, false);
 		
 		// Row 5
 		
 		board[4][0] = new BoardCard("2", "Diamonds", false, false);
 		board[4][1] = new BoardCard("6", "Hearts", false, false);
 		board[4][2] = new BoardCard("10", "Diamonds", false, false);
 		board[4][3] = new BoardCard("K", "Hearts", false, false);
 		board[4][4] = new BoardCard("3", "Hearts", false, false);
 		board[4][5] = new BoardCard("2", "Hearts", false, false);
 		board[4][6] = new BoardCard("7", "Hearts", false, false);
 		board[4][7] = new BoardCard("8", "Clubs", false, false);
 		board[4][8] = new BoardCard("10", "Spades", false, false);
 		board[4][9] = new BoardCard("10", "Clubs", false, false);
 		
 		// Row 6
 		
 		board[5][0] = new BoardCard("A", "Spades", false, false);
 		board[5][1] = new BoardCard("7", "Hearts", false, false);
 		board[5][2] = new BoardCard("9", "Diamonds", false, false);
 		board[5][3] = new BoardCard("A", "Hearts", false, false);
 		board[5][4] = new BoardCard("4", "Hearts", false, false);
 		board[5][5] = new BoardCard("5", "Hearts", false, false);
 		board[5][6] = new BoardCard("6", "Hearts", false, false);
 		board[5][7] = new BoardCard("7", "Clubs", false, false);
 		board[5][8] = new BoardCard("Q", "Spades", false, false);
 		board[5][9] = new BoardCard("9", "Clubs", false, false);
 		
 		// Row 7
 		
 		board[6][0] = new BoardCard("K", "Spades", false, false);
 		board[6][1] = new BoardCard("8", "Hearts", false, false);
 		board[6][2] = new BoardCard("8", "Diamonds", false, false);
 		board[6][3] = new BoardCard("2", "Clubs", false, false);
 		board[6][4] = new BoardCard("3", "Clubs", false, false);
 		board[6][5] = new BoardCard("4", "Clubs", false, false);
 		board[6][6] = new BoardCard("5", "Clubs", false, false);
 		board[6][7] = new BoardCard("6", "Clubs", false, false);
 		board[6][8] = new BoardCard("K", "Spades", false, false);
 		board[6][9] = new BoardCard("8", "Clubs", false, false);
 		
 		// Row 8
 		
 		board[7][0] = new BoardCard("Q", "Spades", false, false);
 		board[7][1] = new BoardCard("9", "Hearts", false, false);
 		board[7][2] = new BoardCard("7", "Diamonds", false, false);
 		board[7][3] = new BoardCard("6", "Diamonds", false, false);
 		board[7][4] = new BoardCard("5", "Diamonds", false, false);
 		board[7][5] = new BoardCard("4", "Diamonds", false, false);
 		board[7][6] = new BoardCard("3", "Diamonds", false, false);
 		board[7][7] = new BoardCard("2", "Diamonds", false, false);
 		board[7][8] = new BoardCard("A", "Spades", false, false);
 		board[7][9] = new BoardCard("7", "Clubs", false, false);
 		
 		// Row 9
 		
 		board[8][0] = new BoardCard("10", "Spades", false, false);
 		board[8][1] = new BoardCard("10", "Hearts", false, false);
 		board[8][2] = new BoardCard("Q", "Hearts", false, false);
 		board[8][3] = new BoardCard("K", "Hearts", false, false);
 		board[8][4] = new BoardCard("A", "Hearts", false, false);
 		board[8][5] = new BoardCard("2", "Clubs", false, false);
 		board[8][6] = new BoardCard("3", "Clubs", false, false);
 		board[8][7] = new BoardCard("4", "Clubs", false, false);
 		board[8][8] = new BoardCard("5", "Clubs", false, false);
 		board[8][9] = new BoardCard("6", "Clubs", false, false);
 		
 		// Row 10
 		
 		board[9][0] = new BoardCard("", "", true, false);
 		board[9][1] = new BoardCard("9", "Spades", false, false);
 		board[9][2] = new BoardCard("8", "Spades", false, false);
 		board[9][3] = new BoardCard("7", "Spades", false, false);
 		board[9][4] = new BoardCard("6", "Spades", false, false);
 		board[9][5] = new BoardCard("5", "Spades", false, false);
 		board[9][6] = new BoardCard("4", "Spades", false, false);
 		board[9][7] = new BoardCard("3", "Spades", false, false);
 		board[9][8] = new BoardCard("2", "Spades", false, false);
 		board[9][9] = new BoardCard("", "", true, false);

 		for (int i = 0; i < 10; i++)
 		{
 			for (int j = 0; j < 10; j++)
 			{
 				this.add(board[i][j]); // Displays BoardCards
 			}
 		}
 		 
 	}
 	
 	// < indexOf >
 	//
 	// Return 2 "coordinates" of a specified Card.
 	// Returns a 2D array with 2 (x,y) values of the Card
 	
 	public static int[][] indexOf(Card c)
 	{
 		// Initialize an array. There will be two coordinates where the Card exists on the board
 		int[][] arr = new int[2][2];
 		
 		// Counter to determine which index of 'arr' to use
 		int count = 0;
 		
 		// Loop through the entire Board. If 'c' matches the Card object, put that index in array
 		for (int i = 0; i < 10; i++)
 		{
 			// Row
 			
 			for (int j = 0; j < 10; j++)
 			{
 				// Column
 				
 				if (c.equals(board[i][j]))
 				{
 					if (count == 0)
 					{
 						arr[0][0] = i;
 						arr[0][1] = j;
 					}
 					
 					else
 					{
 						arr[1][0] = i;
 						arr[1][1] = j;
 					}
 					
 					count++;
 				}
 			}
 		}
 		
 		return arr;
 	}
 	
 	// Don't use these yet
 	public static int indexOfX(){
 		 
 		int x = 0;
 		
 		
 		return x;
 		
 	}
 	
 	public static int indexOfY(){
 		
 		int y = 0;
 		
 		
 		return y;
 		
 	}
 	/*
 	// < openCard >
 	//
 	// Make BoardCard highlighted and enabled
 	
 	public static void openCard(int[][] arr)
 	{
 		int c1x = arr[0][0];
 		int c1y = arr[0][1];
 		
 		int c2x = arr[1][0];
 		int c2y = arr[1][1];
 		
 		board[c1x][c1y].highlighted = false;
 		board[c1x][c1y].enabled = false;
 		
 		board[c2x][c2y].highlighted = true;
 		board[c2x][c2y].enabled = false;
 	}
 	*/

 	
 	
}