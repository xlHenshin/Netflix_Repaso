package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {

		size(1280, 580);
	}
	
	public void setup() {
		
		controller= new Controller(this);
	}
	
	public void draw() {
		
		background(0);
		textSize(15);
		
		for (int i = 0; i < controller.contents().size(); i++) {

			controller.contents().get(i).drawImage(25+(180*i));
		}
		
		drawText();
	}
	
	public void drawText() {
		
		textSize(20);
		text("Sort by:", 25, 380);
		text("R = rating", 25, 420);
		text("N = name", 25, 450);
		text("Y = year", 25, 480);
		text("T  = type", 25, 510);
	}
	
	public void keyPressed() {
		
		controller.SortBy(key);
	}
}
