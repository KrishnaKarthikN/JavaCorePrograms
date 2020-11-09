package com.xworkz.collections.Sorting;

import java.util.Comparator;

public class SortTVByInches implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getInches()-o2.getInches();
	}

}
