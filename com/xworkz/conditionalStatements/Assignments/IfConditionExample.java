class IfConditionExample{
	public static void main(String args[]){
	
		System.out.println("This is to illustrate if condition");
		
		boolean flag = true;
		if(flag){
			System.out.println("The Flag is True");
		}	//if false the block will not be executed
	
		int a = 10, b = 12;
		if (a < b){
			System.out.println("b is greater");
		}
	
		if (a<b && flag){//true && true
			System.out.println("multiple condition checked");
		}
		
		
	
	
	
	}
}//bitwise & AND | and Shift operators