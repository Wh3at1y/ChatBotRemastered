package chat.view;

import javax.swing.JOptionPane;

public class ChatPopUp
{
	public String getUserInput(String userTyped)
	{
		String userAnswer = "";
			userAnswer = JOptionPane.showInputDialog(userTyped);
		return userAnswer;
	}
	
	public void displayText(String showText)
	{
		JOptionPane.showConfirmDialog(null, showText);
	}
}
