package hotel.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing .*;
import net.proteanit.sql.*;

public class ManagerInfo extends JFrame implements ActionListener{
	
	JTable t1;
	JButton b1,b2;
	Font font = new Font ("tahoma ",Font.PLAIN,15);
	
	public ManagerInfo() {
		t1=new JTable();
		t1.setBounds(20, 40, 950, 450);
		add(t1);
		
		JLabel l1 = new JLabel ("Name");
		l1.setBounds(40,10,50,30);
		l1.setFont(font);
		add(l1);
		
		JLabel l2 = new JLabel ("Age");
		l2.setBounds(170,10,50,30);
		l2.setFont(font);
		add(l2);
		
		JLabel l3 = new JLabel ("Gender");
		l3.setBounds(280,10,50,30);
		l3.setFont(font);
		add(l3);
		
		JLabel l4 = new JLabel ("Job");
		l4.setBounds(410,10,50,30);
		l4.setFont(font);
		add(l4);
		
		JLabel l5 = new JLabel ("Salary");
		l5.setBounds(520,10,50,30);
		l5.setFont(font);
		add(l5);
		
		JLabel l6 = new JLabel ("Phone No.");
		l6.setBounds(630,10,100,30);
		l6.setFont(font);
		add(l6);
		
		JLabel l7 = new JLabel ("Aadhar");
		l7.setBounds(750,10,80,30);
		l7.setFont(font);
		add(l7);
		
		JLabel l8 = new JLabel ("E-Mail");
		l8.setBounds(870,10,50,30);
		l8.setFont(font);
		add(l8);
		
		b1=new JButton("Load Data");
		b1.setBounds(280, 500, 120, 30);
		add(b1);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		
		b2=new JButton("Back");
		b2.setBounds(550, 500, 120, 30);
		add(b2);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		
		Container c = this.getContentPane();
		c.setBackground(Color.WHITE);
		
		setBounds(440,220,1010,590);
		//this.setResizable(false);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ManagerInfo ai= new ManagerInfo();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			try {
				Conn c = new Conn();
				String str="select * from employee where job='Manager'";
				ResultSet rs=c.s.executeQuery(str);
				
				t1.setModel(DbUtils.resultSetToTableModel(rs));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b2) {
			
			this.setVisible(false);
			new Reception().setVisible(true);
			
		}
	}

}
