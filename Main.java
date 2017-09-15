package car;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inputReader = new Scanner(System.in);
		int speed = 0;
		
		
		
		Car[] myCar = {
			new Car("HGR-987"),
			new Car("EFX-395"),
			new Car("ACW-900")
			};
		
		for(int i=0; i < myCar.length; i++){
			System.out.println("Enter the speed of car: " + myCar[i].getPlateNr());
			speed = inputReader.nextInt();
			myCar[i].setSpeed(speed);
			
			}
		
		inputReader.close();
	
		
	}

}
