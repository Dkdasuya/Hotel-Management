package hotel.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddDrivers extends JFrame  implements ActionListener{
	
	JTextField t1,t2,t3,t4,t5;
	JRadioButton r1,r2;
	JComboBox cb;
	JButton b1,b2;
	Font font = new Font("tahoma",Font.PLAIN,15);
	
	public AddDrivers() {
		Container c = this.getContentPane();
		c.setBackground(Color.WHITE);
		
		JLabel l = new JLabel("Add Drivers");
		l.setBounds(70,20,140,30);
		l.setFont(new Font("tahoma",Font.PLAIN,25));
		l.setForeground(Color.BLUE);
		add(l);
		
		JLabel l1 = new JLabel("Name");
		l1.setBounds(24,70,120,30);
		l1.setFont(font);
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(150, 70, 130, 30);
		add(t1);
		
		JLabel l2 = new JLabel("Age");
		l2.setBounds(24,120,120,30);
		l2.setFont(font);
		add(l2);
		
		t2=new JTextField();
		t2.setBounds(150, 120, 30, 30);
		add(t2);
		
		JLabel l3 = new JLabel("Gender");
		l3.setBounds(24,170,120,30);
		l3.setFont(font);
		add(l3);
		
		r1=new JRadioButton("Male");
		r1.setBounds(150,170,60,30);
		r1.setBackground(Color.WHITE);
		r1.setFont(font);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setBounds(210,170,80,30);
		r2.setBackground(Color.WHITE);
		r2.setFont(font);
		add(r2);
		
		ButtonGroup g = new ButtonGroup();
		g.add(r1);
		g.add(r2);
		
		JLabel l4 = new JLabel("Car Company");
		l4.setBounds(24,220,120,30);
		l4.setFont(font);
		add(l4);
		
		t3 = new JTextField();
		t3.setBounds(150, 220, 130, 30);
		add(t3);
		
		JLabel l5 = new JLabel("Car Model");
		l5.setBounds(24,270,120,30);
		l5.setFont(font);
		add(l5);
		
		t4 = new JTextField();
		t4.setBounds(150, 270, 130, 30);
		add(t4);
		
		JLabel l6 = new JLabel("Available");
		l6.setBounds(24,320,120,30);
		l6.setFont(font);
		add(l6);
		
		cb=new JComboBox(new String []{"Available","Busy"});
		cb.setBounds(150, 320, 130, 30);
		cb.setBackground(Color.WHITE);
		cb.setFont(font);
		add(cb);
		
		JLabel l7 = new JLabel("Location");
		l7.setBounds(24,370,120,30);
		l7.setFont(font);
		add(l7);
		
		t5 = new JTextField();
		t5.setBounds(150, 370, 130, 30);
		add(t5);
		
		ImageIcon i = new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\eleven.jpg");
		Image i1 = i.getImage().getScaledInstance(420, 390, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		JLabel ll = new JLabel(i2);
		ll.setBounds(300, 40, 420, 390);
		add(ll);
		
		b1 = new JButton ("Add Driver");
		b1.setBounds(24, 430, 110, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setFont(font);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton ("Cancel");
		b2.setBounds(164, 430, 100, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setFont(font);
		b2.addActionListener(this);
		add(b2);
		
		setLayout(null);
		setBounds(575,220,750,550);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDrivers ad = new AddDrivers();
		

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		else if(ae.getSource()==b1) {
			String name = t1.getText();
			String age = t1.getText();
			String gender = "";
			if(r1.isSelected()) {
				gender="Male";
			}
			else if (r2.isSelected()) {
				gender="Female";
			}
			String company = t3.getText();
			String model = t4.getText();
			String available=(String) cb.getSelectedItem();
			String location = t5.getText();
			Conn c  = new Conn();
			String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+model+"','"+available+"','"+location+"')";
			try {
				c.s.executeUpdate(str);
				JOptionPane.showMessageDialog(null, "Driver Added Successfully");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
