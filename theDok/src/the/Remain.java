package the;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import gui.*;

public class Remain extends CJFrame{
	JButton control, time, memo, logout, exit;
	JLabel no1;
	JLabel name1;
	JLabel no1time;
	JPanel back;
//	JPanel room1,room2,room3,room4,room5,room6;
	
	int posXpanSeat,posYpanSeat;
	PanSeat[] pan = new PanSeat[32];
	public Remain() {
		
		makeButton();
		backMap();
		visualMap();
		
		this.setTitle("S.U.M (썸) 독서실 부제: 월급받고 회원하나 꼬셔보자~");
		
		this.setSize(1350,850);
		this.setResizable(false);	//화면 고정..
		this.setVisible(true);
	}
	public void makeButton(){
		
		control = new JButton("회원관리");
		control.setPreferredSize(new Dimension(130,10));
		time = new JButton("이용내역");
		time.setPreferredSize(new Dimension(130,5));
		memo = new JButton("공지사항");
		memo.setPreferredSize(new Dimension(130,5));
		logout = new JButton("로그아웃");
//		logout.setPreferredSize(new Dimension(110,5));
		exit = new JButton("종료");
//		exit.setPreferredSize(new Dimension(110,5));
		
		JPanel p1 = new JPanel(new GridLayout(1,3,50,50));
		p1.add(control);
		p1.add(time);
		p1.add(memo);
		
		JPanel p2 = new JPanel(new GridLayout(1,2,50,50));
		p2.add(logout);
		p2.add(exit);
		
		
		
		JPanel p4 = new JPanel(new BorderLayout());
		p4.add(p1,"West");
		p4.add(p2,"East");
		
		JPanel pi1 = new JPanel();
		pi1.setPreferredSize(new Dimension(50,30));
		JPanel pi2 = new JPanel();
		pi2.setPreferredSize(new Dimension(50,30));
		JPanel pi3 = new JPanel();
		pi3.setPreferredSize(new Dimension(10,10));
		JPanel pi4 = new JPanel();
		pi4.setPreferredSize(new Dimension(10,10));
		
		TitledBorder t1 = new TitledBorder(new LineBorder(Color.black));
		
		JPanel upMenu = new JPanel(new BorderLayout());
		upMenu.add(p4,"Center");
		upMenu.add(pi1,"West");
		upMenu.add(pi2,"East");
		upMenu.add(pi3,"North");
		upMenu.add(pi4,"South");
		upMenu.setBorder(t1);
		
		this.add(upMenu,"North");
	}
	
	public void backMap(){
		
		JPanel groud = new JPanel(new BorderLayout());
		this.add(groud,"Center");
		
		
		
		TitledBorder t1 = new TitledBorder(new LineBorder(Color.red));
		back = new JPanel();
//		back.setBorder(t1);
		JPanel back1 = new JPanel(new GridLayout(2,2));
//		
//		back.add(back1);
//		
		JPanel roomP1 = new JPanel();
		roomP1.setBorder(t1);
		JPanel roomP2 = new JPanel();
		roomP2.setBorder(t1);
		JPanel roomP3 = new JPanel();
		roomP3.setBorder(t1);
		JPanel roomP4 = new JPanel();
		roomP4.setBorder(t1);
//		
		back1.add(roomP1);
		back1.add(roomP2);
		back1.add(roomP3);
		back1.add(roomP4);
		
		JPanel back2 = new JPanel(new BorderLayout());
//		back2.setBackground(new Color(255,0,0,0));
		back2.add(back1,"Center");
		
		JPanel back3 = new JPanel(new BorderLayout());
//		back3.setBackground(new Color(255,0,0,0));
		back3.add(back);
		
		JPanel pi1 = new JPanel();
		pi1.setPreferredSize(new Dimension(50,50));
		JPanel pi2 = new JPanel();
		pi2.setPreferredSize(new Dimension(50,50));
		JPanel pi3 = new JPanel();
		pi3.setPreferredSize(new Dimension(30,50));
		JPanel pi4 = new JPanel();
		pi4.setPreferredSize(new Dimension(30,30));
		
		groud.add(back3,"Center");
		groud.add(pi1,"West");
		groud.add(pi2,"East");
		groud.add(pi3,"North");
		groud.add(pi4,"South");
		
	}
	
	public void visualMap(){

		back.setLayout(null);
//		back.setBackground(new Color(255,0,0,0));
		back.setOpaque(false);
//		back.setOpaque(true);
		back.setBounds(165, 109, 1368, 686);

		for (int seat = 0; seat < 32; seat++) {
		    pan[seat] = new PanSeat(seat);
		    pan[seat].img("on");	//on 이미지
//		    pan[seat].img("wait");	//wait 이미지
		    
		    if (seat % 8 == 0 && seat != 0) {
		        posXpanSeat = 0;
//		        posYpanSeat += 180;
		        posYpanSeat += 150; //세로간격
		        
		        if(seat % 16 == 0 && seat != 0){
		        	posXpanSeat = 0;
		        	posYpanSeat += 50;
		        }
		    }
		    if (seat % 4 == 0 && seat != 0){
		    	posXpanSeat += 50;
		    	if(seat % 8 == 0 && seat != 0) {
		    		posXpanSeat = 0;
		    	}
		    }
		    pan[seat].setBounds(posXpanSeat, posYpanSeat, 200, 200);	//그림크기
//		    posXpanSeat += 195;
		    posXpanSeat += 150; //가로간격
		    back.add(pan[seat]);
		}
		 
		     
//		add(setJLayered(backGround, myStarPanel, imgClock, clockMessage, seat50));
	}
	
	public static void main(String[] args) {
		new Remain();
	}
}
