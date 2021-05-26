package menu;

import java.awt.*;
import javax.swing.*;
public class SmileyApp extends JPanel {
	Color background_cl1 = Color.white;
	Color background_cl2 = Color.black;
	
	int column = 1400, row = 800;	
	int hc[][] = new int[column][row];

	 @Override
	 public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	   
	    	g.setColor(Color.white);
	    	g.fillRect(0, 0,column, row);	
	    	
			for (int i = 0; i < column; i++)
				for (int j = 0; j < row; j++) 
				{
					if (hc[j][i]==1)
					{
					g.setColor(background_cl2);
					
					g.fillRect(i, j, 1, 1);

					}
					
				}
		
	 }
}
			
		
	