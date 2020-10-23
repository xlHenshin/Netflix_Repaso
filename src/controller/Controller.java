package controller;

import java.util.LinkedList;

import model.Content;
import model.Logic;
import processing.core.PApplet;

public class Controller {

	private PApplet app;
	private Logic logic;
	
	public Controller(PApplet app) {
		
		this.app = app;
		logic = new Logic(app);
	}
	
	public void SortBy(char key) {
		// TODO Auto-generated method stub
		
		logic.SortBy(key);
	}
	
	public LinkedList<Content> contents(){
		
		return logic.getContents();
	}

}
