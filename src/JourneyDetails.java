import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.*;
public class JourneyDetails extends JFrame implements ActionListener
{
	JButton pay,submit;
	JLabel Days,custidlbl;
	JTextField packagenametxt,tdate,ttime,amounttxt,custidtxt;
	JComboBox destbox,sourcebox,personno,daysbox;
	Connection con;
	Statement statement;
	ResultSet rs;
	JourneyDetails() throws ClassNotFoundException, SQLException
	{
		setTitle("HOME");
		 setSize(750,550);
		 setLayout(null);
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","golender");
		 statement=con.createStatement();
		 rs=statement.executeQuery("select * from journeydetails");
			
		 JLabel heading=new JLabel("FILL JOURNEY DETAILS");
		 heading.setBounds(170,10,400,100);
		 heading.setForeground(Color.RED);
		 heading.setFont(new Font("Serif",Font.BOLD,30));
		 
		 custidlbl=new JLabel("CUSTOMER ID :");
		 custidlbl.setBounds(20,110,110,20);
		 custidtxt=new JTextField("1101");
		 custidtxt.setBounds(110,110,100,20);
		 custidtxt.setEditable(false);
		 
		 JLabel Nsrc=new JLabel("PICKUP LOCATION :");
		 Nsrc.setBounds(80,250,150,20);
		 getContentPane().setBackground(Color.ORANGE);
		 String source[]={"Lucknow","Delhi","Mumbai","Dehradun","Mohali"};
		 sourcebox=new JComboBox(source);
		 sourcebox.setBounds(200, 250,90,20);
		
		 JLabel Ndes=new JLabel("DESTINATION :");
		 Ndes.setBounds(410,250,150,20);
		 String destination[]={"Shimla","Manali","Joshimath","leh","Nainital"};
		 destbox=new JComboBox(destination);
		 destbox.setBounds(500, 250,90,20);
		 
		 JLabel Nperson=new JLabel("NO OF PERSON :");
		 Nperson.setBounds(250,170,110,20);
		 String person[]={"1","2","3","4","5"};
		 personno=new JComboBox(person);
		 personno.setBounds(350,170,90,20);
		 
		 JLabel packagenamelbl=new JLabel("PACKAGE NAME:");
		 packagenamelbl.setBounds(250,110,110,20);
		 packagenamelbl.setForeground(Color.BLUE);
		 packagenametxt=new JTextField(20);
		 packagenametxt.setBounds(350,110,110,20);
		 packagenametxt.setEditable(false);
	
		
		 JLabel date=new JLabel("JOURNEY DATE:");
		 date.setBounds(90,305,150,20);
		 JLabel time=new JLabel("JOURNEY TIME:");
		 time.setBounds(410,305,150,20);
		 tdate=new JTextField();
		 tdate.setBounds(190,305,70,20);
		 ttime=new JTextField();
		 ttime.setBounds(505,305,50,20);
		
		 Days=new JLabel("DAYS:");
		 Days.setBounds(90,360,100,20);
		 String dayno[]={"1","2","3","4","5","6","7","8","9","10","11"
				 			,"12","13","14","15","16","17","18","19","20","21"};
		 daysbox=new JComboBox(dayno);
		 daysbox.setBounds(190,360,60,20);
		
		 JLabel amountlabel=new JLabel("AMOUNT:");
		 amountlabel.setBounds(410,355,90,20);
		 amounttxt=new JTextField(20);
		 amounttxt.setEditable(false);
		 amounttxt.setBounds(505,355,80,20);
		 
		 submit=new JButton("SUBMIT");
		 submit.setBounds(250,440,80,20);
		 pay=new JButton("PAY BILL");
		 pay.setBounds(390,440,90,20);
		 
		 add(custidlbl);
		 add(custidtxt);
		 add(heading);
		 add(Nperson);
		 add(packagenamelbl);
		 add(packagenametxt);
		 add(Nsrc);
		 add(Ndes);
		 add(submit);
		 add(date);
		 add(pay);
		 add(tdate);
		 add(time);
		 add(ttime);
		 add(amountlabel);
		 add(amounttxt);
		 add(personno);
		 add(sourcebox);
		 add(destbox);
		 add(Days);
		 add(daysbox);
		 setVisible(true);
		 pay.addActionListener(this);
		 submit.addActionListener(this);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		new JourneyDetails();
	}
	@SuppressWarnings("null")
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Statement statement2=null;
		try
		{
		statement2 = con.createStatement();
		}
		catch (SQLException e1)
		{
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		//TODO Auto-generated method stub
		if(e.getSource()==pay)
		{
		JOptionPane.showMessageDialog(this, "BILL HAS BEEN PAYED");
		}
		if(e.getActionCommand().equals("SUBMIT"))
		{
		try
		{
		statement2.executeUpdate("insert into journeydetails(pickup,destination,journeydate,journeytime,days,amount,personnum,packagename) values(\""+sourcebox.getSelectedItem()+"\", \""+
		destbox.getSelectedItem()+"\", \""+tdate.getText()+"\" ,\""+ttime.getText()+"\",\""+daysbox.getSelectedItem()+"\",\""+amounttxt.getText()+"\",\""+personno.getSelectedItem()+"\",\""+packagenametxt.getText()+"\" )" );
		}
		catch (SQLException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	}

}
