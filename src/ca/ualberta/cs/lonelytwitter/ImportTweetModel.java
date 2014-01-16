package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class ImportTweetModel extends LonelyTweetModel
{

	public ImportTweetModel(String text, Date timestamp)
	{

		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}

	public ImportTweetModel(String text)
	{

		super(text);
		// TODO Auto-generated constructor stub
	}
	
	public String getText() {
		return "important! " + super.getText();
	}
	@Override
	public Date getTimestamp() {
		return null;
	}
	}
	

	
	
	

