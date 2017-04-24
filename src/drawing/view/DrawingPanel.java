package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import drawing.controller.Controller;

public class DrawingPanel extends JPanel 
{
	JButton button;
	ShapePanel shapePanel;
	SpringLayout baseLayout;
	Controller baseController;
	
	public DrawingPanel(Controller baseController)
	{
		super();
		this.baseController = baseController;
		this.shapePanel = new ShapePanel(baseController);
		this.baseLayout = new SpringLayout();
		this.button = new JButton();
		setupPannel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPannel()
	{
		this.setLayout(baseLayout);;
		this.setBackground(Color.RED);
		this.setMinimumSize(new Dimension(600, 600));
		
		this.add(button);
		this.add(shapePanel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangels();
			}
		});
	}
}
