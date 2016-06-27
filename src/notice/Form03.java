package notice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableCellRenderer;
public class Form03 {
	JFrame f;
	JTable t1;
	JButton exB, chB;
	JTextField exF, chF;
	
	DefaultTableModel model;
	public Form03() {
		f = new JFrame("회원확인용 공지사항");
		String[] table = {"No.","내용","작성일시"};
		model = new DefaultTableModel(table,0);
		t1 = new JTable(model);
		JScrollPane sp = new JScrollPane(t1);
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		t1.getColumn("No.").setPreferredWidth(10);
		t1.getColumn("No.").setCellRenderer(celAlignCenter);
		t1.getColumn("내용").setPreferredWidth(600);
		t1.getColumn("내용").setCellRenderer(celAlignCenter);
		t1.getColumn("작성일시").setPreferredWidth(100);
		t1.getColumn("작성일시").setCellRenderer(celAlignCenter);
		
		exF = new JTextField(10);
		chF = new JTextField(10);
		
		exB = new JButton("퇴실");
		chB = new JButton("채팅");
		
		JLabel ex = new JLabel("입실시간");
		JLabel ch = new JLabel("이용시간");
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(ex);
		p.add(exF);
		p.add(ch);
		p.add(chF);
		
		JLabel ab = new JLabel("             ");
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(exB);
		p2.add(ab);
		p2.add(chB);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(2,1));
		p3.add(p);
		p3.add(p2);
		
		JPanel p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		p4.add("Center",sp);
		p4.add("South",p3);
		
		p4.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
		f.add(p4);
		f.setSize(900, 650);
		f.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new Form03();
	}
}