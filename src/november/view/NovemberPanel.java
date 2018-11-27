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
	
	public NovemberPanel(NovemberController appController)
	{
		super();
		
		this.appController = appController;
		
		colorButton = new JButton("Click to change the color");
		textLabel = new JLabel("This is a color app");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.blue);
		this.add(textLabel);
		this.add(colorButton);
		
		
	}

	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		
		});
	}
}
