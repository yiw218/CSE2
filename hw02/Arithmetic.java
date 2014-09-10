/////////////////////////////////////////
//Yifan Wong
//Arithmetic about shopping at walmart 

//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic

//  define a class

public class Arithmetic{
    
//  add main method
  public static void main(String[] args){
    
//  our input data

      int nSocks=3;//  Number of pairs of socks
      double sockCost$=2.58;//  Cost per pair of socks
//  ('$' is part of the variable name)
      int nGlasses=6;//  Number of drinking glasses
      double glassCost$=2.29;//  Cost per glass
      int nEnvelopes=1;//  Number of boxes envelopes
      double envelopeCost$=3.25;//cost per box of envelopes
      double taxPercent=0.06;//taxes rate

//  Expected output
      double totalsockcost, totalsocktax, totalglasscost, totalglasstax, totalenvelopecost, totalenvelopetax, totaltaxes, totalcostbeforetax, totalactuallypaid;
//  print out the output data.
    totalsockcost=nSocks*sockCost$;//the total cost of socks
    totalglasscost=nGlasses*glassCost$;// the total cost of glasses
    totalenvelopecost=nEnvelopes*envelopeCost$;//the total cost of envelopes
    totalsocktax=totalsockcost*taxPercent;//the tax of socks
    totalglasstax=totalglasscost*taxPercent;//the tax of glasses
    totalenvelopetax=totalenvelopecost*taxPercent;//the tax of envelopes
    System.out.println("This weekend, I bought socks, glasses and envelopes in Walmart. ");
    System.out.println("There are 3 pairs of socks, 6 drinking glasses, and 1 box of envelope in total.");
    System.out.println("The total cost of socks is " +totalsockcost+" dollars, and the tax of socks is " +totalsocktax+" dollars.");
    System.out.println("The total cost of glasses is "+totalglasscost+" dollars, and the tax of glasses is " +totalglasstax+" dollars.");
    System.out.println("The total cost of envelopes is "+totalenvelopecost+" dollars, and the tax of envelopes is " +totalenvelopetax+" dollars.");
    totaltaxes=(totalsockcost+totalglasscost+totalenvelopecost)*taxPercent;//the cost of total taxes
    System.out.printf("Total cost of taxes is %.2f dollars",totaltaxes);
    totalcostbeforetax=totalsockcost+totalglasscost+totalenvelopecost;// the total cost of three things
    System.out.println("Total cost before taxing is "+totalcostbeforetax+ "dollars");
    totalactuallypaid=totalcostbeforetax+totaltaxes;//total cost
    System.out.printf("Total cost is %.2f\n dollars",totalactuallypaid);
    
    
 
  }
}