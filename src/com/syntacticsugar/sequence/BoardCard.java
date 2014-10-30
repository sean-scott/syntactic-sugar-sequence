package com.syntacticsugar.sequence;

public class BoardCard extends Card 
{
	public boolean highlighted;
	
	public BoardCard()
	{
		super("", "");
		highlighted = false;
	}
	
	public BoardCard(String n, String s, boolean b)
	{
		super(n, s);
		highlighted = b;
	}
	
	public void printCard()
	{
		super.printCard();
		System.out.printf("Has it already been selected? %b\n", highlighted);
	}
}