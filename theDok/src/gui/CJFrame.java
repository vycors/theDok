package gui;
// JFrame�� ����Ҷ����� ����ؼ� setDefalutCloseOperation()��
// ����ؼ� ���� ó���� �ؾ��Ѵ�.
// �� ����� �߰��� ������ Ŭ������ ���� �������.
import	javax.swing.*;
public class CJFrame extends JFrame {
	public CJFrame() {
		this("");
	} // end Constructor
	public CJFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // end Method
} // end class