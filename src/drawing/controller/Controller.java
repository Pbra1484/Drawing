package drawing.controller;

import drawing.view.DrawingPanel;

public class Controller 
{
	DrawingPanel drawingPanel;
	
	Controller()
	{
		this.drawingPanel = new DrawingPanel(this);
	}
	
	public void start()
	{
		
	}

}
