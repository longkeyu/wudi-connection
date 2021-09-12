package com.aa;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe3 implements ActionListener {
	public void fn() {
		JFrame frm =new JFrame("转换");
		frm.setBounds(300,300,200,200);
		frm.setTitle("啊哈");
		Container conn=frm.getContentPane();
		conn.setBackground(new Color(200,200,255));
		conn.setLayout(new GridLayout(3,2,5,5));
		JButton btnok= new JButton("确定");
		

}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
}