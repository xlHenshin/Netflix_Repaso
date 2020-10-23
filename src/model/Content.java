package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Content implements Comparable<Content> {

	private PApplet app;
	private PImage image;
	
	private String name;
	private String type;

	private int year;
	private int rating;
	
	public Content(String name, int year, int rating, String type, PImage image, PApplet app) {
		
		this.app = app;
		this.image = image;
		this.name = name;
		this.year=year;
		this.rating = rating;
		this.type=type;
		
	}
	
	public void drawImage(int x) {
		

		app.image(image, x, 50,150,200);
		app.text(name, x, 60 + 210);
		app.text(year, x, 60 + 225);
		app.text(type, x, 60 + 240);
		app.text(rating + "%", x, 60 + 255);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Content nextContent) {
		// TODO Auto-generated method stub
		return this.rating-nextContent.getRating();
	}
	
	
}
