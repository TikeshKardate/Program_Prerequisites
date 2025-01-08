import java.util.*;

public class Average {
public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the First Number:"); 
		
		int a = sc.nextInt(); 
		
		 System.out.println("Enter the Second Number:"); 
		
		int b = sc.nextInt(); 
		
		System.out.println("Enter the Third Number:"); 
		
		int c = sc.nextInt(); 
	
		double average = ((a+b+c)/(1.0*3)); 
		
		System.out.println("The average of three numbers is: " + average);
    }
}
