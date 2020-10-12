package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {

		// TODO - START
		
		gpspoints = new GPSPoint[n];
		

		// TODO - SLUTT
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;

		// TODO - START
		if (antall < gpspoints.length) {
		gpspoints[antall] = gpspoint;
		antall = antall + 1;
		return true;
		}
		else {
			return false;
		}

		// TODO - SLUTT
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

		GPSPoint gpspoint;
		boolean inserted = false;

		// TODO - START
		
		int timeint = GPSDataConverter.toSeconds(time);
		double latitudeint = Double.parseDouble(latitude);
		double longitudeint = Double.parseDouble(longitude);
		double elevationint = Double.parseDouble(elevation);
		
		gpspoint = new GPSPoint(timeint, latitudeint, longitudeint, elevationint);
		
		if (antall < gpspoints.length) {
			gpspoints[antall] = gpspoint;
			antall = antall + 1;
			return true;
			}
			else {
				return false;
			}
		

		// TODO - SLUTT
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");


		for (int i = 0; i <= antall; i ++) {
			System.out.print(gpspoints[i]);
		}

		System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}
