package com.xworkz.AnonymousClasses.Assignments;

public class MasksTester{
	
public static void main(String[] args) {
	
	Masks mask = new Masks() {

		@Override
		public void wearing() {
			System.out.println("Wearing is easy");
		}

		@Override
		public void hasCarbonFilter() {
			System.out.println("Mask has Carbon Filter");
		}
		
	};
	mask.hasCarbonFilter();
	mask.wearing();
	mask.isn95();
	
	
	
}

}


/*Outputs :
Mask has Carbon Filter
Wearing is easy
Mask Is N95
*/
