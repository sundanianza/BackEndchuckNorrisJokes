package com.anzanisundani.chucknorrisjokes.chuckNorrisJokes.model;

public class Jokes {
	
	private String value;
	
	private String  icon_url;
	
	private String updated_at;
	
	
	

	public Jokes(String value, String icon_url, String updated_at) {
		super();
		this.value = value;
		this.icon_url = icon_url;
		this.updated_at = updated_at;
	}

	
	
	@Override
	public String toString() {
		return "Jokes [value=" + value + ", icon_url=" + icon_url + ", updated_at=" + updated_at + "]";
	}



	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
	

}
