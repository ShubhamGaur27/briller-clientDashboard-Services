package com.briller.clientDash.response;

public class Relationship {

	private String name;
	private String imageUrl;

	private int numEscalations;

	private int numConversations;

	private String score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getNumEscalations() {
		return numEscalations;
	}

	public void setNumEscalations(int numEscalations) {
		this.numEscalations = numEscalations;
	}

	public int getNumConversations() {
		return numConversations;
	}

	public void setNumConversations(int numConversations) {
		this.numConversations = numConversations;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
