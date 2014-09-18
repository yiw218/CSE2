/////////////////////////////////
//Yifan Wong
//hw03 FourDigit
//09/16/2014
//print the first four digit of the decimal

    import java.util.Scanner;
    public class FourDigits{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        System.out.print("Enter a double and print the four digits to the right of the decimal point- ");
        double x1=myScanner.nextDouble();
        int x2=(int) x1;
        double x3=x1-x2;
        int x4=(int)(x3*10000);
        System.out.println("the four digits are" +x4);
        
        System.out.print("Enter a double and print the four digits to the right of the decimal point- ");
        double x5=myScanner.nextDouble();
        int x6=(int) x5;
        double x7=x5-x6;
        int x8=(int)(x7*10000);
        System.out.println("the four digits are" +x8);
    }
    }
    