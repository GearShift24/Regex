package regex.view;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import regex.controller.*;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextField firstField;
	private JTextField lastField;
	private JTextField emailField;
	private JTextField phoneField;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel emailLabel;
	private JLabel phoneLabel;
	private JButton onlyButton;
	
	
	
	public RegexPanel(RegexController baseController){
		
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.firstField = new JTextField(5);
		this.lastField = new JTextField(5);
		this.emailField = new JTextField(5);
		this.phoneField = new JTextField(5);
		this.firstNameLabel = new JLabel("First Name");
		this.lastNameLabel = new JLabel("Last Name");
		this.emailLabel = new JLabel("Email");
		this.phoneLabel = new JLabel("Phone Number");
		this.onlyButton = new JButton();
		
	setupPanel();
	setupLayout();
	setupListeners();
}





private void setupPanel()
{
	this.setLayout(baseLayout);
	this.setPreferredSize(new Dimension(900,600));
	this.setBackground(Color.CYAN);
	this.add(firstField);
	this.add(lastField);
	this.add(emailField);
	this.add(phoneField);
	this.add(firstNameLabel);
	this.add(lastNameLabel);
	this.add(emailLabel);
	this.add(phoneLabel);
	this.add(onlyButton);
	
}

private void setupLayout()
{
	
}

private void setupListeners()
{
	
}

}


