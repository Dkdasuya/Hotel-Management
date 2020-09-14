package hotel.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Reception extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	Font font =  new Font("tahaoma",Font.PLAIN,13);
	
	public Reception() {
		
		b1=new JButton("New customer Form");
		b1.setBounds(20, 30, 160, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setFont(font);
		add(b1);
	//	b1.addActionListener(this);
		
		b2=new JButton("Room");
		b2.setBounds(20, 80, 160, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setFont(font);
		add(b2);

		b3=new JButton("Department");
		b3.setBounds(20, 130, 160, 30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.white);
		b3.setFont(font);
		add(b3);
		
		b4=new JButton("All Employee Info");
		b4.setBounds(20, 180, 160, 30);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.white);
		b4.setFont(font);
		add(b4);
		b4.addActionListener(this);
		
		b5=new JButton("Customer Info");
		b5.setBounds(20, 230, 160, 30);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.white);
		b5.setFont(font);
		add(b5);
		
		b6=new JButton("Manager Info");
		b6.setBounds(20, 280, 160, 30);
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.white);
		b6.setFont(font);
		b6.addActionListener(this);
		add(b6);
		
		b7=new JButton("Check Out");
		b7.setBounds(20, 230, 160, 30);
		b7.setBackground(Color.BLACK);
		b7.setForeground(Color.white);
		b7.setFont(font);
		add(b7);
		
		b8=new JButton("Update Check Status");
		b8.setBounds(20, 280, 160, 30);
		b8.setBackground(Color.BLACK);
		b8.setForeground(Color.white);
		b8.setFont(font);
		add(b8);
		
		b9=new JButton("Update Room Status");
		b9.setBounds(20, 330, 160, 30);
		b9.setBackground(Color.BLACK);
		b9.setForeground(Color.white);
		b9.setFont(font);
		add(b9);
		
		b10=new JButton("Pick Up Service");
		b10.setBounds(20, 380, 160, 30);
		b10.setBackground(Color.BLACK);
		b10.setForeground(Color.white);
		b10.setFont(font);
		add(b10);
		
		b11=new JButton("Search Room");
		b11.setBounds(20, 430, 160, 30);
		b11.setBackground(Color.BLACK);
		b11.setForeground(Color.white);
		b11.setFont(font);
		add(b11);
		
		b12=new JButton("Logout");
		b12.setBounds(20, 480, 160, 30);
		b12.setBackground(Color.BLACK);
		b12.setForeground(Color.white);
		b12.setFont(font);
		add(b12);
		
		ImageIcon i =  new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\fourth.jpg");
		Image i1 = i.getImage().getScaledInstance(450, 480, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i1);
		JLabel ll= new JLabel(i3);
		ll.setBounds(200, 30, 450, 480);
		add(ll);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
				
		
		setLayout(null);
		Container c = this.getContentPane();
		c.setBackground(Color.white);
		setBounds(575,220,710,580);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reception r = new Reception();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			new AddCustomer().setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource()==b2) {
			
		}else if(ae.getSource()==b3) {
			
		}else if(ae.getSource()==b4) {
			this.setVisible(false);
			new AllEmployeeInfo().setVisible(true);
			
		}else if(ae.getSource()==b5) {
		
		}else if(ae.getSource()==b6) {
			this.setVisible(false);
			new ManagerInfo().setVisible(true);
			
		}else if(ae.getSource()==b7) {
			
		}else if(ae.getSource()==b8) {
			
		}else if(ae.getSource()==b9) {
			
		}else if(ae.getSource()==b10) {
			
		}else if(ae.getSource()==b11) {
			
		}else if(ae.getSource()==b12) {
			this.setVisible(false);
		}
		
		
	}

}
