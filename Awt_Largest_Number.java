import java.awt.*;
import java.awt.event.*;
class Awt_Largest_Number implements ActionListener
{
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4,l5;
	Frame f;
	Awt_Largest_Number()
	{
		f=new Frame();
		f.setSize(600,600);
		f.setLayout(null);
		f.setTitle("Program to find largest of 3 numbers ! ! ! ");
		f.setVisible(true);
		l1=new Label("Enter first number : ");
		t1=new TextField("");
		l2=new Label("Enter second number : ");
		t2=new TextField("");
		l3=new Label("Enter third number : ");
		t3=new TextField("");
		l4=new Label("LARGEST NUMBER : ");
		t4=new TextField("");
		l5=new Label("");
		Button b=new Button("L A R G E S T");
		l1.setBounds(50,50,80,30);
		t1.setBounds(200,50,80,30);
		l2.setBounds(50,200,80,30);
		t2.setBounds(200,200,80,30);
		l3.setBounds(50,300,80,30);
		t3.setBounds(200,300,80,30);
		l4.setBounds(50,400,80,30);
		t4.setBounds(200,400,80,30);
		l4.setEnabled(false);
		b.setBounds(350,500,80,30);
		b.addActionListener(this);
		f.addWindowListener(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(b);
	}
	public void actionPerformed (ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		int a1,a2,a3;
		a1=Integer.parseInt(s1);
		a2=Integer.parseInt(s2);
		a3=Integer.parseInt(s3);
		if(a1==a2 && a2==a3)
			t4.setText(Integer.toString(a1));		
		else if(a1>a2 && a1>a3)
			t4.setText(Integer.toString(a1));
		else if(a2>a1 && a2>a3)
			t4.setText(Integer.toString(a2));				
		else
			t4.setText(Integer.toString(a3));
	}
	public static void main(String args[])
	{
		Awt_Largest_Number aln=new Awt_Largest_Number();
	}
}