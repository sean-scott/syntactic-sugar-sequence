package com.syntacticsugar.sequence;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Menu extends JFrame{
	JButton button1, button2;
	
	public Menu()
	{
		initUI();
	}
	
	public final void initUI()
	{	
		JPanel panel = new JPanel(); // parent container
		panel.setBorder(BorderFactory.createEmptyBorder(350, 100, 100, 100));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel gridOfButtons = new JPanel(); // so buttons line up
		gridOfButtons.setLayout(new GridLayout(2,1));
		
        JLabel label = new JLabel();
        ImageIcon logo;
        logo = new ImageIcon(this.getClass().getResource("logo.gif"));
        label.setIcon(logo);
        
        //button 1 is for 1 player
        button1 = new JButton("Start");
        button1.setPreferredSize(new Dimension(300, 40));
        button1.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	
            	//Put "go to game here"
            	Game.main(new String[0]);
            }
        }));
        
        //button 2 is for 2
        button2 = new JButton("Exit");
        button2.setPreferredSize(new Dimension(300, 40));
        button2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	
            	//Put "go to game here"
                System.exit(0);
                
            }
        }));

        panel.add(label);
        
        gridOfButtons.add(button1);
        gridOfButtons.add(button2);
        panel.add(gridOfButtons);

        add(panel);

        setTitle("Sequence");
        setSize(1000, 1000);
        setBackground(new Color(5,10,100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                Menu ex = new Menu();
                ex.setVisible(true);
            }
        });
    }
}
