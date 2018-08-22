import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
public class CustomerDetails extends JFrame implements ActionListener
{
	JTable table1;
	JLabel cusname,cusgender,cusemail,cusaddress,cuspackage,cusid,cusbill,cussource,cusdest,cuscontact;
	JTextField nametxt,gendertxt,emailtxt,addresstxt,packagetxt,idtxt,billtxt,sourcetxt,desttxt,contacttxt;
	JButton backbutton;
	public CustomerDetails()
	{
		setTitle("Journey Details");
		setSize(800,700);
		setLayout(null);
		
		getContentPane().setBackground(Color.orange);
		
		JLabel reg=new JLabel("CUSTOMER JOURNEY DETAILS :");
		reg.setFont(new Font("Serif", Font.BOLD,20));
		reg.setForeground(Color.RED);
		reg.setBounds(30,20,360,50);
		add(reg);
		
		cusid=new JLabel("CUSTOMER ID :");
		cusid.setFont(new Font("Serif",Font.BOLD,13));
		cusid.setForeground(Color.BLUE);
		cusid.setBounds(80,90,200,40);
		idtxt=new JTextField(20);
		idtxt.setEditable(false);
		idtxt.setBounds(250,95,120,30);
		add(cusid);
		add(idtxt);
		
		cusname=new JLabel("CUSTOMER NAME :");
		cusname.setFont(new Font("Serif", Font.BOLD,13));
		cusname.setForeground(Color.BLACK);
		cusname.setBounds(80,130,120,40);
		nametxt=new JTextField(20);
		nametxt.setEditable(false);
		nametxt.setBounds(250,135,200,30);
		add(cusname);
		add(nametxt);
		
		cusgender=new JLabel("GENDER:");
		cusgender.setFont(new Font("Serif", Font.BOLD,13));
		cusgender.setForeground(Color.BLACK);
		cusgender.setBounds(80,190,80,40);
		gendertxt=new JTextField(20);
		gendertxt.setEditable(false);
		gendertxt.setBounds(250,195,100,25);
		add(cusgender);
		add(gendertxt);
		
		cuscontact=new JLabel("CONTACT NO:");
		cuscontact.setFont(new Font("Serif",Font.BOLD,13));
		cuscontact.setForeground(Color.BLACK);
		cuscontact.setBounds(80, 240, 180, 40);
		contacttxt=new JTextField(10);
		contacttxt.setEditable(false);
		contacttxt.setBounds(250,245,200,30);
		add(cuscontact);
		add(contacttxt);
		
		cusaddress=new JLabel("ADDRESS DETAILS:");
		cusaddress.setFont(new Font("Serif", Font.BOLD,13));
		cusaddress.setForeground(Color.BLACK);
		cusaddress.setBounds(80, 290, 160, 40);
		addresstxt=new JTextField(60);
		addresstxt.setEditable(false);
		addresstxt.setBounds(250,295,200,60);
		add(cusaddress);
		add(addresstxt);
	
		cusemail=new JLabel("EMAIL ADDRESS:");
		cusemail.setFont(new Font("Serif", Font.BOLD,13));
		cusemail.setForeground(Color.BLACK);
		cusemail.setBounds(80,370,150,40);
		emailtxt=new JTextField(20);
		emailtxt.setEditable(false);
		emailtxt.setBounds(250,375,250,30);
		add(cusemail);
		add(emailtxt);
		
		cuspackage=new JLabel("PACKAGE NAME:");
		cuspackage.setFont(new Font("Serif", Font.BOLD,13));
		cuspackage.setForeground(Color.BLACK);
		cuspackage.setBounds(80,420,150,40);
		packagetxt=new JTextField(20);
		packagetxt.setEditable(false);
		packagetxt.setBounds(250,420,250,30);
		add(cuspackage);
		add(packagetxt);
		
		cusbill=new JLabel("TOTAL AMOUNT :");
		cusbill.setFont(new Font("Serif",Font.BOLD,13));
		cusbill.setForeground(Color.BLACK);
		cusbill.setBounds(80,565,150,40);
		billtxt=new JTextField(30);
		billtxt.setEditable(false);
		billtxt.setBounds(250,565,150,40);
		add(cusbill);
		add(billtxt);
		
		cussource=new JLabel("SOURCE :");
		cussource.setFont(new Font("Serif",Font.BOLD,13));
		cussource.setForeground(Color.BLACK);
		cussource.setBounds(80,470,150,40);
		sourcetxt=new JTextField(30);
		sourcetxt.setEditable(false);
		sourcetxt.setBounds(250,475,150,30);
		add(cussource);
		add(sourcetxt);
		
		cusdest=new JLabel("TOUR PLACE :");
		cusdest.setFont(new Font("Serif",Font.BOLD,13));
		cusdest.setForeground(Color.BLACK);
		cusdest.setBounds(80,520,150,40);
		desttxt=new JTextField(30);
		desttxt.setEditable(false);
		desttxt.setBounds(250,520,150,30);
		add(cusdest);
		add(desttxt);
		
		backbutton=new JButton("BACK");
		backbutton.setBounds(550,550 , 160, 40);
		backbutton.setForeground(Color.BLACK);
		add(backbutton);
		setVisible(true);
		backbutton.addActionListener(this);
	}
	public static void main(String[] args)
	{
		new CustomerDetails();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==backbutton)
		{
			try {
				new AdminPage();
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			setVisible(false);
		}
	}

}
