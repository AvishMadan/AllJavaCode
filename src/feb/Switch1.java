package feb;

public class Switch1 {
static int age;
	public static void main(String[] args) {
		age=10;
		System.out.println("Modified this file in new branch");
		System.out.println("Added one more syso as per your comment");
		switch (age) {
		case 10:
			System.out.println("my age is "+age);
			break;
         case 20:
        	 System.out.println("my age is "+age);
		
         case 30:
        	 System.out.println("my age is "+age);
	      
       case 40:
    	   System.out.println("my age is "+age);
	      break;
         case 50:
        	 System.out.println("my age is "+age);
	       
		default:
			System.out.println("Please enter a valid age");
			break;
		}
		
		
		
	}
	
	
	

}
