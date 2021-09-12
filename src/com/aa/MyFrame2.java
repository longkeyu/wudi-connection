package com.aa;

import 
java.awt.*;


import javax.swing.*;

public class MyFrame2 {
	public static void main(String args[]) {
	MyFram2  my2=new MyFram2();
	my2.fn2();
	}

}
class MyFram2 extends JFrame{
	public void fn2(){
		this.setTitle("啊哈");
		this.setBounds(300,200,200,200);
		Container conn=this.getContentPane();
		conn.setBackground(new Color(200,200,255));
		conn.setLayout(new GridLayout(3,2,5,5));
		JButton btn1=new JButton("确定");
		JButton btn2=new JButton("取消");
		JTextField tf1=new JTextField(10);
		JTextField tf2=new JTextField(10);
		JLabel lab1=new JLabel("用户名:");
		JLabel lab2=new JLabel("密    码:");
		//JPane1 pan1 =new JPane1();
		//JPane1 pan2()=new JPane1();
		conn.add(lab1);
		conn.add(tf1);
		conn.add(lab2);
		
		conn.add(tf2);
		conn.add(btn1);
		conn.add(btn2);
		//this.setResizable(false);
		this.setVisible(true);
	}
}