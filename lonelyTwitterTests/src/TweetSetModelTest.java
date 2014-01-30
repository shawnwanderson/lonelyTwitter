import java.lang.reflect.Array;
import java.util.ArrayList;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;



public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetSetModelTest()
	{

		super(LonelyTwitterActivity.class);
		
	}

	public void testCount()
	{
		TweetSetModel tweets = new TweetSetModel();
		assertEquals("tweets start empty", 0, tweets.countTweets());
		
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after...", 1, tweets.countTweets());
		
	}
	
	public void getTweetsTest(){
		
		ArrayList<NormalTweetModel> lonelyTweetOne = new ArrayList<NormalTweetModel>();
		lonelyTweetOne.add(new NormalTweetModel("Femi"));
		lonelyTweetOne.add(new NormalTweetModel("Shawn"));
		lonelyTweetOne.add(new NormalTweetModel("Hey"));
		lonelyTweetOne.add(new NormalTweetModel("Hello"));
		
		
		ArrayList<NormalTweetModel> lonelyTweetTwo = loadFromFile();
		
		for (int i =0; i < lonelyTweetOne.size(); i++){
		assertFalse("should NOT return identical arraylist", lonelyTweetOne.get(i).equals(lonelyTweetTwo.get(i)));
		assertTrue("should return identical arraylist", lonelyTweetOne.get(i).equals(lonelyTweetTwo.get(i)));
		}
	}
	
	public ArrayList<NormalTweetModel> loadFromFile(){
		
		
		
		return null;
	}
	
	
}
