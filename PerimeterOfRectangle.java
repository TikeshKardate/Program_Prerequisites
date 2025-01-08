import java.util.*;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length:"); 
		
		double l = sc.nextDouble(); 
		
		 System.out.println("Width:"); 
		
		double w = sc.nextDouble(); 
	
		double perimeter = (2*(l+w)); 
		
		System.out.println("Perimeter Of Rectangle: " + perimeter);
    }
}
