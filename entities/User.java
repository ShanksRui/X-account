package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class User {

	private String name;
	private	Integer following;
	private Integer followers;
	private Tweet tweet;
	private Date accountCreate;
	public static SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
	public User(String name, Integer following, Integer followers,Date accountCreate) {
		this.name = name;
		this.following = following;
		this.followers = followers;
		this.accountCreate = accountCreate;
	}
	List<Tweet> post = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFollowing() {
		return following;
	}

	public void setFollowing(Integer following) {
		this.following = following;
	}

	public Integer getFollowers() {
		return followers;
	}

	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	public Tweet getTweet() {
		return tweet;
	}

	public List<Tweet> getPost() {
		return post;
	}
    public void addTweet(Tweet post) {
    	this.post.add(post);
    }
    public void removeTweet(Tweet post) {
    	this.post.remove(post);
    }


	public Date getAccountCreate() {
		return accountCreate;
	}

	public void setAccountCreate(Date accountCreate) {
		this.accountCreate = accountCreate;
	}

	public String stringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+"\n");
		sb.append("@"+name.replace(" ", "")+"\n");
		sb.append("\n");
		sb.append("#Joined "+d1.format(accountCreate)+"\n");
		sb.append(following+" Following  ");
		sb.append(followers+"K Followers\n");
		sb.append("\n");
		sb.append("Saved Posts:\n");
		for(Tweet y : post){
			sb.append(y.stringBuilder());
		}
			
		return sb.toString();
	}

}
