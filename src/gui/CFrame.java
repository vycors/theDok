package gui;
/*
 * 2�ϵ��� ������ ���鼭 ������ ���α׷��� ������� �ʾƼ� ����� �ߴ�.
 * �� ������ x ���߸� ������ ���α׷��� ����Ǿ�� �ϴ� ���� �����ڰ�
 * ���� ������ �߱� ������
 * �� ����� ������ ������ ������� �ʾұ� ������ ...
 * 
 * ���� ����� Ŭ������ �̹� API�� �����ϴ� Frame Ŭ������
 * x ���߸� ������ ����Ǵ� ����� �߰��� ������ Ŭ������ ���� �����̴�.
 */
import	java.awt.*;
import	java.awt.event.*;
public class CFrame extends Frame {
	// ������ �Լ��� �������� ���� Ŭ������ ����ڰ� new ��Ű�� �����
	// ����� �ִ� ���̴�.
	public CFrame() {
		this("");
	} // end Constructor
	// �������� ���鶧 ������ �� �� �����Ƿ� ���� ������ ���� �ֵ��� ����.
	public CFrame(String title) {
		super(title);	// �ƹ��� Ŭ������ �����ڿ��� ��Ź�ϸ� ������ ���ٰ��̴�.
		// + ������ �۾��� ����.
		// x ���߸� ������ ���α׷��� ����Ǵ� ����� ��������.
		this.addWindowListener(new WindowAdapter() {
			// ���� Ŭ����(���� Ŭ����)�� �̿��Ͽ� ó��
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			} // end Method
		});
	} // end Constructor
} // end class
