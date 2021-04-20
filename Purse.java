
import java.util.Scanner;

public class Purse{						
	
	//Scanner input
	Scanner sc = new Scanner(System.in);
	
	private double weight, width, height;
	private double length, volume;
	
	Purse(){			
		
		//Constructor without argument named Desktop
		System.out.print("Enter Purse's Weight (in kg): ");
		this.weight = sc.nextDouble();
		System.out.print("Enter Purse's Width (in cm): ");
		this.width = sc.nextDouble();
		System.out.print("Enter Purse's Length (in cm): ");
		this.length = sc.nextDouble();
		this.volume = this.length * this.width * this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getLength() {
		return this.length;
	}
	
	double getVolume() {
		return this.volume;
	}
}



