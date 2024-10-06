
public class CarInfo {
	private String id;
	private boolean privateCar;
	private int speed;
	
	public CarInfo(String id, boolean privateCar, int speed) {
		this.id = id;
		this.privateCar = privateCar;
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getId() {
		return id;
	}
	public boolean isPrivateCar() {
		return privateCar;
	}
	
	public boolean illegal(int maxSpeed) {
		if(this.speed > maxSpeed || this.privateCar == true) {
			return true;
		}
		return false;
	}
}
