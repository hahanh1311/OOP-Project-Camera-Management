package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class camera extends JFrame  {
	
	public camera() {
		 SmileyApp smiley = new SmileyApp();
	
		this.setVisible(true);
		this.setSize(1400, 800);
	
		this.setLocationRelativeTo(null);
		
		this.add(smiley);
	}
	
	
}