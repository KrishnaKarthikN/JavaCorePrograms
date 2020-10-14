class Grades{

	public static void main(String args[]){
		
		char grade1 = 'A', grade2 = 'D';
		switch (grade1) {
                  case 'A':
                        System.out.println("Grade A - marks >=85");
                        break;
    
                  case 'B':
                        System.out.println("Grade B - marks >=60");
                        break;
 
                  case 'C':
                        System.out.println("Grade C - marks >=40");
                        break;
                        
                  case 'D':
                        System.out.println("Grade D - marks <35 FAIL");
                        break;
                        
                  default : //optional
                        System.out.println("Invalid Grade");
                        break; //optional
           }
		   switch (grade2) {
                  case 'A':
                        System.out.println("Grade A - marks >=85");
                        break;
    
                  case 'B':
                        System.out.println("Grade B - marks >=60");
                        break;
 
                  case 'C':
                        System.out.println("Grade C - marks >=40");
                        break;
                        
                  case 'D':
                        System.out.println("Grade D - marks <35 FAIL");
                        break;
                        
                  default : //optional
                        System.out.println("Invalid Grade");
                        break; //optional
           }
   }
}