import java.awt.*;
import javax.swing.*;
class AB extends Canvas {
	public void paint(Graphics g){
		g.drawOval(40,50,200,200);
		g.drawOval(90,90,20,20);
		g.drawOval(165,90,20,20);
		g.drawLine(135,120,135,160);
		g.drawArc(90,160,100,60,0,-180);
	}
	public static void main(String args[]){
		AB a = new AB();
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.add(a);
		f.setVisible(true);
	}
}
