package regex.view;
import java.awt.event.*;
import java.util.regex.*;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import regex.controller.*;
import regex.view.*;

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
		onlyButton.setText("See if your not lying boi");
		
	setupPanel();
	setupLayout();
	setupListeners();
}





private void setupPanel()
{
	this.setLayout(baseLayout);
	this.setPreferredSize(new Dimension(900,900));
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
	baseLayout.putConstraint(SpringLayout.WEST, firstField, 56, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, lastField, 33, SpringLayout.SOUTH, firstField);
	baseLayout.putConstraint(SpringLayout.EAST, lastField, 0, SpringLayout.EAST, firstField);
	baseLayout.putConstraint(SpringLayout.NORTH, emailField, 24, SpringLayout.SOUTH, lastField);
	baseLayout.putConstraint(SpringLayout.EAST, emailField, 0, SpringLayout.EAST, firstField);
	baseLayout.putConstraint(SpringLayout.NORTH, phoneField, 27, SpringLayout.SOUTH, emailField);
	baseLayout.putConstraint(SpringLayout.WEST, phoneField, 0, SpringLayout.WEST, firstField);
	baseLayout.putConstraint(SpringLayout.SOUTH, firstNameLabel, -432, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.NORTH, firstField, 6, SpringLayout.SOUTH, firstNameLabel);
	baseLayout.putConstraint(SpringLayout.EAST, firstNameLabel, 0, SpringLayout.EAST, firstField);
	baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, firstField);
	baseLayout.putConstraint(SpringLayout.SOUTH, lastNameLabel, -6, SpringLayout.NORTH, lastField);
	baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 76, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, emailLabel, -6, SpringLayout.NORTH, emailField);
	baseLayout.putConstraint(SpringLayout.WEST, phoneLabel, 43, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, phoneLabel, -6, SpringLayout.NORTH, phoneField);
	baseLayout.putConstraint(SpringLayout.NORTH, onlyButton, -5, SpringLayout.NORTH, emailLabel);
	baseLayout.putConstraint(SpringLayout.WEST, onlyButton, 31, SpringLayout.EAST, lastField);
}

private void setupListeners()
{

	onlyButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent selection) {
				if(firstField.toString().matches("[A-Za-z,.-']{2,1000}"))
				{
					
				}
				else
				{
				
				}
				
				if(lastField.toString().matches("[A-Za-z,.'- ]{2,1000}"))
				{
					
				} 
				else
				{
					
				}
//				
				if(emailField.toString().matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"))
				{
					
				}
				else
				{
				
				}
				
				if(phoneField.toString().matches("[0-9]{10}"))
				{
					
				} 
				else
				{
					
				}
//					
			}
			});
	
	
}


}