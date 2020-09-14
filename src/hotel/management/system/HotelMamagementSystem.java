package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class HotelMamagementSystem extends JFrame implements ActionListener {
	JButton b1;
	
	public HotelMamagementSystem(){
		
		
		ImageIcon i1 = new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\homeImage.jpg");
		JLabel l1 = new JLabel(i1);
		setBounds(550,200, 692,388 );
		l1.setBounds(0, 0, i1.getIconWidth(), i1.getIconHeight());
		
		JLabel l2 = new JLabel("HOTEL MANAGEMENT SYSTEM");
		l2.setBounds(10, 0, 400, 70);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("sarif",Font.BOLD,20));
		l1.add(l2);
		add(l1);
		setVisible(true);
		
		b1 = new JButton("Next");
		b1.setBounds(550, 270, 80, 40);
		b1.setForeground(Color.black);
		b1.setBackground(Color.white);
		b1.addActionListener(this);
		
		l1.add(b1);
		
		while(true) {
			l2.setVisible(true);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l2.setVisible(false);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		HotelMamagementSystem hms = new HotelMamagementSystem();

	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		new Login();
		this.setVisible(false);
		
	}

}
