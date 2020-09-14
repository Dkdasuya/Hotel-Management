package hotel.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddRooms extends JFrame implements ActionListener{
	Font f = new Font("tahoma",Font.PLAIN,15);
	JTextField t1,t2;
	JComboBox cb1,cb2,cb3;
	JButton b1 ,b2;
	
	public AddRooms() {
		
		JLabel l1 = new JLabel("Room Number");
		l1.setBounds(20, 70, 120, 30);
		l1.setFont(f);
		add(l1);
		
		JLabel l6 = new JLabel("ADD ROOM");
		l6.setBounds(87,20,120,30);
		l6.setFont(new Font("tahoma",Font.PLAIN,22));
		l6.setForeground(Color.BLUE);
		add(l6);
		
		t1=new JTextField();
		t1.setBounds(150,70,120,30);
		add(t1);
		
		JLabel l2 = new JLabel("Availability");
		l2.setBounds(20, 140, 120, 30);
		l2.setFont(f);
		add(l2);
		
		cb1=new JComboBox(new String[] {"Available","Occupied"});
		cb1.setBounds(150, 140, 120, 30);
		cb1.setBackground(Color.white);
		cb1.setFont(f);
		add(cb1);
		
		JLabel l3 = new JLabel("Cleaning Status");
		l3.setBounds(20, 210, 120, 30);
		l3.setFont(f);
		add(l3);
		
		cb2=new JComboBox(new String[] {"Cleaned","Dirty"});
		cb2.setBounds(150, 210, 120, 30);
		cb2.setBackground(Color.white);
		cb2.setFont(f);
		add(cb2);
		
		JLabel l4 = new JLabel("Price");
		l4.setBounds(20, 280, 120, 30);
		l4.setFont(f);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(150, 280, 120, 30);
		add(t2);
		
		JLabel l5 = new JLabel("Bed Type");
		l5.setBounds(20, 350, 120, 30);
		l5.setFont(f);
		add(l5);
		
		cb3=new JComboBox(new String[] {"Single Bed","Double Bed"});
		cb3.setBounds(150, 350, 120, 30);
		cb3.setBackground(Color.white);
		cb3.setFont(f);
		add(cb3);
		
		b1= new JButton("Add Room");
		b1.setBounds(30, 430, 100, 30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		b1.addActionListener(this);
		
		b2= new JButton("Cancel");
		b2.setBounds(150, 430, 100, 30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		b2.addActionListener(this);
		
		ImageIcon i = new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\eight.jpg");
		Image i1 = i.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		JLabel ll= new JLabel(i2);
		ll.setBounds(300, 30, 400, 400);
		add(ll);
		
		
		setLayout(null);
		setBounds(575,220,750,550);
		setVisible(true);
		Container c = this.getContentPane();
		c.setBackground(Color.WHITE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddRooms ad = new AddRooms();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			
			String room = t1.getText();
			String available = (String)cb1.getSelectedItem();
			String status = (String)cb2.getSelectedItem();
			String price = t2.getText();
			String type = (String) cb3.getSelectedItem();
			
			Conn c = new Conn();
			try {
				String str= "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "Room is added successfully");
				t1.setText("");
				t2.setText("");
				
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
			
		}
		else if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
	}

}
