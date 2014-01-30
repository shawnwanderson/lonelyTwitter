package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetSetModel
{
	int count = 0;
	public TweetSetModel()
	{

		super();
	}
	
		public int countTweets() {
			return count;
		}
	
		public void addTweet(NormalTweetModel normalTweetModel){
			count++;
			
		}
		
		public ArrayList<LonelyTweetModel> getTweets()
		{
			
			return null;
		}
}
