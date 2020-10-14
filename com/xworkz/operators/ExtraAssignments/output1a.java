class output1a{
	public static void main(String args[]){
		int i= 24;
		i= i++ + ++i;
		System.out.println("value of i = " + i);
		 
		int a = 5,  b=10,c;
		c = a+ b + a++ + b++ + ++a + ++b;
		System.out.println("value of c = " + c);
		
		int y = 7;
		y = y++ - --y + ++y - y--;
		System.out.println("value of y = " + y);		
		} 


}