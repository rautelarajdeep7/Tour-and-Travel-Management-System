import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Reg extends JFrame implements ActionListener
{
	JButton save;
	Connection con;
	Statement statement;
	ResultSet rs;
	JTextField fnametext,lnametext,contacttext,housetext,streettext,citytext,pincodetext,countrytext,emailtext;
	JComboBox gendercombobox,statetext;
	Reg() throws ClassNotFoundException, SQLException
	{
		getContentPane().setBackground(Color.orange);
		setTitle("Registration");
		setSize(930,650);
		setLayout(null);
		setResizable(false);
		
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","golender");
		statement=con.createStatement();
		rs=statement.executeQuery("select * from registration");
		
		JLabel reg=new JLabel("REGISRATION :");
		reg.setFont(new Font("Serif", Font.BOLD,25));
		reg.setForeground(Color.RED);
		reg.setBounds(50,20,200,50);
		
		JLabel fname=new JLabel("FIRST NAME:");
		fname.setFont(new Font("Serif", Font.BOLD,13));
		fname.setForeground(Color.BLACK);
		fname.setBounds(80,90,80,40);
		fnametext=new JTextField(20);
		fnametext.setBounds(200,95,200,30);
		
		JLabel lname=new JLabel("LAST NAME:");
		lname.setFont(new Font("Serif", Font.BOLD,13));
		lname.setForeground(Color.BLACK);
		lname.setBounds(80, 140, 80, 40);
		lnametext=new JTextField(20);
		lnametext.setBounds(200,145,200,30);
		
		JLabel gender=new JLabel("GENDER:");
		gender.setFont(new Font("Serif", Font.BOLD,13));
		gender.setForeground(Color.BLACK);
		gender.setBounds(80,190,80,40);
		String gen[]={"MALE","FEMALE"};
		gendercombobox=new JComboBox(gen);
		gendercombobox.setBounds(200,195,100,25);
		
		JLabel contactno=new JLabel("CONTACT NO:");
		contactno.setFont(new Font("Serif",Font.BOLD,13));
		contactno.setForeground(Color.BLACK);
		contactno.setBounds(80, 240, 180, 40);
		contacttext=new JTextField(10);
		contacttext.setBounds(200,245,200,30);
		add(contacttext);
		
		JLabel address=new JLabel("ADDRESS DETAILS:");
		address.setFont(new Font("Serif", Font.BOLD,14));
		address.setForeground(Color.BLUE);
		address.setBounds(80, 290, 160, 40);
		
		JLabel houseno=new JLabel("HOUSE NO:");
		houseno.setFont(new Font("Serif", Font.BOLD,13));
		houseno.setForeground(Color.BLACK);
		houseno.setBounds(80,330,80,40);
		housetext=new JTextField(10);
		housetext.setBounds(200,335,200,30);
		add(housetext);
		
		JLabel street=new JLabel("STREET NO:");
		street.setFont(new Font("Serif", Font.BOLD,13));
		street.setForeground(Color.BLACK);
		street.setBounds(80,370,80,40);
		streettext=new JTextField(20);
		streettext.setBounds(200,375,200,30);
		
		JLabel city=new JLabel("CITY:");
		city.setFont(new Font("Serif", Font.BOLD,13));
		city.setForeground(Color.BLACK);
		city.setBounds(80,410,80,40);
		citytext=new JTextField(20);
		citytext.setBounds(200,415,200,30);
	
		JLabel state=new JLabel("STATE:");
		state.setFont(new Font("Serif", Font.BOLD,13));
		state.setForeground(Color.BLACK);
		state.setBounds(80,450,80,40);
		String statelist[]={" ","Andhra Pradesh","Arunachal Pradesh","Assam,Bihar","Chhattisgarh","Goa,Gujarat",
		"Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh",
		"Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu",
		"Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
		statetext=new JComboBox(statelist);
		statetext.setBounds(200,455,200,30);
	
		JLabel pincode=new JLabel("POSTAL CODE:");
		pincode.setFont(new Font("Serif", Font.BOLD,13));
		pincode.setForeground(Color.BLACK);
		pincode.setBounds(80,490,130,40);
		pincodetext=new JTextField(20);
		pincodetext.setBounds(200,495,200,30);
	
		JLabel country=new JLabel("COUNTRY:");
		country.setFont(new Font("Serif", Font.BOLD,13));
		country.setForeground(Color.BLACK);
		country.setBounds(80,530,100,40);
		countrytext=new JTextField(20);
		countrytext.setBounds(200,535,200,30);
		
		JLabel email=new JLabel("ENTER EMAIL ADDRESS:");
		email.setFont(new Font("Serif", Font.BOLD,13));
		email.setForeground(Color.BLACK);
		email.setBounds(450,90,150,40);
		emailtext=new JTextField(20);
		emailtext.setBounds(620,95,250,30);
		
		save=new JButton("SAVE & CONTINUE");
		save.setBounds(540, 380 , 180, 50);
		
		add(reg);
		add(fname);
		add(fnametext);
		add(lname);
		add(lnametext);
		add(gender);
		add(gendercombobox);
		add(contactno);

		add(address);
		add(houseno);
		add(street);
		add(streettext);
		add(city);
		add(citytext);
		add(state);
		add(statetext);
		add(pincode);
		add(pincodetext);
		add(country);
		add(countrytext);
		add(email);
		add(emailtext);
		add(save);
		
		setVisible(true);
		save.addActionListener(this);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		new Reg();
	}
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
		// TODO Auto-generated method stub
		if(e.getSource()==save)
		{
			new Packages();
			setVisible(false);
		}
		if(e.getActionCommand().equals("SAVE & CONTINUE"))
		{
		try
		{
		statement2.executeUpdate("insert into registration(fname,lname,gender,contactno,houseno,streetno,city,state,postalcode,country,emailid) values(\""+fnametext.getText()+"\", \""+
		lnametext.getText()+"\", \""+gendercombobox.getSelectedItem()+"\" , \""+contacttext.getText()+"\",\""+housetext.getText()+"\",\""+streettext.getText()+"\",\""+citytext.getText()+"\",\""+statetext.getSelectedItem()+"\",\""+pincodetext.getText()+"\",\""+countrytext.getText()+"\",\""+emailtext.getText()+"\" )" );
		}
		catch (SQLException e1)
		{
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		}
	}
}
