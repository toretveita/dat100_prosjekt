package no.hvl.dat100ptc.oppgave1;


public class GPSPoint {
	
	int GPStime;
	double GPSlatitude;
	double GPSlongitude;
	double GPSelevation;
	

		
	public GPSPoint(int time, double latitude, double longitude, double elevation) {
		GPStime = time;
		GPSlatitude = latitude;
		GPSlongitude = longitude;
		GPSelevation = elevation;
	}

	public int getTime() {
		return GPStime;
	}

	public void setTime(int time) {
		GPStime = time;

	}

	public double getLatitude() {
		
		return GPSlatitude;
		
	}

	public void setLatitude(double latitude) {

		GPSlatitude = latitude;
		
	}

	public double getLongitude() {
		
		return GPSlongitude;
		
	}

	public void setLongitude(double longitude) {
		
		GPSlongitude = longitude;
		
	}

	public double getElevation() {
		
		return GPSelevation;
		
	}

	public void setElevation(double elevation) {
		
		GPSelevation = elevation;
		
	}
	
	public String toString() {
		
		String str;
		
		str = GPStime + " (" + GPSlatitude + "," + GPSlongitude + ") " + GPSelevation + "\n";
		return str;
		
	}
}
