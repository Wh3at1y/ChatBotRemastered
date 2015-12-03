package chat.view;

import chat.controller.ChatController;
import javax.swing.*;

public class ChatFrame extends JFrame
{
	//Declaration Section
	private ChatPanel GUIPanel;
	
	public ChatFrame(ChatController baseController)
	{
		GUIPanel = new ChatPanel(baseController);
		
		buildFrame();
	}
	
	private void buildFrame()
	{
		setContentPane(GUIPanel);
		setSize(500, 500);
		setVisible(true);
	}
}
