package model;

import java.util.Comparator;

public class CompareName implements Comparator<Content> {

	@Override
	public int compare(Content arg0, Content arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}

}
