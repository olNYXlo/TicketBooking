package pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Responder {

	private String text;
	private String name;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	/*
	public Responder() {
		
	}
	*/
	@JsonCreator
	public Responder(@JsonProperty("welcometext")String welcometext, @JsonProperty("ResponderName")String ResponderName) {
		text = welcometext;
		name = ResponderName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
