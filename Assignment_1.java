import java.awt.*;

//Write a program that use the DrawingPanel to draw Figure 3G.21


public class Assignment_1 {

	public static void main(String[] args) {
		//set up panel and graphics object
		DrawingPanel panel = new DrawingPanel(400,400);
		Graphics g = panel.getGraphics();
		
		//draw Mickey Mouse!
		g.setColor(Color.BLUE);
		g.fillOval(50, 50, 100, 100);
		g.fillOval(250, 50, 100, 100);
		g.setColor(Color.RED);
		g.fillRect(100, 100, 200, 200);
		g.setColor(Color.BLACK);
		g.drawLine(100, 200, 300, 200);
		
		

	}//end of main

}//end of class
