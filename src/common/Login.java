package common;
import java.awt.*;
import javax.swing.*;
public class Login {
	JFrame f;
	JLabel Login;
	JPasswordField pw;
	JButton b1, b2;
	public Login() {
		f = new JFrame("로그인");
		JLabel logo = new JLabel(new ImageIcon("src/common/Login.jpg"));
		Login = new JLabel("Login");
		Login.setFont(new Font("",Font.BOLD,60));
		Login.setHorizontalAlignment(JLabel.CENTER);
		
		pw = new JPasswordField(13);

		b1 = new JButton("확인");
		b2 = new JButton("취소");
		JLabel pass = new JLabel("PW : ");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(pass);
		p.add(pw);
		p.setBackground(Color.white);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(b1);
		p2.add(b2);
		p2.setBackground(Color.white);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new BorderLayout());
		p3.add("North",logo);
		p3.add(Login);
		p3.setBackground(Color.white);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add("North",p3);
		p1.add("Center",p);
		p1.add("South",p2);
		
		p1.setBorder(BorderFactory.createEmptyBorder(10 , 50 , 50 , 50));
		
		p1.setBackground(Color.WHITE);
		f.add("Center",p1);
		f.setSize(450, 430);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Login();
		
	}

}
