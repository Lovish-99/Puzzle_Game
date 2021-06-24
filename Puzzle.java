import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MyPuzzle extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JButton j1,j2,j3,j4,j5,j6,j7,j8,j9,b1,b2,b3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1;
	boolean b=false;
	int count=0;
	String s="",s2="";
	public MyPuzzle()
	{
		setLayout(new GridLayout(1,2));

		p1=new JPanel();
		p2=new JPanel();

		p1.setLayout(new GridLayout(3,3));
		p2.setLayout(null);

		Icon i1=new ImageIcon("1.jpg");
		Icon i2=new ImageIcon("4.jpg");
		Icon i3=new ImageIcon("6.jpg");
		Icon i4=new ImageIcon("9.jpg");
		Icon i5=new ImageIcon("2.jpg");
		Icon i6=new ImageIcon("5.jpg");
		Icon i7=new ImageIcon("3.jpg");
		Icon i8=new ImageIcon("8.jpg");
		Icon i9=new ImageIcon("7.jpg");
		j1=new JButton(i1);
		j2=new JButton(i2);
		j3=new JButton(i3);
		j4=new JButton(i4);
		j5=new JButton(i5);
		j6=new JButton(i6);
		j7=new JButton(i7);
		j8=new JButton(i8);
		j9=new JButton(i9);
		l1=new JLabel("<HTML><U>PUZZLE GAME</U></HTML>");
		l1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l2=new JLabel("Rules of the game~");
		l3=new JLabel("~ You have to click on the image button to move it.");
		l4=new JLabel("~ On clicking its neighbour image will interchange it.");
		l5=new JLabel("~ After solving, type name of picture in the provided textfield.");
		l6=new JLabel("What you see in picture?");
		l7=new JLabel("~ To start the game click the 'Lets Start' button");
		l8=new JLabel("~ After all this,to end the game click the 'Lets Finish' button");
		t1=new JTextField(16);
		b1=new JButton("Lets Start");
		b2=new JButton("Lets Finish");
		b3=new JButton();

		l1.setFont(new Font("Verdana", Font.PLAIN, 20));
		l2.setFont(new Font("Verdana", Font.PLAIN, 18));

		l1.setBounds(120,20,200,30);
		l2.setBounds(10,60,300,20);
		l7.setBounds(10,90,380,20);
		l3.setBounds(10,110,380,20);
		l4.setBounds(10,130,380,20);
		l5.setBounds(10,150,380,20);
		l8.setBounds(10,170,3800,20);
		l6.setBounds(10,200,150,20);
		t1.setBounds(160,200,120,20);
		b1.setBounds(30,240,150,50);
		b2.setBounds(190,240,150,50);


		p1.add(j1);
		p1.add(j2);
		p1.add(j3);
		p1.add(j4);
		p1.add(j5);
		p1.add(j6);
		p1.add(j7);
		p1.add(j8);
		p1.add(j9);
		p2.add(l1);
		p2.add(l2);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(t1);
		p2.add(b1);
		p2.add(b2);
		add(p1);
		add(p2);

		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);
		j5.addActionListener(this);
		j6.addActionListener(this);
		j7.addActionListener(this);
		j8.addActionListener(this);
		j9.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if((JButton)e.getSource()==b1)
		{
			count=1;
			b=true;
		}
		if(b==true)
		{
			if((JButton)e.getSource()==j1)
			{
				Icon s=j1.getIcon();
				j1.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j2)
			{
				Icon s=j2.getIcon();
				j2.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j3)
			{
				Icon s=j3.getIcon();
				j3.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j4)
			{
				Icon s=j4.getIcon();
				j4.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j5)
			{
				Icon s=j5.getIcon();
				j5.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j6)
			{
				Icon s=j6.getIcon();
				j6.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j7)
			{
				Icon s=j7.getIcon();
				j7.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
			else if((JButton)e.getSource()==j8)
			{
				Icon s=j8.getIcon();
				j8.setIcon(b3.getIcon());
				b3.setIcon(s);
			}
		}
		if((JButton)e.getSource()==b2)
		{
			s=t1.getText();
			if(count==1)
			{
				if(s.equals("car")||s.equals("Car"))
				{
					JOptionPane.showMessageDialog(this,"You Won!!");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"You Lost!!");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Solve the puzzle!");
			}
		}

	}
}
class Puzzle
{
	public static void main(String[] s)
	{
		MyPuzzle p=new MyPuzzle();
		p.setSize(760,400);
		p.setVisible(true);
	}
}