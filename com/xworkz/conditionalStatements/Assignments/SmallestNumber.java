class SmallestNumber{
	public static void main(String args[]){
		//System.out.println("If Else Condition");
	System.out.println("Finding smallest number");
	int a = 10, b = 20 , c = 5;
	if(a < b){
		if (a < c)
			System.out.println("A is Smallest : " + a);
		else 
			System.out.println("C is Smallest : " + c);
	}else {
		if (b < c)
			System.out.println("B is Smallest : " + b);
		else
			System.out.println("C is Smallest : " + c);
	}
	
	
	}
}