import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;



public class LonelyTweetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public LonelyTweetModelTest()
	{

		super(LonelyTwitterActivity.class);
	}
	public void testFailure()
	{
		assertEquals("5 should not equal 5", 5, 5);
		
	}
	
	public void testEquals(){
		Date date = new Date();
		NormalTweetModel normal = new NormalTweetModel("test", date);
		NormalTweetModel otherNormal = new NormalTweetModel("test", date);
		
		ImportantTweetModel important = new ImportantTweetModel("test", date); 
		
		//assertFalse("different tweets are not equal", normal.equals(otherNormal));
		assertFalse("Tweets should be different", normal.equals(important));
		assertFalse("Tweets should be different", important.equals(normal));
		
		
		
		
	}
}
