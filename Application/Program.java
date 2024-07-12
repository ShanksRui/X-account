package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

import entities.Replies;
import entities.Tweet;
import entities.User;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		LocalDate moment = LocalDate.now();
		SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
		Replies r1 =  new Replies("Skipped Firefly for this, mihoho plz");
		Replies r2 =  new Replies("Wht is the rerun character  together with Jade??");
		
    Tweet tweet = new Tweet(moment, "New Character", "Hello. I'm \"Jade,\" here as per your invitation. Hopefully, I wasn't late.\n"
	+ "And now... It's your call as to how we'll spend the next while. Relax. We can talk about anything you want."
	,170 , 245);
	tweet.addComment(r1);
	tweet.addComment(r2);
      
	User user = new User("Mell Harkov", 89, 10,d1.parse("17/05/2019"));
    user.addTweet(tweet);
	System.out.println(user.stringBuilder());
	}

}
