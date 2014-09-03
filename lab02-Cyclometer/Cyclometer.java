/////////////////////////////////
//Yifan Wong
//Lab02-Cyclometer
//09/03/2014
//records two kinds of data, the time elapsed in seconds, and the number of rotations of the front wheel during that time.
//For two trips, given time and rotation count, the program should
//print the number of minutes for each trip, print the number of counts for each trip
//print the distance of each trip in miles, and print the istance for the two trips combined
//
public class Cyclometer {
        // main method requred for every Java program
        public static void main (String[] args) {
            int secsTrip1=480;  //the number of secs for trip 1
	        int secsTrip2=3220;  //the number of secs for trip 2
        	int countsTrip1=1561;  //the number of counts for trip 1
	        int countsTrip2=9037; //the number of counts for trip 2
	        double wheelDiameter=27.0,
        	PI=3.14159, //the diameter in inches and PI
        	feetPerMile=5280,  //5280 feet in 1 mile
  	        inchesPerFoot=12,   //12 inches in 1 foot
  	        secondsPerMinute=60;  //60 seconds in 1 minute
	        double distanceTrip1, distanceTrip2,totalDistance;
 
	        System.out.println("Trip 1 took "+
       	    (secsTrip1/secondsPerMinute)+" minutes and had "+
       	    countsTrip1+" counts.");
	        System.out.println("Trip 2 took "+
       	    (secsTrip2/secondsPerMinute)+" minutes and had "+
       	    countsTrip2+" counts.");
	        distanceTrip1=countsTrip1*wheelDiameter*PI;
    	    // Above gives distance in inches
    	    //(for each count, a rotation of the wheel travels
    	    //the diameter in inches times PI)
	        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
	        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	        totalDistance=distanceTrip1+distanceTrip2;
	        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	        System.out.println("Trip 2 was "+distanceTrip2+" miles");
	        System.out.println("The total distance was "+totalDistance+" miles");

        } //end of main method
} //end of class
