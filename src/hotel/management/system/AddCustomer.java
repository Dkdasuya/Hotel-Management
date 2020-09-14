package hotel.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddCustomer extends JFrame implements ActionListener{
	
	Font font = new Font("tahoma",Font.PLAIN,25);
	Font f = new Font ("tahoma",Font.PLAIN,15);
	JComboBox cb1;
	JTextField t1,t2,t3,t4,t5;
	JRadioButton r1,r2;
	Choice c1;
	JButton b1,b2;
	
	public AddCustomer() {
		
		JLabel l1 = new JLabel("New Customer Form");
		l1.setBounds(50, 20, 250, 30);
		l1.setFont(font);
		l1.setForeground(Color.BLUE);
		add(l1);
		
		
		JLabel l2 = new JLabel("ID");
		l2.setBounds(20, 70, 120, 30);
		l2.setFont(f);
		//l1.setForeground(Color.BLUE);
		add(l2);
		
		cb1= new JComboBox(new String [] {"Passport","Voter's ID Card","Driving License","Aadhar Card"});
		cb1.setBounds(210, 70, 150, 30);
		cb1.setFont(f);
		cb1.setBackground(Color.white);
		add(cb1);
		
		JLabel l3 = new JLabel("ID Number");
		l3.setBounds(20, 120, 120, 30);
		l3.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(210, 120, 150, 30);
		t1.setFont(f);
		add(t1);
		
		JLabel l4 = new JLabel("Name");
		l4.setBounds(20, 170, 120, 30);
		l4.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(210, 170, 150, 30);
		t2.setFont(f);
		add(t2);
		
		JLabel l5 = new JLabel("Gender");
		l5.setBounds(20, 220, 120, 30);
		l5.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l5);
		
		r1=new JRadioButton("Male");
		r1.setBounds(210, 220, 75, 30);
		r1.setFont(f);
		r1.setBackground(Color.WHITE);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setBounds(285, 220, 75, 30);
		r2.setFont(f);
		r2.setBackground(Color.WHITE);
		add(r2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel l6 = new JLabel("Country");
		l6.setBounds(20, 270, 120, 30);
		l6.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l6);
		
		t3=new JTextField();
		t3.setBounds(210, 270, 150, 30);
		t3.setFont(f);
		add(t3);
		
		JLabel l7 = new JLabel("Allocated Room Number");
		l7.setBounds(20, 320, 170, 30);
		l7.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l7);
		
		c1 = new Choice();
		try {
			Conn c = new Conn();
			String str  = "select * from room where available ='available'";
			ResultSet rs = c.s.executeQuery(str);
			while(rs.next()) {
				c1.add(rs.getString("roomno."));
			}
		}
		catch(Exception e) {
			
		}
		c1.setBounds(210, 325, 150, 35);
		add(c1);
		
		
		JLabel l8 = new JLabel("Checked In");
		l8.setBounds(20, 370, 120, 30);
		l8.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l8);
		
		t4=new JTextField();
		t4.setBounds(210, 370, 150, 30);
		t4.setFont(f);
		add(t4);
		
		JLabel l9 = new JLabel("Deposit");
		l9.setBounds(20, 420, 120, 30);
		l9.setFont(f);
		//l3.setForeground(Color.BLUE);
		add(l9);
		
		t5=new JTextField();
		t5.setBounds(210, 420, 150, 30);
		t5.setFont(f);
		add(t5);
		
		b1=new JButton("Add Customer");
		b1.setBounds(30,460,150,30);
		b1.setFont(f);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Back");
		b2.setBounds(190,460,150,30);
		b2.setFont(f);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		add(b2);
		b2.addActionListener(this);
		
		ImageIcon i  = new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\fifth.png");
		Image i1= i.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		JLabel ll = new JLabel(i2);
		ll.setBounds(400, 50, 300, 400);
		add(ll);
		
		Container c = this.getContentPane();
		c.setBackground(Color.white);
		setLayout(null);
		setBounds(575,220,750,550);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddCustomer ac = new AddCustomer();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			String id=(String)cb1.getSelectedItem();
			String number=t1.getText();
			String name=t2.getText();
			String gender = "";
			if(r1.isSelected()) {
				gender="Male";
			}else if(r2.isSelected()) {
				gender="Female";
			}
			String country=t3.getText();
			String room = c1.getSelectedItem();
			String status=t4.getText();
			String deposit=t5.getText();
			String str= "insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room+"','"+status+"','"+deposit+"')";
			String str1="UPDATE `hotelmanagement`.`room` SET `available` = 'Occupied' WHERE (`roomno.` = '"+room+"');";
			
			try {
				Conn c  = new Conn();
				c.s.executeUpdate(str);
				c.s.executeUpdate(str1);
				JOptionPane.showMessageDialog(null, "New Customer Added Successfully");
				this.setVisible(false);
				
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
