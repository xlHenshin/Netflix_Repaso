package model;

import java.util.Comparator;

public class CompareYear implements Comparator<Content> {

	@Override
	public int compare(Content o1, Content o2) {
	
		return o1.getYear()-o2.getYear();
	}

}
