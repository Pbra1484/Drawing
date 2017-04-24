package drawing.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import drawing.controller.Controller;


public class DrawingFrame extends JFrame 
{
	Controller baseController;
	DrawingPanel drawingPanel;
	
	public DrawingFrame(Controller baseController)
	{
		super();
		this.baseController = baseController;
		drawingPanel = new DrawingPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(drawingPanel);
		this.setSize(new Dimension(600, 600));
		this.setTitle("yep");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
