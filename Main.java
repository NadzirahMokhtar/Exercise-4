
public class Main {

	public static void main(String[] args) {
		
		Vincci x = new Vincci(); 
		
		//Construct an object Vincci
		System.out.println("Weight: "+ x.getWeight() + "kg");
		System.out.println("Width: "+ x.getWidth() + "cm");
		System.out.println("Length: "+ x.getLength() + "cm");
		System.out.println("Volume: "+ x.getVolume() + "cm^3");
		System.out.println("Brand: "+ x.getBrand());
		System.out.println("Color: "+ x.getColor());
		System.out.println("Size: "+ x.getSize() + "cm");
		System.out.println("Number of units: " + x.getNo());
		
		System.out.println();
		
		Channel d = new Channel(); 
		
		//Construct an object Charles and Keith
		System.out.println("Weight: "+ d.getWeight() + "kg");
		System.out.println("Width: "+ d.getWidth() + "cm");
		System.out.println("Length: "+ d.getLength() + "cm");
		System.out.println("Volume: "+ d.getVolume() + "cm^3");
		System.out.println("Brand: "+ d.getBrand());
		System.out.println("Color: "+ d.getColor());
		System.out.println("Size: "+ d.getSize() + "cm");
		System.out.println("Number of units: " + d.getNo());
		
	}
}
