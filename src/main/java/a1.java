
public class CarInfo {
	private String id;
	private boolean privateCar;
	private int speed;
	
	public boolean illegal(int maxSpeed) {
		if(this.speed > maxSpeed || this.privateCar == true) {
			return true;
		}
		return false;
	}
}


public class CameraInfo {
	
	private int city;
	private int maxSpeed;
	private CarInfo[] cars;
	
	
	public int getCity() {
		return city;
	}
	
	public boolean allGood() {
		for(int i = 0; i< cars.length ; i++) {
			if(cars[i].illegal(maxSpeed) == true) {
				return false;
			}
		}
		return true;
	}
}


public class Main {
	
	public static int legalCities(CameraInfo[] cameras) {
		int sumGoodCities = 0;
		int count = 0;
		int deleteC = 0;
		for(int i = 0 ; i < cameras.length; i++) {
			if(cameras[i].allGood() == true) {
				sumGoodCities++;
				count++;
				for(int j = count+1 ; j <cameras.length ; j++) {
					if(cameras[i].getCity() == cameras[j].getCity()) {
						deleteC = deleteC + 1;
					}
				}
			}
			
		}
		return (sumGoodCities - deleteC);
	}
}
