import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;
public class Packages extends JFrame implements ActionListener
{
	JPanel jp;
	JButton continuebutton,goldbutton,silverbutton,platinum;
	JLabel packageimage;
	//private static final long serialVersionUID = 1L;
	public Packages()
 {
	 setTitle("PACKAGE DETAILS");
	 setSize(800,600);
	 setLayout(null);
	 getContentPane().setBackground(Color.ORANGE);
	 JLabel packagedis=new JLabel("PACKAGE DISCRIPTION:");
	 packagedis.setBounds(40,90,270,25);
	 packagedis.setFont(new Font("Serif",Font.BOLD,20));
	 packagedis.setForeground(Color.BLUE);
	 
	 jp=new JPanel();
	 packageimage=new JLabel();
     packageimage.setIcon(new ImageIcon("goldnew.png"));
	 packageimage.setBounds(40,130,400,300);
//	 packageimage.setBackground(Color.LIGHT_GRAY);
	 jp.add(packageimage);
	 jp.setBounds(40,130,400,300);
	 add(jp);
	 
	 JLabel heading=new JLabel("SELECT YOUR PACKAGE");
	 heading.setBounds(20,10,520,100);
	 heading.setForeground(Color.RED);
	 heading.setFont(new Font("Serif",Font.BOLD,40));
	 heading.setBackground(Color.yellow);
	 
	 goldbutton=new JButton("GOLD");
	 goldbutton.setBounds(550, 190, 120, 30);
	 silverbutton=new JButton("SILVER");
	 silverbutton.setBounds(550,260,120,30);
	 JButton platinumbutton=new JButton("PLATINUM");
	 platinumbutton.setBounds(550, 330, 120, 30);
	 JPanel packagepanel=new JPanel();
	 ButtonGroup bg=new ButtonGroup();
	 bg.add(goldbutton);
	 bg.add(silverbutton);
	 bg.add(platinumbutton);
	 
	 add(goldbutton);
	 add(silverbutton);
	 add(platinumbutton);
	 continuebutton=new JButton("CONTINUE");
	 continuebutton.setBounds(260, 460, 100,30 );
	 JButton backb=new JButton("BACK");
	 backb.setBounds(120,460,100,30);
	 
	 add(packagedis);
	 add(packageimage);
	 add(heading);
	 add(packagepanel);
	 add(continuebutton);
	 add(backb);
	 setVisible(true);
	 continuebutton.addActionListener(this);
	 backb.addActionListener(this);
 }
 public static void main(String[] args)
 {
	 new Packages();
	 
 }
 @Override
	public void actionPerformed(ActionEvent e) 
 	{
	// TODO Auto-generated method stub
	 if(e.getSource()==continuebutton)
	 	{
	 		try {
				new JourneyDetails();
			} 
	 		catch (ClassNotFoundException | SQLException e1) 
	 		{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		setVisible(false);
	 	}
 	}
}
