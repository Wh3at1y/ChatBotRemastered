package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> 	  memesList;
	private ArrayList<String> politicalTopicList;
	
	private String enteredUserName;
	private String 	  content;
	
	/**
	 * Passes userName from the Controller into this class, or the Constructor.
	 * @param userName the User name the user enters.
	 */
	public Chatbot(String userName)
	{
		this.memesList 	   = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		
		this.enteredUserName = userName;
		this.content 	 = "Gaming";
		
			buildMemesList();
		buildPoliticalList();
		
	}
	
	private void buildMemesList()
	{
		memesList.add("cute animals");
		memesList.add("doge");
		memesList.add("grumpy cat");
		memesList.add("bad luck brian");
		memesList.add("pepe");
		memesList.add("trolling");
		memesList.add("nian cat");
		memesList.add("john cena");
		memesList.add("meme");
		memesList.add("inception");
	}
	
	private void buildPoliticalList()
	{
		politicalTopicList.add("Donald Trump");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Biden");
		politicalTopicList.add("Carson");
		politicalTopicList.add("Rubio");
		politicalTopicList.add("Fiorina");
		politicalTopicList.add("Sanders");
		politicalTopicList.add("vote");
		politicalTopicList.add("11/4/16");
		politicalTopicList.add("election");
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("liberal");
		politicalTopicList.add("convervative");
	}
	
	/** -----------------------------
	 * 			Checkers
	 *  -----------------------------
	 */ 
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null && currentInput.length() >= 1)
		{
				hasLength = true;
		}
				return hasLength;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean hasPolitical = false;
		
		for(String political: politicalTopicList)
		{
			if(currentInput.toLowerCase().contains(political.toLowerCase()))
			{
				hasPolitical = true;
			}
		}
				return hasPolitical;
	}
	
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
				hasContent = true;
		}
				return hasContent;
	}
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(String meme: memesList)
		{
			if(currentInput.toLowerCase().contains(meme.toLowerCase()))
			{
				hasMeme = true;
			}
		}		
				return hasMeme;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean isMash = false;
		
		if(currentInput.equalsIgnoreCase("sdf") || currentInput.equalsIgnoreCase("dfg") || currentInput.equalsIgnoreCase("cvb") || currentInput.equalsIgnoreCase(",./"))
		{
				isMash = true;
		}
				return isMash;
	}
	
	String processConversation(String currentInput)
	{
		String nextConversation = "Oh, what else would you like to talk about?";
		int    randomTopic 		= (int) (Math.random() * 5);
		
		if(keyboardMashChecker(currentInput))
		{
			return "You think I wouldnt realize keyboard mashing?";
		}
		
		switch(randomTopic)
		{
		case 0:
			if(contentChecker(currentInput))
			{
				nextConversation = "So you like gaming, too? I love CSGO! What else do you want to chat about?";
			}
			break;
			
		case 1:
			if(memeChecker(currentInput))
			{
				nextConversation = "You know memes pretty well. What fast food do you like?";
			}
			break;
			
		case 2:
			if(politicalTopicChecker(currentInput))
			{
				nextConversation = "You like Trump Donalds? Same!";
			}
			break;
		case 3:
			
			if(currentInput.equalsIgnoreCase("hi"))
			{
				nextConversation = "Hello there!";
			}
			break;
		case 4:
			
			break;
			
			//default means the else in an if-else statement. Only happens if nothing else works.
		default:
			break;
		}
		return nextConversation;
	}
}
