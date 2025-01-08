import java.util.*;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Circle:"); 
		
		double radius = sc.nextDouble(); 
		
		 System.out.println("Enter the height of Circle:"); 
		
		double height = sc.nextDouble(); 
	
		double volume = Math.PI*radius*radius*height; 
		
		System.out.println("The Volume of Cylinder is: " + volume);
    }
}
