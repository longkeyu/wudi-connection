package com.aa;

import javax.swing.JFrame;

public class MyFrame {
	public static void main(String args[]) {
		MyFrame1 my1=new MyFrame1();
		my1.fn();
	}

}
class MyFrame1{
	public void fn() {
		 JFrame frm=new JFrame("�̳з�ʽ������");
		 frm.setSize(300,400);
		 frm.setLocation(300,300);
		 frm.setVisible(true);
	}
}