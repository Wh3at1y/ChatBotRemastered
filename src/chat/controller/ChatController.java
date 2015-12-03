package chat.controller;

import chat.view.*;
import chat.model.Chatbot;

public class ChatController
{
	//Declaration Section
	private ChatFrame GUIFrame;
	private Chatbot	  brettlyBot;
	private ChatPopUp popUp;
	
	public ChatController()
	{
		//Sets the Frame for the GUI
		GUIFrame = new ChatFrame(this);
		popUp    = new ChatPopUp();
		
		//Puts userName into the Chatbot Constructor.
		String userName = popUp.getUserInput("What is your name?");
		
		//Passes the userName from above, into the Chatbot class.
		brettlyBot = new Chatbot(userName);
	}
	
	public void start()
	{
		
	}
}
