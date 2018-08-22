import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import java.sql.*;

public class AdminPage extends JFrame implements ActionListener
{
	JLabel adm,addNew,name,Address,Source, destination,nos,search,byName,byCId,delete,byN,byId,or;
	JTextField n,adrs,src,dstn,mem,bn,bCid;
	JButton ad,srch,dlt,exit,log,up;
	Connection con;
	Statement statement;
	ResultSet rs;
	AdminPage() throws ClassNotFoundException, SQLException
	{
		getContentPane().setBackground(Color.orange);
		JFrame f;
		
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","golender");
		statement=con.createStatement();
		rs=statement.executeQuery("select * from registration");
		
		adm=new JLabel("ADMINISTRATOR");
		adm.setBounds(10,10,800,100);
		adm.setForeground(Color.RED);
		adm.setFont(adm.getFont().deriveFont((float) 30.0));
		add(adm);
		
		ad=new JButton("ADD CUSTOMER");
		ad.setBounds(30,150,200,60);
		ad.setFont(ad.getFont().deriveFont((float) 20.0));
		add(ad);
		
		search=new JLabel("SEARCH CUSTOMER DETAILS");
		search.setBounds(380,90,300,20);
		search.setFont(search.getFont().deriveFont((float) 20.0));
		add(search);
		
		byName=new JLabel("BY NAME");
		byName.setBounds(440,120,200,20);
		byName.setFont(byName.getFont().deriveFont((float) 15.0));
		add(byName);
		
		bn=new JTextField(15);
		bn.setBounds(400,150,200,20);
		add(bn);
		
		or=new JLabel("OR");
		or.setBounds(450,180,200,20);
		or.setFont(or.getFont().deriveFont((float) 20.0));
		add(or);
		
		byCId=new JLabel("BY CUSTOMER ID");
		byCId.setBounds(420,210,200,20);
		byCId.setFont(byCId.getFont().deriveFont((float) 15.0));
		add(byCId);
		
		bCid=new JTextField(15);
		bCid.setBounds(400,240,200,20);
		add(bCid);
		
		srch=new JButton("SEARCH");
		srch.setBounds(410,300,150,20);
		srch.setFont(srch.getFont().deriveFont((float) 20.0));
		add(srch);
		srch.addActionListener(this);
		
		delete=new JLabel("DELETE CUSTOMER INFO");
		delete.setBounds(700,10,300,180);
		delete.setFont(delete.getFont().deriveFont((float) 20.0));
		add(delete);
		
		byName=new JLabel("BY NAME");
		byName.setBounds(740,120,200,20);
		byName.setFont(byName.getFont().deriveFont((float) 15.0));
		add(byName);
		
		bn=new JTextField(15);
		bn.setBounds(700,150,200,20);
		add(bn);
		
		or=new JLabel("OR");
		or.setBounds(750,180,200,20);
		or.setFont(or.getFont().deriveFont((float) 20.0));
		add(or);
		
		byCId=new JLabel("BY CUSTOMER ID");
		byCId.setBounds(720,210,200,20);
		byCId.setFont(byCId.getFont().deriveFont((float) 15.0));
		add(byCId);
		
		bCid=new JTextField(15);
		bCid.setBounds(700,240,200,20);
		add(bCid);
		
		dlt=new JButton("DELETE");
		dlt.setBounds(710,300,150,20);
		dlt.setFont(dlt.getFont().deriveFont((float) 20.0));
		add(dlt);
		dlt.addActionListener(this);
		
		exit=new JButton("EXIT");
		exit.setBounds(450,500,150,40);
		exit.setFont(exit.getFont().deriveFont((float) 20.0));
		add(exit);
		exit.addActionListener(this);
		
		log=new JButton("LOGOUT");
		log.setBounds(630,500,150,40);
		log.setFont(log.getFont().deriveFont((float) 20.0));
		add(log);
		log.addActionListener(this);
		
		up=new JButton("UPDATE");
		up.setBounds(830,500,150,40);
		up.setFont(log.getFont().deriveFont((float) 20.0));
		add(up);
		up.addActionListener(this);
		ad.addActionListener(this);
		setTitle("ADMIN");
		setSize(1100,650);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		new AdminPage();
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource()==ad)
		{
			try {
				new Reg();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			setVisible(false);
		}
		if(e.getSource()==srch)
		{
			new CustomerDetails();
			setVisible(false);
		}
	
	}
	

}

