package org.eclipse.om2m.sample.test_ipe.model;

public class test_ipeModel {
	
	// init
	private static boolean AIRCON = false;
	private static int AIRCON_temp = 25;
	private static int AIRCON_fan = 1;
	
	private test_ipeModel(){
	}
	
	// Sets the direct current Air Conditioner state
	public static void setAirConON() {
		// write your code here
		AIRCON = true;
	}
	
	public static void setAirConOFF() {
		// write your code here
		AIRCON = false;
	}
	
	public static boolean setTempPlus() {
		if(AIRCON == false)
			return false;
		AIRCON_temp++;
		return true;
	}
	
	public static boolean setTempMinus() {
		// write your code here
		if(AIRCON == false)
			return false;
		AIRCON_temp--;
		return true;
	}
	
	public static boolean setFanPlus() {
		if(AIRCON_fan == 3 || AIRCON == false)
			return false;
		else {
			AIRCON_fan++;
			return true;
		}
	}
	
	public static boolean setFanMinus() {
		// write your code here
		if(AIRCON_fan == 1 || AIRCON == false)
			return false;
		else {
			AIRCON_fan--;
			return true;
		}
	}
	
	// Gets the direct current Air Conditioner state

	public static boolean getAirConValue() {
		return AIRCON;
	}
	
	public static int getAirConTemp() {
		return AIRCON_temp;
	}
	
	public static int getAirConFan() {
		return AIRCON_fan;
	}
}