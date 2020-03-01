package com.laohan;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.dao.User_info_DAO;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener{
	JTextField username;
	JTextField userpwd;
	JLabel error;
	JButton button;

	public void init(){
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//放在正中间,首先取屏幕的尺寸
		Toolkit tk=getToolkit();
	    Dimension dim = tk.getScreenSize();
	    
	    int x,y;
	    x=(int)(dim.getWidth()-300)/2;
	    y=(int)(dim.getHeight()-300)/2;
	    
	    setLocation(x,y);
	    
		
		
		
	}

	public LoginFrame() throws HeadlessException {
		super();
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("用户名：");
		label.setBounds(52, 52, 54, 15);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(52, 95, 54, 15);
		getContentPane().add(label_1);
		
		username = new JTextField();
		username.setBounds(106, 49, 106, 21);
		getContentPane().add(username);
		username.setColumns(10);
		
		userpwd = new JTextField();
		userpwd.setBounds(106, 92, 106, 21);
		getContentPane().add(userpwd);
		userpwd.setColumns(10);
		
		
		button = new JButton("登录");
		button.setBounds(95, 143, 93, 23);
		getContentPane().add(button);
		button.addActionListener(this);
		
		
		button.addActionListener(this);
		error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(52, 197, 183, 40);
		getContentPane().add(error);
		// TODO Auto-generated constructor stub
		init();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginFrame lf=new LoginFrame();
		lf.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(User_info_DAO.isUser(username.getText(),userpwd.getText())){
			dispose();
			SuccessFrame sf=new SuccessFrame();
			sf.setVisible(true);
			
		}else{
			error.setText("用户名或密码不正确");
		}

		
	}
	
}
