package sn.com.douane.utils;

import java.security.SecureRandom;

public class RandomSecureNumber {
	
	
	private static SecureRandom randomNumber;
	
	public RandomSecureNumber(){
		
	}

	public static synchronized SecureRandom getRandomNumber() {
		
		if(randomNumber == null){
			SecureRandom secureRandom = new SecureRandom();
			randomNumber = secureRandom;
		}
		return randomNumber;
	}

	public static void setRandomNumber(SecureRandom randomNumber) {
		RandomSecureNumber.randomNumber = randomNumber;
	}
	
	
	

}
