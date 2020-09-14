package hotel.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton r1,r2;
	Font f = new Font("tahoma",Font.PLAIN,15);
	JComboBox cb;
	JButton b;
	
	
	public AddEmployee() {
		JLabel name = new JLabel("NAME");
		name.setBounds(20, 20, 100, 30);
		name.setFont(f);
		add(name);
		
		JLabel age=new JLabel("AGE");
		age.setBounds(20, 80, 100, 30);
		age.setFont(f);
		add(age);
		
		JLabel gender=new JLabel("GENDER");
		gender.setBounds(20, 140, 100, 30);
		gender.setFont(f);
		add(gender);
		
		r1=new JRadioButton("MALE");
		r1.setBounds(125, 140, 70, 30);
		r1.setBackground(Color.white);
		r1.setFont(f);
		add(r1);
		
		r2=new JRadioButton("FEMALE");
		r2.setBounds(205, 140, 80, 30);
		r2.setBackground(Color.white);
		r2.setFont(f);
		add(r2);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		
		JLabel job=new JLabel("JOB");
		job.setBounds(20, 200, 100, 30);
		job.setFont(f);
		add(job);
		
		String s []= {"Front Desk Clerks","House-Keeping","Kitchen Staff","Room Service","Waiter/Waiteress","Manager","Accountant","Porters"};
		cb=new JComboBox(s);
		cb.setBounds(125,200,150,30);
		add(cb);
		cb.setBackground(Color.white );
		
		JLabel salary=new JLabel("SALARY");
		salary.setBounds(20, 260, 100, 30);
		salary.setFont(f);
		add(salary);
		
		JLabel phone=new JLabel("PHONE");
		phone.setBounds(20, 320, 100, 30);
		phone.setFont(f);
		add(phone);
		
		JLabel aadhar=new JLabel("AADHAR");
		aadhar.setBounds(20, 380, 100, 30);
		aadhar.setFont(f);
		add(aadhar);
		
		JLabel mail=new JLabel("E-MAIL");
		mail.setBounds(20, 440, 100, 30);
		mail.setFont(f);
		add(mail);
				
		t1=new JTextField();
		t1.setBounds(125, 20, 150, 30);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(125, 80, 30, 30);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(125, 260, 150, 30);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(125, 320, 150, 30);
		add(t4);
		
		t5=new JTextField();
		t5.setBounds(125, 380, 150, 30);
		add(t5);
		
		t6=new JTextField();
		t6.setBounds(125, 440, 150, 30);
		add(t6);
		
		b=new JButton("SUBMIT");
		b.setBounds(175, 500, 100, 30);
		b.setBackground(Color.black);
		b.setForeground(Color.white);
		b.addActionListener(this);
		add(b);
		
		JLabel ll= new JLabel("ADD EMPLOYEE DETAILS");
		ll.setBounds(310, 40, 400, 30);
		ll.setFont(new Font("tahoma",Font.PLAIN,30));
		ll.setForeground(Color.BLUE);
		add(ll);
		
		ImageIcon i = new ImageIcon("C:\\Users\\91946\\eclipse-workspace\\Hotel Management System\\src\\hotel\\management\\system\\icons\\tenth.jpg");
		Image i1=i.getImage().getScaledInstance(400, 450, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		JLabel la = new JLabel(i2);
		la.setBounds(280, 50, 400, 450);
		add(la);
		
		
		Container c = getContentPane();
		c.setBackground(Color.white);
		setBounds(600,220,700,600);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddEmployee ae=new AddEmployee();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String name=t1.getText();
		String age=t2.getText();
		String salary=t3.getText();
		String phone=t4.getText();
		String aadhar=t5.getText();
		String mail=t6.getText();
		String gender = null;
		if(r1.isSelected()) {
			gender="Male";
		}
		else {
			gender="Female";
		}
		String job=(String) cb.getSelectedItem();
		
		Conn c = new Conn();
		String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+mail+"')";
		try {
			c.s.executeUpdate(str);
			JOptionPane.showMessageDialog(null, "Employee Details added Successfully");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
