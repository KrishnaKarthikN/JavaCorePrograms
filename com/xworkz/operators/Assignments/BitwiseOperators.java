class BitwiseOperators{
	public static void main(String args[]){
		int a = 7,b =8;
			System.out.println("a & b = " + (a & b));
			System.out.println("a | b = " + (a | b));
			System.out.println("a ^ b = " + (a ^ b));
			System.out.println("~a  = " + ~a);
			a &= b;
			System.out.println("a &= = " + a);
		}
}