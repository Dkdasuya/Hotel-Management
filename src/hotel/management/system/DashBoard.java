package hotel.management.system;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DashBoard extends JFrame implements ActionListener {
	
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem mi1,mi2,mi3,mi4;
	
	public DashBoard() {
		
		mb = new JMenuBar();
		add(mb);
		
		m1=new JMenu("HOTEL MANAGEMENT");
		mb.add(m1);
		m1.setForeground(Color.red);
		
		m2 = new JMenu("ADMIN");
		mb.add(m2);
		m2.setForeground(Color.blue);
		
		mi1=new JMenuItem("RECEPTION");
		mi1.addActionListener(this);
		m1.add(mi1);
		
		mi2=new JMenuItem("ADD ROOMS");
		mi2.addActionListener(this);
		m2.add(mi2);
		
		mi3=new JMenuItem("ADD EMPLOYEE");
		mi3.addActionListener(this);
		m2.add(mi3);
		
		mi4=new JMenuItem("ADD DRIVERS");
		mi4.addActionListener(this);
		m2.add(mi4);
		
		setLayout(null);
		setBounds(0,0,1950,1020);
		
		mb.setBounds(0, 0, 1950, 24);
		
		ImageIcon i= new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\third.jpg");
		
		Image i2 =i.getImage().getScaledInstance(1950, 1020, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l = new JLabel(i3);
		l.setBounds(0, 24, 1950, 1020);
		
		JLabel l1= new JLabel("THE TAJ GROUP WELCOMES YOU");
		l1.setBounds(610,70,800,70);
		l1.setFont(new Font("Arial",Font.PLAIN,40));
		l1.setForeground(Color.WHITE);
		l.add(l1);
		
		
		add(l);
		
		setVisible(true);
		
		
	}
	
	public static void main(String args[]) {
		DashBoard db = new DashBoard();
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand().equals("ADD EMPLOYEE")) {
			new AddEmployee().setVisible(true);
			
		}
		else if(ae.getActionCommand().equals("ADD ROOMS")) {
			new AddRooms().setVisible(true);
		}
		else if(ae.getActionCommand().equals("ADD DRIVERS")) {
			new AddDrivers().setVisible(true);
		}
		else if(ae.getActionCommand().equals("RECEPTION")) {
			new Reception().setVisible(true);
		}
		
	}

}
