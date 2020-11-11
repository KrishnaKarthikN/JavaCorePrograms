package com.xworkz.collections.QueueAndJGArray;

import java.util.Comparator;

public class PencilComparator implements Comparator<Pencil> {

	@Override
	public int compare(Pencil o1, Pencil o2) {
			if (o1.getNoOfPencilsInBox() < o2.getNoOfPencilsInBox())
				return 1;
			else if (o1.getNoOfPencilsInBox() > o2.getNoOfPencilsInBox())
				return -1;
		return 0;
	} 

	
	
	
}
