package com.aa;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Shiyan1 extends JFrame implements ActionListener {
	JTextField tname,tpwd;
	JButton sd,sdf ;
	Container cont;
	Label lab1;
	public Shiyan1() { 
		this.setBounds(300, 200, 250, 350);
		cont=this.getContentPane();
		cont.setLayout(new FlowLayout());
		tname=new JTextField(10);
		tpwd=new JTextField(10);
		cont.add(new Label("�û���"));
		cont.add(tname);
		cont.add(new Label("����"));
		cont.add(tpwd);
		sd=new JButton("��¼");
		sdf=new JButton("����");
		sd.addActionListener(this);
		sdf.addActionListener(this);
		sd.setForeground(Color.blue);
		sd.setLocation(200, 200);
		cont.add(sd);
		cont.add(sdf);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showInputDialog("dd");
		if(e.getSource()==sd) {
			if(tname.getText().trim().equals("lky")  &&tpwd.getText().trim().equals("123")) {
				JOptionPane.showMessageDialog(this, "��¼�ɹ�");
				//lab1.setText("��¼�ɹ�");
			}
			else {	
				JOptionPane.showMessageDialog(this, "��¼ʧ��");
			//lab1.setText("��¼ʧ��");
			
		}
		
	}
		else if(e.getSource()==sdf){
			tname.setText("");
			tpwd.setText("");
		}
	}
}
