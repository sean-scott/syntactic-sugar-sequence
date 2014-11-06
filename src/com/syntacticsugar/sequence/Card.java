package com.syntacticsugar.sequence;


import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Card extends JButton implements MouseListener {
	
	protected String name;
	protected String suit;

    private boolean mouseEntered = false;
    private boolean mousePressed = false;
	
	public Card()
	{
		super(); // JComponent constructor
		name = "";
		suit = "";
		
		enableInputMethods(true);
		addMouseListener(this);
	}
	
	public Card(String n, String s)
	{
		name = n;
		suit = s;
	}
	
	// Set/Get 'name'
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	// Set/Get 'suit'
	
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public void printCard()
	{
		String value;
		
		if (name.equals("A"))
		{
			value = "Ace";
		}
		
		else if (name.equals("J"))
		{
			value = "Jack";
		}
		
		else if (name.equals("Q"))
		{
			value = "Queen";
		}
		
		else if (name.equals("K"))
		{
			value = "King";
		}
		
		else
		{
			value = name;
		}
		
		if (value.equals(""))
		{
			System.out.println("Free");
		}
		
		else
		{
			System.out.println(value + " of " + suit);
		}
	}
	
	// Overloading the "equals" operator for checking if Card matches the BoardCard.
	
	public boolean equals(BoardCard b)
	{	
		if (b == null)
		{
			return false;
		}
		
		if (this.getName().equals(b.getName()) && this.getSuit().equals(b.getSuit()))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	/****** GUI ******/
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(100, 150);
	}
	
	@Override
	public Dimension getMinimumSize()
	{
		return new Dimension(100, 150);
	}
	
	@Override
	public Dimension getMaximumSize()
	{
		return new Dimension(100, 150);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		

        // Anti-Aliasing
        Graphics2D antiAlias = (Graphics2D)g;
        antiAlias.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw white rectangle
        g.setColor(Color.WHITE);
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 1, 1); 
        
        // Draw border
        if(mouseEntered)
        {
            g.setColor(Color.YELLOW);
        }
        else
        {
            g.setColor(Color.GREEN);
        }
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);
        
        // Draw name

        JLabel c = new JLabel(name);
        c.setBounds(getWidth()/3, getHeight()/2, 20, 40);
        c.paint(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		// Nothing
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
        mouseEntered = true;
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
        mouseEntered = false;
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        repaint();
	}

	@Override
    public void mousePressed(MouseEvent e)
    {
        mousePressed = true;
        repaint();
    }
	
	@Override
    public void mouseReleased(MouseEvent e)
    {
        mousePressed = false;
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        repaint();
    }
}