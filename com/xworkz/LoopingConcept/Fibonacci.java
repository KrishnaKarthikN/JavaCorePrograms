package com.xworkz.LoopingConcept;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		int i , c;
		for (i = 1; i<=num ; i++ ) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
 
/*1st iteration : i=1;1<=10;i++  a=0 ; c = 0+1 =1 ; a= 1 ; b = 1 ; 
2st iteration : i=2;1<=10;i++  a=1 ; c = 1+1 =2 ; a= 1 ; b = 2 ;
3rd iteration : i=3;1<=10;i++  a=1 ; c = 1+2 =3 ; a= 2 ; b = 3 ;
4th iteration : i=4;1<=10;i++  a=2 ; c = 2+3 =5 ; a= 3 ; b = 5 ;
5th iteration : i=5;1<=10;i++  a=0 ; c = 3+5 =8 ; a= 5 ; b = 8 ;
6th iteration : i=6;1<=10;i++  a=0 ; c = 5+8 =13 ; a= 8 ; b = 13 ;    */