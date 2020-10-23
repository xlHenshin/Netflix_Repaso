package model;

import java.util.Comparator;

public class CompareType implements Comparator<Content> {

	@Override
	public int compare(Content o1, Content o2) {
		
		return o1.getType().compareTo(o2.getType());
	}
	
	

}
