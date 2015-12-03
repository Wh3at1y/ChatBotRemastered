package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> 	  memesList;
	private ArrayList<String> politicalTopicList;
	
	private String enteredUserName;
	private String 	  likedContent;
	
	/**
	 * Passes userName from the Controller into this class, or the Constructor.
	 * @param userName the User name the user enters.
	 */
	public Chatbot(String userName)
	{
		this.memesList 	   = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		
		this.enteredUserName = userName;
		this.likedContent 	 = "Gaming";
		
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
	
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null && currentInput.length() >= 1)
		{
			hasLength = true;
		}
		
		return hasLength;
	}
}
