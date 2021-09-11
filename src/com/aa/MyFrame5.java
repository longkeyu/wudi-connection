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
		frm1= new Frame("主窗口");
		frm1.setBounds(300,300,200,200);
		frm1.setBackground(Color.blue);
		frm1.addWindowListener(this);
		frm1.setVisible(true);
		
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}
}
