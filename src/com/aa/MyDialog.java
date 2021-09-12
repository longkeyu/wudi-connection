package com.aa;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyDialog extends Dialog {
	JButton btnok;
	JTextField tf;

public MyDialog(JFrame frm,String title,boolean mode) {
	super(frm,title,mode);
	this.setBounds(300, 200, 300, 300);
	this.setLayout(new FlowLayout());
	this.setBackground(Color.black);
	btnok=new JButton("È·¶¨");
	tf=new JTextField(120);
	
	btnok.setEnabled(true);
	this.add(tf);
	this.add(btnok);

	
}


}
