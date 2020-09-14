package hotel.management.system;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	
	
	Login(){
		setLayout(null);
		
		l1=new JLabel("Username");
		l1.setBounds(20,30,100,70);
		l1.setFont(new Font("Arial",Font.BOLD,15));
		
		l2=new JLabel("Password");
		l2.setBounds(20,100,100,70);
		l2.setFont(new Font("Arial",Font.BOLD,15));
		
		t1=new JTextField();
		t1.setBounds(110, 50, 140, 30);
		
		p1=new JPasswordField();
		p1.setBounds(110, 120, 140, 30);
		
		b1=new JButton("Login");
		b1.setBounds(20,180,100,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		
		b2=new JButton("Cancel");
		b2.setBounds(150,180,100,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		
		ImageIcon i = new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\second.jpg");
		
		
		Image i1 =i.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i2 =new ImageIcon(i1);
		JLabel l3 = new JLabel(i2);
		l3.setBounds(120, -170, i.getIconWidth(), i.getIconHeight());
		
		getContentPane().setBackground(Color.WHITE);
		
		add(l3);
		add(b2);
		add(b1);
		add(p1);
		add(t1);
		add(l1);
		add(l2);
		
		setBounds(600 ,200,600,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Login l = new Login();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String username=t1.getText();
			String password = p1.getText();
			Conn c = new Conn();
			String str = "select * from login where username = '"+username+"' and password ='"+password+"'";
			try{
				ResultSet rs = c.s.executeQuery(str);
				
				if(rs.next()) {
					new DashBoard().setVisible(true);
					this.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username or Password");
					//this.setVisible(false);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b2) {
			System.exit(0);
		}
		
	}

}
