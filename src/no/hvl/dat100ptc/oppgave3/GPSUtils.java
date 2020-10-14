package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max; 
		
		max = da[0];
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min;

		// TODO - START
		min = da[0];

	for (double d: da) {
		if (d < min) {
			min = d;
		}
		
	}
	return min;

		// TODO - SLUT

	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

		// TODO - START
		
		double[] latitudes = new double[gpspoints.length];
		
		for(int i = 0; i <= gpspoints.length; i++) {
			latitudes[i] = gpspoints[i].getLatitude();
		}
		return latitudes;
		
		// TODO - SLUTT
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		// TODO - START

		double[] longitudes = new double[gpspoints.length];
		
		for(int i = 0; i <= gpspoints.length; i++) {
			longitudes[i] = gpspoints[i].getLongitude();
		}
		return longitudes;
		
		// TODO - SLUTT

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double d;
		double latitude1, longitude1, latitude2, longitude2, latdif, longdif;
		double a, c;

		// TODO - START

		latitude1 = toRadians(gpspoint1.getLatitude());
		latitude2 = toRadians(gpspoint2.getLatitude());
		longitude1 = toRadians(gpspoint1.getLongitude());
		longitude2 = toRadians(gpspoint2.getLongitude());
		latdif = latitude2 - latitude1;
		longdif = longitude2 - longitude1;
		a = getExponent(sin(latdif/2)) + cos(latitude1)*cos(latitude2) * getExponent(sin((longdif/2)));
		c = 2 * atan2(sqrt(a), sqrt(1-a));
		d = R*c;
		return d;
		
		

		

		// TODO - SLUTT

	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int secs;
		secs = 2;
		double speed;

		// TODO - START

		double distance1 = distance(gpspoint1, gpspoint2);
		speed = distance1 / secs * 3.6;
		
		return speed;
		// TODO - SLUTT

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";
		
		int hr, min, sec;
		// TODO - START
		
		sec = secs % 3600;
		sec = sec + (sec % 60);
		hr = secs / 360;
		min = (secs % hr) / 60;
		
		timestr = hr + TIMESEP + min + TIMESEP + sec;
		
		return timestr;
		
		// TODO - SLUTT

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str1, str2;

		// TODO - START

		str1 = String.format("%.2f", d);
		str2 = String.format("% 10d", str1);
		return str2;
				
		// TODO - SLUTT
		
	}
}
