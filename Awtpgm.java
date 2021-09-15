import java.awt.*;
import java.awt.event.*;
class Awtpgm implements ActionListener
	{
		TextField t1,t2,t3,t4;
		Label l1,l2,l3,l4;
		Button b;
		Frame f;
		Awtpgm()
		{
			f=new Frame();
			f.setLayout(null);
			f.setSize(650,650);
			f.setTitle("Program to find largest of 3 numbers");
			f.setVisible(true);
			l1=new Label("enter 1st number:");
			t1=new TextField("");
			l2=new Label("enter 2nd number:");
			t2=new TextField("");
			l3=new Label("enter 3rd number:");
			t3=new TextField("");
			l4=new Label("Result:");
			t4=new TextField(" ");
			b=new Button("SUBMIT");
			l1.setBounds(50,50,80,30);
			t1.setBounds(200,50,80,30);
			l2.setBounds(50,200,80,30);
			t2.setBounds(200,300,80,30);
			l3.setBounds(50,300,80,30);
			t3.setBounds(200,200,80,30);
			l4.setBounds(50,400,80,30);
			t4.setBounds(200,400,80,30);
			t4.setEnabled(false);
			b.setBounds(350,500,80,30);
			b.addActionListener(this);
			f.addWindowListener(new WindowAdapter ()
			{
				public void addWindowClosing(WindowEvent we){
				System.exit(0);
				}
			}
			);
			f.add(l1);
			f.add(t1);
			f.add(l2);
			f.add(t2);
			f.add(l3);
			f.add(t3);
			f.add(l4);
			f.add(t4);
			f.add(b);
		}
		public void actionPerformed(ActionEvent e)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			int a1,a2,a3;
			a1=Integer.parseInt(s1);
			a2=Integer.parseInt(s2);
			a3=Integer.parseInt(s3);
			if((a1>a2)&&(a1>a3))
				t4.setText(a1+"largest one is");
			else if((a2>a1)&&(a2>a3))
				t4.setText(a2+"largest one is");
			else
				t4.setText(a3+"largest one is");
		}
	public static void main(String args[])
	{
		Awtpgm a1=new Awtpgm();
	}
}

			