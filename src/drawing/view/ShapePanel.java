package drawing.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.Rectangle;
import javax.swing.*;
import drawing.controller.Controller;

public class ShapePanel extends JPanel
{
	Controller baseController;
	private ArrayList<Rectangle> rectangleList;
	
	public ShapePanel(Controller baseController)
	{
		super();
		this.baseController = baseController;
		rectangleList = new ArrayList<Rectangle>();
		
		setupPannel();

	}
	
	private void setupPannel()
	{
		this.setBackground(Color.BLUE);
		this.setMinimumSize(new Dimension(250, 500));
	}
	
	private Color getRandomColor()
	{
		int alpha = (int)(Math.random() * 255);
		int red = (int)(Math.random() * 255);
		int green = (int)(Math.random() * 255);
		int blue = (int)(Math.random() * 255);
		
		return new Color(red, green, blue, alpha);
	}

	public void addRectangels() 
	{
		for(int index = 0; index < 500; index++)
		{
			int width = (int)(Math.random() * 120) + 1;
			int height = (int)(Math.random() * 150) + 15;
			int xCorner = (int)(Math.random() * this.getWidth() - 15);
			int yCorner = (int)(Math.random() * this.getHeight() - 15);
			
			Rectangle currentRectangle = new Rectangle(xCorner, yCorner, width, height);
			rectangleList.add(currentRectangle);
		}
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics graphics)
	{
		this.setBackground(Color.BLUE);
		
		Graphics2D drawingGraphics = (Graphics2D) graphics;
		for(Rectangle currentRectangle : rectangleList)
		{
			drawingGraphics.setColor(getRandomColor());;
			int strokeWidth = (int) (Math.random() * 10) + 1;
			drawingGraphics.setStroke(new BasicStroke(strokeWidth));
			
			int randomness = (int)(Math.random() * 35);
			
			if(randomness % 5 == 0 || randomness % 7 == 0)
			{
				drawingGraphics.fill(currentRectangle);
			}
			else
			{
				drawingGraphics.draw(currentRectangle);
			}	
		}
	}
}
