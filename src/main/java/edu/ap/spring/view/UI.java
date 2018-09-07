package edu.ap.spring.view;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class UI implements InitializingBean {

	@Autowired
	private EventHandler handler;

	private JFrame frame;
	private JPanel panel;
	private JTextField txtQuestion;
	private JButton btnGetAnswer;
	private JLabel lblAnswer;

	public UI() {
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}
}
