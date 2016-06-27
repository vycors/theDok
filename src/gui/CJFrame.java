package gui;
// JFrame을 사용할때마다 계속해서 setDefalutCloseOperation()를
// 사용해서 종료 처리를 해야한다.
// 이 기능을 추가한 나만의 클래스를 만들어서 사용하자.
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