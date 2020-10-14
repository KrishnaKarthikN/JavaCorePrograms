class ArithmeticOperator{
	public static void main(String arg[]){
		System.out.println("The addition of two num variables");
		
		int num1=10;
		int num2=20;
 		int sum; 
		sum = num1 + num2; 
		System.out.println("The sum of two num variables " + sum);
		sum = 50 + 60;
		System.out.println("The sum of 50 & 60 : " + sum);
		System.out.println("The sum of 32 & 58 : " + (32+58));
		
		System.out.println("The division of two num variables");
		
		int n1= 9 , n2= 3 , divRes;
		divRes = n1/n2 ;
		System.out.println("The division of the numbers :" + divRes);
		
		double dnum1 = 10.56, dnum2 = 5.00;
		double dRes = dnum1/dnum2;
		System.out.println("The division of the numbers :" + dRes);
		
		int dnum3 = 15, dnum4 = 0;
		int divByZero = dnum3/dnum4 ;//num/0==> infinity(maths) message for JVM 
		
    }
}