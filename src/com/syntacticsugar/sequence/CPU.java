package com.syntacticsugar.sequence;

public class CPU extends Player {
	
	private Card[] CPUhand;
	
	/*CPU keeps track of a finite number of cards played (trying to keep it as human as possible)*/
	private Card[] playedCards_P = new Card[15];
	private Card[] playedCards_C = new Card[30];
	private int numCards_P, numCards_C;
	
	public CPU(Card[] hand){
		
		super(hand);
		CPUhand = hand;
		numCards_P = 0;
		numCards_C = 0;
	}
	
	public CPU(){

	}
	
	
	//Mutator to add a recently played card to the respective array
	//The CPU will only remember the 15 most recently played cards
	public void rememberCard_P(Card c){
		if(numCards_P == 15){
			numCards_P = 0;
			playedCards_P[numCards_P] = c;
		}else{
			playedCards_P[numCards_P] = c;
			numCards_P ++;
		}
	}
	
	public void rememberCard_C (Card c){
		if(numCards_C == 30){
			numCards_C = 0;
			playedCards_P[numCards_C] = c;
		}else{
			playedCards_P[numCards_C] = c;
			numCards_C ++;
		}
	}
	
	public boolean checkFTW (Card c, BoardCard[][] b, String direction){
		int row = 1, block = 0, i = 0 , j = 0;
		//Row will count the sequence
		//block will count the number of invalid spaces
		//i and j are supposed to be the indexes
		
		while(row < 5 && block != 2 ){
			
			//This is a reset
			if(block > 0){
				i = 0;
				j = 0;
			}
			
			//Check up then down
			if(direction == "ud" && block == 0){
				i++;
			}else if (direction == "ud" && block != 0){
				i--;
				
			//Check right then left	
			}else if (direction == "rl" && block == 0){
				j++;
			}else if (direction == "rl"&& block != 0){
				j--;
				
			//Check down-right then up-left
			}else if (direction == "drul" && block == 0){
				i++;
				j++;
			}else if (direction == "drul" && block != 0){
				i--;
				j--;
				
			//Check up-right then down-left	
			}else if (direction == "urdl" && block == 0){
				i--;
				j++;
			}else if (direction == "urdl" && block != 0){
				i++;
				j--;
			}
			
			if(i < 0 || j < 0 || i > 9 || j > 9){
				block ++;
			}else if(b[i][j].highlighted == true){
				row++;
			}else{
				block++;
			}
		}
		
		if(row == 5){
			return true;
		}else{
			return false;
		}
	}
	
	public void turn()
	{
		//Win
		
		//Block
		
		//Play
	}

}
































// fuck you