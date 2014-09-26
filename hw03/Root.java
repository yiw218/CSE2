/////////////////////////////////
//Yifan Wong
//hw03 Root
//09/16/2014
//import
        import java.util.Scanner;   //define a class
        public class Root{  //define a method
            public static void main(String[] args) {
                
                Scanner myScanner;
                myScanner=new Scanner( System.in );
                System.out.print("Enter a double, and print out the cube root- ");
                
                double input=myScanner.nextDouble();    //input
                double Guess, output;
                Guess=input/3;
                Guess=(Guess*Guess*Guess+Input)/(3*Guess*Guess);//substitution
                Guess=(2*Guess*Guess*Guess+Input)/(3*Guess*Guess);
                Guess=(2*Guess*Guess*Guess+Input)/(3*Guess*Guess);
                Guess=(2*Guess*Guess*Guess+Input)/(3*Guess*Guess);
                Guess=(2*Guess*Guess*Guess+Input)/(3*Guess*Guess);
                output=Guess*Guess*Guess;
                System.out.print("the cube root is "+Guess+":"+Guess+"*"+Guess+"*"+Guess+"="+output+");
            }
        }
       
            