package com.syntacticsugar.sequence;
import java.awt.GridLayout;


import javax.swing.*;
import java.awt.*;

public class Game {

	public static void main(String[] args) 
	{
		// Game starts
		
		// Initialize a Deck
		
		new Deck();
		System.out.println("Testing Card print. Name and suit");
		Deck.deck[44].printCard();
		System.out.println();
		
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		Board b = new Board();
		//JPanel Hand = new JPanel(new FlowLayout(FlowLayout.LEFT));
		//h.setSize(300,100);
		
		
		//super("Sequence");
		f.setSize(1000,1000);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setLayout(new GridLayout(10,10));
		//b.setPreferredSize(new Dimension(600,1000));
		f.add(b);
		//f.add(Hand);
		//ImageIcon cardPicture;

		
		
		f.setVisible(true);
		
		

	}

}
