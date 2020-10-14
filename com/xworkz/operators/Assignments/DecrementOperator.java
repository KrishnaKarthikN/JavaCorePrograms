class DecrementOperator{
		public static void main(String args[]){
			//POST DECREMENT
			System.out.println("The illustration of post decrement operator");
			int num=19;
			num=num-- + 1 + num--;
			System.out.println("The new value of num : " +num);
			
			
			//PRE DECREMENT
			System.out.println("The illustration of pre decrement operator");
			int num1=20;
			num1=--num1 + 1 + --num1;
			System.out.println("The new value of num : " +num1);



}
}