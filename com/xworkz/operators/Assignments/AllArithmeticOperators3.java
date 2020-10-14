class AllArithmeticOperators3{
		public static void main(String arg[]){
			System.out.println("numbers are n1=200, n2= 45, n3=15");
			System.out.println("Addition Operation");
			int n1=200, n2=45, n3=15;
			int sum= n1+n2+n3;
			System.out.println("sum :" + sum);
			
			System.out.println("Multiplication Operaton");
			int res = n1 * n2 *n3 ;
			System.out.println("mul :" + res);
			
			System.out.println("Division Operaton");
 			float resdiv = n1/n2/n3;
			System.out.println("remdiv :" + resdiv);	
			
			System.out.println("Modulus Operaton");
 			int resmod = n1%n2%n3;
			System.out.println("resmod : " + resmod);
			
			System.out.println("Subtraction Operation");
			int ressub = n1-n2-n3;
			System.out.println("Diff : " + ressub);
}
}