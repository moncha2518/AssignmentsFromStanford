import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;

public class FlightPlanner extends ConsoleProgram{
	private HashMap<String,ArrayList<String>> flight;
	private ArrayList<String> city;
	
	private ArrayList<String>  getDestinations(String sourceCity){
		return flight.get(sourceCity);
	}
	public void run() {
		showHeading();
		readData("/Users/user/Desktop/MeritJavaClass/Assignment/Assignment7/flights.txt");
		String sourceCity=readLine("Enter the starting city: ");
		ArrayList<String> trip = new ArrayList<String>();
		println(" source city "+sourceCity);
		trip.add(sourceCity);
		String currentCity=sourceCity;
		
		while (true) {
			String nextCity=getNextCity(currentCity);
			trip.add(nextCity);
			if (nextCity.equals(sourceCity)) break;
			currentCity=nextCity;
			
		}
		printTrip(trip);
	}
	public void showHeading() {
	    
		println("Welcome to Flight Planner!");
		println("Here's a list of all the cities in our database: ");
		println("  San Jose");
		println("  San Francisco");
		println("  Anchorage");
		println("  New York");
		println("  Honolulu");
		println("  Denver");
		println("Let's plan a round-trip route!");
		
		
	}
	
	private void readData(String fileName) {
		flight= new HashMap<String,ArrayList<String>>();
		city=new ArrayList<String>();
		
		try {
			BufferedReader bf=new BufferedReader(new FileReader(fileName));
			while (true) {
				String data=bf.readLine();
				if (data==null) break;
				if (data.length()!=0) {
					getFlight(data);
				}
			}
		
			bf.close();
			
		} catch (IOException i) {
			throw new ErrorException(i);
		}
		
	}

	private void getFlight(String data) {
		int deli=data.indexOf("->");
		String startCity=data.substring(0,deli);
		String endCity=data.substring(deli+2);
		recordCity(startCity);
		recordCity(endCity);
	}
	
	private void recordCity(String sCity) {
		if (!city.contains(sCity)) {
			city.add(sCity);
			flight.put(sCity, new ArrayList<String>());
			
			
		}
	
	}
	private String getNextCity(String city) {
		ArrayList<String> destinations=getDestinations(city);
		String nextCity=null;
		while (true) {
			println("From "+city+" you can fly directly to: ");
			for (int i=0;i<destinations.size();i++) {
				String citys=destinations.get(i);
				println(""+citys);
				String str="Where do you want to go from "+city+ "? ";
				nextCity=readLine(str);
				if (destinations.contains(nextCity)) break;
				println("You can't get to that city by a direct flight.");
			}
			return nextCity;
		}
	}
	private void printTrip(ArrayList<String> route) {
		println("The route you have chosen is: ");
		for (int i=0;i<route.size();i++) {
			if (i>0) print (" ->");
			print(route.get(i));
		}
	}
}
