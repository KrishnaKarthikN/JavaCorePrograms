package com.xworkz.collections.Sorting;

import java.util.Comparator;

public class SortTVByBrand implements Comparator<Television>{

	@Override
	public int compare(Television o1, Television o2) {
		return o1.getBrand().compareTo( o2.getBrand());
	}

}
