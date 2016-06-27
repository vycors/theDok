package the;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import gui.*;
public class Login01 {
	CJFrame f;
	JTextField pw;
	JButton lgB;
	JLabel lgL;
	public Login01() {
		f = new CJFrame("로그인");
		f.setLayout(new GridLayout(2,1));
//		pw = new JTextField();
//		lgB = new JButton("로그인");
//		lgL = new JLabel("로  그  인");
//		JPanel pi1 = new JPanel();
//		f.add(pi1);
		upPanel();
		downP();

		
		f.setSize(700,600);
		f.setVisible(true);
		
	}
	
	public void upPanel(){
		lgL = new JLabel("로  그  인");
		Font font = new Font("ㅁㄴㅇㄹ",Font.PLAIN,100);
		lgL.setFont(font);
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add(lgL,"Center");
		
		JPanel pi1 = new JPanel();
		pi1.setPreferredSize(new Dimension(120,30));
		JPanel pi2 = new JPanel();
		pi2.setPreferredSize(new Dimension(150,30));
		JPanel pi3 = new JPanel();
		pi3.setPreferredSize(new Dimension(10,10));
		JPanel pi4 = new JPanel();
		pi4.setPreferredSize(new Dimension(10,10));
		
		JPanel sumP = new JPanel(new BorderLayout());
		sumP.add(p1,"Center");
		sumP.add(pi1,"West");
		sumP.add(pi2,"East");
		sumP.add(pi3,"North");
		sumP.add(pi4,"South");
		
		JPanel upP = new JPanel(new BorderLayout());
		upP.add(sumP);

		
		f.add(upP);
		
	}
	public void downP(){
		pw = new JTextField();
		lgB = new JButton("로그인");
		
		JPanel smP = new JPanel(new GridLayout(2,1));
		
		
	}
	
	public static void main(String[] args) {
		new Login01();
	}
}
