import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
public class LoginPage extends JFrame implements ActionListener
{
	JTextField emailtext;
	JPasswordField passtext;
	JButton cancel,ok;
	public LoginPage() 
    {
		getContentPane().setBackground(Color.orange);
		//windowSize
		setTitle("LOG IN");
		setSize(630,400);
		setLayout(null);
		setResizable(false);
		
		JLabel emaillabel,passlabel,userloginlabel,loginasadmin;
		JButton ok,cancel,home,contactus,signup;
		JCheckBox loginadmin;
		
		//first panel components
		home=new JButton("HOME");
		home.setBounds(30,40,100,20);
		userloginlabel=new JLabel("LOGIN");
		userloginlabel.setFont(new Font("Serif", Font.BOLD, 20));
		userloginlabel.setForeground(Color.RED);
		userloginlabel.setBounds(350,70,150,100);
		
		//second panel components
		emaillabel=new JLabel("Enter Email Id:");
		emaillabel.setFont(new Font("Serif", Font.BOLD, 16));
		emaillabel.setForeground(Color.blue);
		emaillabel.setBounds(250,150,120,40);
		emailtext=new JTextField(20);
		emailtext.setBounds(380,160,180,25);
		passlabel=new JLabel("Enter Password:");
		passlabel.setFont(new Font("Serif", Font.BOLD, 16));
		passlabel.setForeground(Color.blue);
		passlabel.setBounds(250,200,120,40);
		passtext=new JPasswordField(20);
		passtext.setEchoChar('*');
		passtext.setBounds(380,210,180,25);
		
		//third panel components
		ok=new JButton("SIGN IN");
		ok.setBounds(430,270,80,20);
		cancel=new JButton("CANCEL");
		cancel.setBounds(330,270,80,20);
		
		add(home);
		add(emaillabel);
		add(emailtext);
		add(passlabel);
		add(passtext);
		add(userloginlabel);
		add(cancel);
		add(ok);
		setVisible(true);
		ok.addActionListener(this);
		cancel.addActionListener(this);
 }
	public static void main(String args[])
	{
		new LoginPage();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String u,v;
		u=emailtext.getText();
		v=passtext.getText();
	
	if((u.equals("Rajdeep")||u.equals("RAJDEEP")||u.equals("rajdeep"))&&(v.equals("qwerty")))
		{
			JOptionPane.showMessageDialog(this, "you are successfully login");
			try {
				AdminPage admin=new AdminPage();
			} catch (ClassNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			setVisible(false);
		}
	else if((u.equals(""))&&(v.equals("")))
		{
			JOptionPane.showMessageDialog(this, "please enter username and password!!!");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "username or password incorrect !! try again");
		}
	}
}

    