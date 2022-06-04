import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener{
	JTextField tf1,tf2,tf3;
	int result;
	A(){
		JLabel l1 = new JLabel("Enter number 1:- ");
		tf1 = new JTextField(20);
		
		JLabel l2 = new JLabel("Enter number 2:- ");
		tf2 = new JTextField(20);
	
		JButton b1 = new JButton("Click to add");
		JButton b2 = new JButton("Click to sub");

		tf3 = new JTextField(20);

		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(tf3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s == "Click to add"){
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			result = a+b;
		}
		else if(s == "Click to sub"){
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			result = a-b;
		}
		tf3.setText(Integer.toString(result));
	}
	
	public static void main(String []args){
		A a = new A();
		a.setSize(10000,10000);
		a.setVisible(true);
	}
}
