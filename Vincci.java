
import java.util.Scanner;

public class Vincci extends Purse {
	
	//Vincci as subclass and Purse as Parent class
		Scanner sc = new Scanner(System.in);
		
		private String Brand, Color;
		private int Size, No;
		private double Price, Totalprice;
		
		Vincci(){				
			
			//Constructor without argument named Vincci
			this.Brand = "Vincci";
			System.out.print("Enter the purse color (Black / Nude): ");
			this.Color = sc.nextLine();
			while (this.Color.equalsIgnoreCase("Black") == false && this.Color.equalsIgnoreCase("Nude") == false) {
				System.out.println("The color out of stock! There only Black and Nude available");
				System.out.print("Enter the color model(Black / Nude): ");
				this.Color = sc.nextLine();
			}
			
			System.out.print("Enter the purse quality (30 / 40): ");
			this.Size = sc.nextInt();
			while (this.Size != 30 && this.Size != 40) {
				System.out.println("The size out of stock! There only 30 and 40 available");
				System.out.print("Enter the size (30 / 40): ");
				this.Size = sc.nextInt();
				
			}
			
			if (Color.equalsIgnoreCase("Black")) {
				if (Size == 30) {
					this.Price = 50;
				}
				
				else if (Size == 40) {
					this.Price = 100;
				}
				
			}
			
			else if (Color.equalsIgnoreCase("Nude")) {
				if (Size == 30) {
					this.Price = 100;
				}
				else if (Size == 40) {
					this.Price = 250;
					
				}
			}
			
		System.out.print("Enter the number of units: ");
		this.No = sc.nextInt();
		this.Totalprice = this.Price * this.No;
		System.out.println();
	}
	
	String getBrand() {
		return this.Brand;
	}
	
	String getColor() {
		return this.Color;
	}
	
	int getSize() {
		return this.Size;
	}
	
	int getNo() {
		return this.No;
	}
	
	double getPrice() {
		return this.Price;
		
	}
		
	double getTotalprice() {
		return this.Totalprice;
		
		}
}
