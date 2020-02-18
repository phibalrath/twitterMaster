package com.tts.techtalenttwitter.model;

import java.util.List;



public class TweetDisplay {
    private User user;
	
    private String message;
	
	private String date;
	
    private List<Tag> tags;

	public TweetDisplay() {
	}

	public TweetDisplay(User user, String message, String date, List<Tag> tags) {
		this.user = user;
		this.message = message;
		this.date = date;
		this.tags = tags;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
    
    
}
