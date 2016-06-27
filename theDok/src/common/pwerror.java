package common;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
public class pwerror {
	JFrame f;
	JLabel l,l2;
	JButton b;
	public pwerror() {
		f = new JFrame();
		l = new JLabel("비밀번호를 잘못 입력하셨습니다.");
		l.setFont(new Font("",Font.BOLD,15));
		l.setHorizontalAlignment(JLabel.CENTER);
		b = new JButton("확인");
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(b);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,1));
		p.add(l);
		p.add(p1);
		
		
		
		f.add(p);
		f.setSize(300, 150);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new pwerror();
	}

}
