import java.util.*;

public class KilometersToMiles {
public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the Distance in Kilometers:"); 
		
		double km = sc.nextDouble(); 
	
		double conversion = (km*0.621371); 
		
		System.out.println("The conversion of" +km+ "in Miles is" +conversion);
    }
}
