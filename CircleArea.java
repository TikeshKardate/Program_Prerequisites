import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of Circle:"); 
		
		double radius = sc.nextDouble(); 
		
	
		double area = 3.14*radius*radius; 
		
		System.out.println("The Area Of Circle is: " + area);
    }
}
