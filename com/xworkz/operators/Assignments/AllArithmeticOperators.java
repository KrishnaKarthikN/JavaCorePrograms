class AllArithmeticOperators{
		public static void main(String arg[]){
			System.out.println("Addition Operation");
			int n1=200, n2=45, sum;
			sum= n1+n2;
			System.out.println("Addition Operation of n1 and n2:" + sum);
			
			System.out.println("Multiplication Operaton");
			int res = n1 * n2;
			System.out.println("Multiplication Operation of n1 and n2:" + res);
			
			System.out.println("Division Operaton");
 			float resdiv = n1/n2;
			System.out.println("Division Operation of n1 and n2:" + resdiv);	
			
			System.out.println("Modulus Operaton");
 			int resmod = n1%n2;
			System.out.println("Modulus Operation of n1 and n2:" + resmod);
			
			System.out.println("Subtraction Operation");
			int ressub = n1-n2;
			System.out.println("Subtraction Operation of n1 and n2:" + ressub);
}
}