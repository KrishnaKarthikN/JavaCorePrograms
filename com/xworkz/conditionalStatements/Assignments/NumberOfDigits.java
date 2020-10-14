class NumberOfDigits {

   public static void main(String args[]){
	int num1 = 789 , num2 = 15985;
	System.out.println("Given number : " + num1);
	if(num1 <100 && num1 >=10) {
	  System.out.println("Given number has 2 digit");
	}
	else if(num1 <1000 && num1>=100) {
	  System.out.println("Given number has 3 digits");
	}
	else if(num1 <10000 && num1>=1000) {
	  System.out.println("Given number has 4 digits");
	}
	else if(num1 <100000 && num1>=10000) {
	  System.out.println("Given number has 5 digits");			
	}
	else {
	  System.out.println("number is not between 1 & 99999");			
	}
	
	System.out.println("Given number : " + num2);
	
	if(num2 <100 && num2 >=10) {
	  System.out.println("Given number has 2 digit");
	}
	else if(num2 <1000 && num2>=100) {
	  System.out.println("Given number has 3 digits");
	}
	else if(num2 <10000 && num2>=1000) {
	  System.out.println("Given number has 4 digits");
	}
	else if(num2 <100000 && num2>=10000) {
	  System.out.println("Given number has 5 digits");			
	}
	else {
	  System.out.println("number is not between 1 & 99999");			
	}
   
   
   }
   
   
}