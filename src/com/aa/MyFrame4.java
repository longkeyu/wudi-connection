package com.aa;

import java.awt.Container;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrame4 implements ActionListener {
	public static void main(String args[]) {
		MyFrame4 my1=new MyFrame4();
		my1.fn();
	}

	JFrame frm;
	JButton btnok,btnreset;
	JTextField tf;
	JPasswordField pwd;
	
	public void fn(){
		frm=new JFrame("转换");
		frm.setBounds(300, 300, 150, 200);
		Container conn=frm.getContentPane();
		conn.setLayout(new FlowLayout());
		btnok=new JButton("显示");
		btnreset=new JButton("重置");
		tf=new JTextField(10);
		pwd=new JPasswordField(10);
		Font font=new Font("宋体",Font.BOLD,20);
		pwd.setFont(font);
		tf.setFont(font);
		tf.setEnabled(false);
		conn.add(pwd);
		conn.add(btnok);
		conn.add(btnreset);
		conn.add(tf);
		btnok.addActionListener(this);
		btnreset.addActionListener(this);
		frm.setResizable(false);
		frm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnok){
			String str=pwd.getText();
			tf.setText(str);
		}
		else if(e.getSource()==btnreset){
			pwd.setText("");
			tf.setText("");
		}
	}

}
