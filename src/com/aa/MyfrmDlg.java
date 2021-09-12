
package com.aa;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	public class  MyfrmDlg implements ActionListener{
	
	JFrame frm;
	Container cnn;
	JButton btn;
	JTextField tf;
	JButton btn1,btn2,btn3,btn4;
	public  MyfrmDlg() {
		JFrame frm=new JFrame("撇之辣");
		frm.setBounds(300,300,200,200);
		frm.setBackground(Color.white);
		Container cnn=frm.getContentPane();
		cnn.setLayout(new FlowLayout());
		
		
		
		btn1=new JButton("这可能是舒服额");
		btn2=new JButton("这个对话框没得任何作用");
		btn3=new JButton("这是颜色的东西但是没得效果");
		btn4=new JButton("这是关闭系统的东西");
		
		
		cnn.add(btn1);
		cnn.add(btn2);
		cnn.add(btn3);
		cnn.add(btn4);
		
		
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frm.setVisible(true);
		
		
		
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			MyDialog my=new MyDialog(frm,"舒服了",false);
			my.show();
		}
		if(e.getSource()==btn4) {
			
			int n=JOptionPane.showConfirmDialog(frm,"你确实关闭"," 关闭  ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
			if (n==JOptionPane.OK_CANCEL_OPTION)
			System.exit(0);
			
		}
		if(e.getSource()==btn3) {
			Color col=JColorChooser.showDialog(frm, "就是这颜色", Color.red);
			cnn.setBackground(col);
		}
	}
}
