package com.syntacticsugar.sequence;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardCard extends Card
{
	public boolean highlighted; // If true, highlights BoardCard
	public boolean enabled; // If true, BoardCard can be selected
	
	public BoardCard()
	{
		super("", "");
		highlighted = false;
		enabled = true;
	}
	
	public BoardCard(String n, String s, boolean h, boolean e)
	{
		super(n, s);
		highlighted = h;
		enabled = e;
		setPreferredSize(new Dimension(75,75));
		setEnabled(e);
		
		if (h)
		{
			setBackground(Color.BLUE);
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
}