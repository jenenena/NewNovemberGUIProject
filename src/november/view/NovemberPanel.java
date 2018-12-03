package november.view;

import november.controller.NovemberController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NovemberPanel extends JPanel
{
	private NovemberController appController;
	private JLabel textLabel;
	private JButton colorButton;
	private SpringLayout appLayout;
	private JButton funButton;
	
	public NovemberPanel(NovemberController appController)
	{
		super();
		
		this.appController = appController;
		textLabel = new JLabel("This is a color app");
		colorButton = new JButton("tap me to change background color");
		appLayout = new SpringLayout();
		funButton = new JButton("tap me to change button color");

		

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.orange);
		this.add(textLabel);
		this.add(colorButton);
		this.add(funButton);
		
		
	}

	private void setupLayout() //stupid GUI code dump
	{
		appLayout.putConstraint(SpringLayout.NORTH, funButton, 6, SpringLayout.SOUTH, colorButton);
		appLayout.putConstraint(SpringLayout.EAST, funButton, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, colorButton, 0, SpringLayout.EAST, funButton);
		
		appLayout.putConstraint(SpringLayout.NORTH, colorButton, 40, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, textLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, textLabel, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundColor();
			}
		
		});
		
		funButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeFunButtonColor();
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red is " + red + "\nGreen is: " + green + "\nBlue is: " + blue);
	}
	private void changeFunButtonColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		funButton.setBackground(new Color(red, green, blue));
		colorButton.setBackground(new Color(red, green, blue));
		textLabel.setBackground(new Color(red, green, blue));
	}
}







