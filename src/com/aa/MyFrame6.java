package com.aa;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame6 implements ActionListener{
	public static void main(String args[]) {
		MyFrame6 c=new MyFrame6();
		c.fn();
	}
	JButton btn;
	JTextField tf;
	JTextArea ta;
	public void fn() {
		JFrame frm=new JFrame();
		frm.setBounds(300,300,200,200);
		frm.setBackground(Color.white);
		Container cnn=frm.getContentPane();
		cnn.setLayout(new FlowLayout());
		btn=new JButton("INC");
		tf=new JTextField("0");
		ta=new JTextArea(4,10);
		tf.setColumns(5);
		cnn.add(btn);
		cnn.add(tf);
		btn.addActionListener(this);
		tf.setEditable(false);//不可编辑
		frm.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource()==btn) {
			String a=tf.getText();
			int b=Integer.parseInt(a);
			b=b+1;
			String c=Int0.toString(b);
			tf.setText(c);
		}
	}
}