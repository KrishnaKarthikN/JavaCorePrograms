class EnggBranch{

	public static void main(String args[]){
		
		String branch1 = "ECE", branch2 = "ME";
		switch (branch1) {
                  case "CSE":
                        System.out.println("Computer Science  Engineering");
                        break;
    
                  case "ME":
                        System.out.println("Mechanical Engineering");
                        break;
 
                  case "ECE":
                        System.out.println("Electronics And Communicatoin Engineering");
                        break;
                        
                  case "EEE":
                        System.out.println("Electrical And Electronics Engineering ");
                        break;
                        
                  default : //optional
                        System.out.println("Branch doesnot Exist");
                        break; //optional
           }
		   switch (branch2) {
		          case "CSE":
                        System.out.println("Computer Science  Engineering");
                        break;
    
                  case "ME":
                        System.out.println("Mechanical Engineering");
                        break;
 
                  case "ECE":
                        System.out.println("Electronics And Communicatoin Engineering");
                        break;
                        
                  case "EEE":
                        System.out.println("Electrical And Electronics Engineering ");
                        break;
                        
                  default : //optional
                        System.out.println("Branch doesnot Exist");
                        break; //optional
           }
   }
}