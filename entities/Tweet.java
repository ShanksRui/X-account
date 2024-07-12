package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Tweet {

	private LocalDate moment;
	private String title;
	private String content;
	private Integer like;
	private Integer view;
	public static DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	public Tweet() {
		
	}
	List<Replies> comment = new ArrayList<>();
	
	public Tweet(LocalDate moment, String title, String content, Integer like, Integer view) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
		this.view = view;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public Integer getView() {
		return view;
	}

	public void setView(Integer view) {
		this.view = view;
	}
    
	public List<Replies> getComment() {
		return comment;
	}

	public void addComment(Replies comment) {
		this.comment.add(comment);
	}
	public void removeComment(Replies comment) {
		this.comment.remove(comment);
	}

	 public String stringBuilder() {
		 StringBuilder sb = new StringBuilder();
		 
		sb.append("\nHonkai Star Rail - "+moment.format(f1));
		sb.append("\n"+"*"+title+"*");
		sb.append("\n");
		sb.append("\n"+content);
		sb.append("\n"+"    Like-"+like+"K");
		sb.append("   Views-"+view+"k\n");
		sb.append("Replies:\n");
		for(Replies x : comment) {
			sb.append(x.getReply());
			sb.append("\n");
		}
		
		return sb.toString();
	 }
}
