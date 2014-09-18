/////////////////////////////////
//Yifan Wong
//hw03 Bicycle
//09/16/2014
//import
        import java.util.Scanner;    //define a class
        public class Bicycle { //define a method
            public static void main(String[] args) {
            Scanner myScanner;
            myScanner= new Scanner( System.in );
            System.out.println("Enter the number of seconds (an integer): ");
            int secsTrip=myScanner.nextInt();
            System.out.println("Enter the number of counts  (an integer): ");
            int countsTrip=myScanner.nextInt();
            double wheelDiameter=27.0,
            PI=3.14159, //the diameter in inches and PI
        	feetPerMile=5280,  //5280 feet in 1 mile
  	        inchesPerFoot=12,   //12 inches in 1 foot
  	        secondsPerMinute=60,  //60 seconds in 1 minute
  	        minutesPerHour=60;  //60 minutes in 1 hour
  	        double distance, time, averageMph;
  	        time=secTrip/secondsPerMinutes;
  	        distance=countsTrip*wheelDiameter*PI/inchesPerfoot/feetPerMile; //distance inmiles
  	        averageMph=distance/time*minutesPerHour;    //average Mph
  	        System.out.println("The distance is "+distance+" miles, and last for "+time+" minutes.");
  	        System.out.println("the average mph is "+averageMph+".");
  	        
            }   //end
        }   //end