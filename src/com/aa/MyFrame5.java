																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		package com.aa;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame5 implements WindowListener{
	public static void main(String args[]) {
		MyFrame5 my1=new MyFrame5();
		my1.fn();
	}
	public  void fn(){
		Frame frm1;
		frm1= new Frame("������");
		frm1.setBounds(300,300,200,200);
		frm1.setBackground(Color.blue);
		frm1.addWindowListener(this);
		frm1.setVisible(true);
		
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}
}
