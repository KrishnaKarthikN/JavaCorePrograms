package com.xworkz.LoopingConcept;

public class Sum5To25 {
	public static void main(String[] args) {
	int num = 25 , sum = 0;
	for(int i = 5 ; i <= num ; i++) {
		sum = sum + i;
	}
	System.out.println("The Sum : " + sum);
	}
}



//1st iteration : i=5;5<=25;i++  sum = 0+5 = 5
//2st iteration : i=6;6<=25;i++  sum = 5+6 = 11
//3st iteration : i=7;7<=25;i++  sum = 11+7 = 18
//4st iteration : i=8;8<=25;i++  sum = 18+8 = 26
//5st iteration : i=9;9<=25;i++  sum = 26+9 = 35
////
//
//25th iteration : i=25;25<=25;i++ sum = 290+25=315