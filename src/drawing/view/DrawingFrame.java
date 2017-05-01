package drawing.view;

import java.awt.Dimension;

import javax.swing.JFrame;
import drawing.controller.Controller;


public class DrawingFrame extends JFrame 
{
	private Controller baseController;
	private DrawingPanel drawingPanel;
	
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
		this.setSize(new Dimension(800, 800));
		this.setTitle("yep");
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
	}

}
