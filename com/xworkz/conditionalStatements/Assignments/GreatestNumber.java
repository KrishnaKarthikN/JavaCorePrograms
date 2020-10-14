class GreatestNumber{
	public static void main(String args[]){
		System.out.println("If Else Condition");
	
	int a = 10, b = 30 , c = 20;
	if(a > b){
		if (a > c)
			System.out.println("A is Greatest");
		else 
			System.out.println("C is Greatest");
	}else {
		if (b > c)
			System.out.println("B is Greatest");
		else
			System.out.println("C is Greatest");
	}
	//System.out.println("The value of y" + y);//gives error as y is local to that block
	
	}
}