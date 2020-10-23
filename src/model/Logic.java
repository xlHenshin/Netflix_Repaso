package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	PApplet app;
	PImage image;
	
	CompareName cName;
	CompareYear cYear;
	CompareType cType;
	
	String[] compareName;
	String[] compareType;
	String[] compareYear;
	String[] compareRating;
	
	String [] netflix;
	private LinkedList<Content> contents;
	
	public Logic(PApplet app) {
		
		this.app = app;
		netflix = app.loadStrings("../resources/netflix.txt");
		System.out.println(netflix.length);
		contents = new LinkedList<Content>();
		
		compareName = new String[7];
		compareType = new String[7];
		compareYear = new String[7];
		compareRating = new String[7];
		
		cName = new CompareName();
		cYear = new CompareYear();
		cType = new CompareType();
		
		for (int i = 0; i < netflix.length; i++) {
			
			String items = netflix[i];
			System.out.println(items);
			
			String [] data = netflix[i].split(",");
			
			String name = data[0];
			int year = Integer.parseInt(data[1]);
			int rating = Integer.parseInt(data[2]);
			String type = data[3];
			
			String imageName = name.toLowerCase().replaceAll(" ", "");
			image = app.loadImage("../img" + "/" + imageName + "" + ".jpg");
			
			contents.add(new Content(name, year, rating, type, image, app));
		}

	}
	
	public void SortBy(char key) {
		
		switch (key) {
		case 'r':
			
			Collections.sort(contents);
			
			for (int i = 0; i < contents.size(); i++) {

				String name = contents.get(i).getName();
				String year = Integer.toString(contents.get(i).getYear());
				String rating = Integer.toString(contents.get(i).getRating());
				String type = (contents.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				
				compareRating[i] = line;
				
				this.app.saveStrings("ComparedByRating.txt", compareRating);
			}
			
			break;
			
		case 'n':
			
			Collections.sort(contents, cName);
			
			for (int i = 0; i < contents.size(); i++) {

				String name = contents.get(i).getName();
				String year = Integer.toString(contents.get(i).getYear());
				String rating = Integer.toString(contents.get(i).getRating());
				String type = (contents.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				
				compareName[i] = line;

				this.app.saveStrings("ComparedByName.txt", compareName);
			}
			
			break;
			
		case 'y':
			
			Collections.sort(contents, cYear);
			
			for (int i = 0; i < contents.size(); i++) {

				String name = contents.get(i).getName();
				String year = Integer.toString(contents.get(i).getYear());
				String rating = Integer.toString(contents.get(i).getRating());
				String type = (contents.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				
				compareYear[i] = line;

				this.app.saveStrings("ComparedByYear.txt", compareYear);
			}
			
			break;
			
		case 't':
			
			Collections.sort(contents, cType);
			
			for (int i = 0; i < contents.size(); i++) {

				String name = contents.get(i).getName();
				String year = Integer.toString(contents.get(i).getYear());
				String rating = Integer.toString(contents.get(i).getRating());
				String type = (contents.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				
				compareType[i] = line;

				this.app.saveStrings("ComparedByType.txt", compareType);
			}
			
			break;

		default:
			break;
		}
	}

	public LinkedList<Content> getContents() {
		return contents;
	}	
	
}
