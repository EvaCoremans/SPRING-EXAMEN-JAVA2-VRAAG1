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
	private JLabel lblQuestion;

	public UI() {
	}

	//region Access Methods
	public EventHandler getHandler() {
		return handler;
	}

	public void setHandler(EventHandler handler) {
		this.handler = handler;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getTxtQuestion() {
		return txtQuestion;
	}

	public void setTxtQuestion(JTextField txtQuestion) {
		this.txtQuestion = txtQuestion;
	}

	public JButton getBtnGetAnswer() {
		return btnGetAnswer;
	}

	public void setBtnGetAnswer(JButton btnGetAnswer) {
		this.btnGetAnswer = btnGetAnswer;
	}

	public JLabel getLblAnswer() {
		return lblAnswer;
	}

	public void setLblAnswer(JLabel lblAnswer) {
		this.lblAnswer = lblAnswer;
	}

	public JLabel getLblQuestion() {
		return lblQuestion;
	}

	public void setLblQuestion(JLabel lblQuestion) {
		this.lblQuestion = lblQuestion;
	}
	//endregion

	public void setUI(){
		//initialize all components
		frame = new JFrame("Eightball");
		panel = new JPanel();
		txtQuestion = new JTextField(15);
		btnGetAnswer = new JButton();
		lblAnswer = new JLabel();
		lblQuestion = new JLabel();

		//set component properties
		frame.setLayout(new GridLayout(0, 2));
		frame.setContentPane(panel);
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel.add(txtQuestion);
		panel.add(btnGetAnswer);
		panel.add(lblQuestion);
		panel.add(lblAnswer);

		btnGetAnswer.setText("Generate Answer");
		btnGetAnswer.addActionListener(handler::generateEightballAnswer);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}
}
