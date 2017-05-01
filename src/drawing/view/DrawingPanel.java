package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import drawing.controller.Controller;

public class DrawingPanel extends JPanel 
{
	private Controller baseController;
	private ShapePanel shapePanel;
	private DrawingFrame baseFrame;
	private SpringLayout baseLayout;
	private JButton rectButton;
	private JButton circButton;
	private JButton elliButton;
	private JButton triButton;
	private JButton polyButton;
	private JButton resetButton;
	private JButton saveButton;
	private JButton randomArrayButton;
	private JLabel title;
	
	public DrawingPanel(Controller baseController)
	{
		super();
		this.baseController = baseController;
		this.shapePanel = new ShapePanel(baseController);
		this.baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 250, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);
		
		this.title = new JLabel("Drawing with Java!");
		this.rectButton = new JButton("Draw Rectangles");
		
		this.circButton = new JButton("Draw Circles");
		
		this.elliButton = new JButton("Draw Ellipses");
		
		this.triButton = new JButton("Draw Triangles");
		
		this.polyButton = new JButton("Draw Polygons");
		
		this.resetButton = new JButton("Reset");
		
		
		
		setupPannel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPannel()
	{
		this.setLayout(baseLayout);;
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(800, 800));
		
		this.add(shapePanel);
		this.add(rectButton);
		this.add(circButton);
		this.add(elliButton);
		this.add(triButton);
		this.add(polyButton);
		this.add(resetButton);
		this.add(title);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, resetButton, 6, SpringLayout.SOUTH, polyButton);
		baseLayout.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, polyButton, 6, SpringLayout.SOUTH, triButton);
		baseLayout.putConstraint(SpringLayout.WEST, polyButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, triButton, 6, SpringLayout.SOUTH, elliButton);
		baseLayout.putConstraint(SpringLayout.WEST, triButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, elliButton, 6, SpringLayout.SOUTH, circButton);
		baseLayout.putConstraint(SpringLayout.WEST, elliButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, circButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, title, 0, SpringLayout.EAST, circButton);
		baseLayout.putConstraint(SpringLayout.NORTH, circButton, 90, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rectButton, -6, SpringLayout.NORTH, circButton);
		baseLayout.putConstraint(SpringLayout.WEST, rectButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, title, -6, SpringLayout.NORTH, rectButton);
		
		
	}
	
	private void setupListeners()
	{
		rectButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangels();
			}
		});
		
		circButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircles();
			}
		});
		
		elliButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipses();
			}
		});
		
		triButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangles();
			}
		});
		
		polyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygons();
			}
		});
		
		resetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.reset();
			}
		});
	}
}
