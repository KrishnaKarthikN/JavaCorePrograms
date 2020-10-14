class Electives { 
    public static void main(String[] args) 
    { 
        String Branch = "ECE"; 
        int year = 2; 
		System.out.println("Branch Selected is : " + Branch);
		System.out.println("Year Selected is : " + year);
        switch (year) { 
        case 1: 
            System.out.println("elective courses : Advance english, Network Security"); 
            break; 
        case 2: 
            switch (Branch) // nested switch 
            { 
            case "CSE":
				System.out.println("elective courses : Machine Learning, Advanced Python"); 
                break;
            case "ECE": 
                System.out.println("elective courses : Machine Learning, Pattern classification"); 
                break; 
  
            case "EEE": 
                System.out.println("elective courses : Robotics"); 
                break; 
  
            default: 
                System.out.println("Elective courses : Optimization"); 
            } 
        } 
    } 
}