class FindDayOfGivenNum{
	public static void main(String args[]){
		
		int day = 1 ; 
		System.out.println("Find day of given number : " + day);
		switch(day){
		case 1 : System.out.println("The day is Monday");
				break;
		case 2 : System.out.println("The day is Tuesday");
				break;
		case 3 : System.out.println("The day is Wednesday");
				break;
		case 4 : System.out.println("The day is Thursday");
				break;
		case 5 : System.out.println("The day is Friday");
				break;
		case 6 : System.out.println("The day is Saturday");
				break;
		case 7 : System.out.println("The day is Sunday");
				break;
		default : 
			System.out.println("Enter number between 1 to 7");
			break;
		}	
		
	
	}

}