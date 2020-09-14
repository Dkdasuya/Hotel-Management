package hotel.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class ShowRoom extends JFrame implements ActionListener{
	
	JTable t1;
	JButton b1,b2;
	Font font = new Font("tahoma",Font.PLAIN,15);
	
	public ShowRoom() {
		t1=new JTable();
		t1.setBounds(10, 40, 380, 480);
		t1.setBackground(Color.white);
		add(t1);
		
		b1=new JButton("Load Data");
		b1.setBounds(60, 550, 120, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(250, 550, 120, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i=new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\eight.jpg");
		Image i1 = i.getImage().getScaledInstance(450, 470, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		JLabel ll  = new JLabel(i2);
	    ll.setBounds(400,45,450,470);
		add(ll);
		
		JLabel l1=new JLabel("Room No.");
		l1.setBounds(15, 10, 80, 30);
		l1.setFont(font);
		add(l1);
		
		JLabel l2=new JLabel("Available");
		l2.setBounds(90, 10, 80, 30);
		l2.setFont(font);
		add(l2);
		
		JLabel l3=new JLabel("Status");
		l3.setBounds(170, 10, 80, 30);
		l3.setFont(font);
		add(l3);
		
		JLabel l4=new JLabel("Deposit");
		l4.setBounds(240, 10, 80, 30);
		l4.setFont(font);
		add(l4);
		
		JLabel l5=new JLabel("Bed Type");
		l5.setBounds(317, 10, 80, 30);
		l5.setFont(font);
		add(l5);
		Container c = this.getContentPane();
		c.setBackground(Color.white);
		setBounds(500,220,880,650 );
		//this.setResizable(false);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom r1 = new ShowRoom();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			
			try {
				Conn c = new Conn();
				String str="select * from room";
				ResultSet rs = c.s.executeQuery(str);
				t1.setModel(DbUtils.resultSetToTableModel(rs));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
			new Reception().setVisible(true);
		}
		
		
	}

}
