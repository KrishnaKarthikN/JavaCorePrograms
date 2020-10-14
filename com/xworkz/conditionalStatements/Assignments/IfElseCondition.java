class IfElseCondition{
	public static void main(String args[]){
		System.out.println("If Else Condition");
	
	int a = 10, b = 20;
	if(a > b){
		//int a = 30; >>gives compile time issue
		int y= 40;
		System.out.println("A is greater");
	}else{
		int y=40;
		System.out.println("B is greater");
	}
		
	
	//System.out.println("The value of y" + y);//gives error as y is local to that block
	
	}
}