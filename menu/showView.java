package menu;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class showView {
	public showView() {
		JFrame frame = new JFrame("Show View");
		frame.setSize(500, 400);
		frame.setLayout(null);
		
		JLabel l = new JLabel("Ban muon xem hinh chieu nao?");
		l.setSize(400, 40);
		l.setLocation(50,40);
		frame.add(l);
		
		JButton b1 = new JButton("hinh chieu 1");
		b1.setSize(150, 40);
		b1.setLocation(50,100);
		b1.setFocusPainted(false);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				//goi ham show hinh chieu
				new camera();
			}
		});
		frame.add(b1);
		
		JButton b2 = new JButton("hinh chieu 2");
		b2.setSize(150, 40);
		b2.setLocation(50,160);
		b2.setFocusPainted(false);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(false);
				//goi ham show hinh chieu
			}
		});
		frame.add(b2);
		
		JButton b3 = new JButton("hinh chieu 3");
		b3.setSize(150, 40);
		b3.setLocation(50,220);
		b3.setFocusPainted(false);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(false);
				//goi ham show hinh chieu
			}
		});
		frame.add(b3);
		
		JButton b4 = new JButton("hinh chieu 4");
		b4.setSize(150, 40);
		b4.setLocation(230,100);
		b4.setFocusPainted(false);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(false);
				//goi ham show hinh chieu
			}
		});
		frame.add(b4);
		
		JButton b5 = new JButton("hinh chieu 5");
		b5.setSize(150, 40);
		b5.setLocation(230,160);
		b5.setFocusPainted(false);
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(false);
				//goi ham show hinh chieu
			}
		});
		frame.add(b5);
		
		JButton b6 = new JButton("hinh chieu 6");
		b6.setSize(150, 40);
		b6.setLocation(230,220);
		b6.setFocusPainted(false);
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(false);
				//goi ham show hinh chieu
			}
		});
		frame.add(b6);
		
		JButton b7 = new JButton("phan tram nhin thay");
		b7.setSize(200, 40);
		b7.setLocation(125,280);
		b7.setFocusPainted(false);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(false);
				// in phan tram nhìn thấy
				  String str = "Phần trăm nhìn thấy:  ";

				JOptionPane.showMessageDialog(null, str);
			}
		});
		frame.add(b7);
		
		frame.setVisible(true);
	}
	
	//public static void main(String[] argv) {
	//	new showView();
	//}
}