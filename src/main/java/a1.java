

	public boolean illegal(int maxSpeed) {
		if(this.speed > maxSpeed || this.privateCar == true) {
			return true;
		}
		return false;
	}



	public boolean allGood() {
		for(int i = 0; i< cars.length ; i++) {
			if(cars[i].illegal(maxSpeed) == true) {
				return false;
			}
		}
		return true;
	}




	
	public static int legalCities(CameraInfo[] cameras) {
		int sumGoodCities = 0;
		int count = 0;
		int deleteC = 0;
		for(int i = 0 ; i < cameras.length-1; i++) {
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

