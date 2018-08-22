import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Bill extends JFrame 
{
	public Bill()
	{ 
	  setTitle("PAYBILL");
	  setSize(800,600);
	  JLabel Bnkname=new JLabel("BANK NAME :");
		 Bnkname.setBounds(250,120,110,20);
		 JLabel heading=new JLabel("FILL BANK DETAILS");
		 heading.setBounds(250,10,350,100);
		 heading.setForeground(Color.RED);
		 getContentPane().setBackground(Color.ORANGE);
		 heading.setFont(new Font("Serif",Font.BOLD,30));
	  String Bankname[]={"State Bank of India","Punjab National Bank","ICCI","Axis Bank","Bank of India"};
		 JComboBox<?> bl=new JComboBox<Object>(Bankname);
		 bl.setBounds(330,120,150,20);
		 JTextArea name=new JTextArea();
		 name.setBounds(330,170,150,20);
		 JLabel ano=new JLabel("ACCOUNT HOLDER NAME :");
		 ano.setBounds(175,170,150,20);
		 JTextArea cnol=new JTextArea("748571625874");
		 cnol.setBounds(330,220,120,20);
         JLabel cno=new JLabel("   CARD NO :");
		 cno.setBounds(250,220,110,20);
		 JTextArea validl=new JTextArea("12/21");
		 validl.setBounds(330,270,90,20);
		 JLabel vu=new JLabel("VALID UPTO :");
		 vu.setBounds(240,270,110,20);
		 JTextArea cvvl=new JTextArea("123");
		 cvvl.setBounds(330,320,50,20);
		 JLabel cvv=new JLabel(" CVV CODE :");
		 cvv.setBounds(245,320,110,20);
		 JTextArea atml=new JTextArea("4321");
		 atml.setBounds(330,370,50,20);
		 JLabel apin=new JLabel(" ATM PIN :");
		 apin.setBounds(255,370,110,20);
		 JTextArea tol=new JTextArea("20000");
		 tol.setBounds(330,420,70,20);
		 JLabel tot=new JLabel("TOTAL BILL :");
		 tot.setBounds(240,420,110,20);
		 JButton pay=new JButton("SUBMIT");
		 pay.setBounds(280,460,90,20);
		 JButton rect=new JButton("RECEIPT");
		 rect.setBounds(500,460,90,20);
      add(heading);
	  add(Bnkname);
	  add(bl);
	  add(ano);
	  add(cno);
	  add(vu);
	  add(cvv);
	  add(apin);
	  add(tot);
	  add(name);
	  add(cnol);
	  add(validl);
	  add(cvvl);
	  add(atml);
	  add(apin);
	  add(tol);
	  add(pay);
	  add(rect);
	  setLayout(null);
	  setVisible(true);
		
		
	}
public static void main(String[] abc)
{
	new Bill();
	
}

}
