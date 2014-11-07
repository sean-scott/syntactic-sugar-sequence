package com.syntacticsugar.sequence;
import java.awt.GridLayout;


import javax.swing.*;
import java.awt.*;

public class Game {

	public static void main(String[] args) 
	{
		// Frame - the main window that holds everything
		
		JFrame f = new JFrame("Sequence!");
		f.setLayout(new FlowLayout());
		f.setSize(1000,1000);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Board - the 10x10 grid of cards to make a sequence
		
		Board b = new Board();
		b.setLayout(new GridLayout(10,10));
		b.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.GRAY));
		
		
		// Generate Deck (non-GUI)
		Deck d = new Deck();
		
		// Player - the 1x6 grid of cards that show player's current hand
		
		Player p = new Player(d.generateHand());
		p.setLayout(new GridLayout(1,6));
		p.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.BLACK));
		
		// Adding everything to Frame
		
		f.add(b);
		f.add(p, BorderLayout.PAGE_END);		
		f.setVisible(true);
	}
}