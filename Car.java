package car;

	public class Car {

		private static final int MAX_SPEED = 240;

		private String plateNr;
		private int currentSpeed;
		
		public String getPlateNr(){
			return this.plateNr;
	
}
		public Car (String inputPlateNr){
			plateNr = inputPlateNr;
			currentSpeed = 0;
	 
		}
		
		public int getSpeed (){
			return currentSpeed;
		}
		
	public Boolean setSpeed (int speed){
		if(speed < 0 || speed > MAX_SPEED){
			return false;
		}
		else{ 
			currentSpeed = speed;
			return true;
		}
	}

}
