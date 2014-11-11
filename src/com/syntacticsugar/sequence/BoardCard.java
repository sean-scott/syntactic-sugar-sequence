package com.syntacticsugar.sequence;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardCard extends Card
{
	public boolean highlighted; // If true, highlights BoardCard
	public boolean enabled; // If true, BoardCard can be selected
	
	private int player = 0;
	
	// Constructors
	
	public BoardCard()
	{
		super("", "");
		highlighted = false;
		enabled = true;
		player = 0; // no one has selected the card
		
	}
	
	
	public BoardCard(String n, String s, boolean h, boolean e)
	{
		super(n, s);
		highlighted = h;
		enabled = e;
		player = 0;
		setPreferredSize(new Dimension(65,65));
		setEnabled(e);
		
		if (h)
		{
			setBackground(Color.black);
			setForeground(Color.white);
			setEnabled(false);
		}
		
		Font font = new Font(getFont().getName(), getFont().getStyle(), 16);
		setFont(font);
	}
	
	public void printCard()
	{
		super.printCard();
		System.out.printf("Has it already been selected? %b\n", highlighted);
		System.out.printf("Is this card enabled? %b\n", enabled);
	}
	
	public void highlight(int p)
	{	
		highlighted = true;
		setEnabled(false);
		player = p;
		
		if (p == 1)
		{
			setBackground(Color.BLUE);
		}
		else if (p == 2)
		{
			setBackground(Color.RED);
		}
	}
	
	// Accessors
	
	public int getOwner()
	{
		return player;
	}
	
	// Functions
	
	public void mark()
	{
		setEnabled(true);
		setBackground(Color.YELLOW);
	}
	
	public void unmark()
	{
		setEnabled(false);
		
		if (highlighted && player == 1)
		{
			setBackground(Color.BLUE);
		}
		
		else if (highlighted && player == 2)
		{
			setBackground(Color.RED);
		}
		
		else if (highlighted && player == 0)
		{
			setBackground(Color.black);
			setForeground(Color.white);
		}
		
		else
		{
			setBackground(Color.WHITE);
		}
	}
}