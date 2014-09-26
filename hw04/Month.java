///////////////////////////////////
//Yifan Wong
//hw04 Month
//09/23/2014
//a program that prompts the user to enter an integer for the month 
    import java.util.Scanner;
    //define a class
    public class Month {
        public static void main(String[] args) {
            //begin
            Scanner S;
            S=new Scanner( System.in );
            System.out.print("Enter an int that gives the number of the month (1-12) ");
            if (S.hasNextInt()) {
                int month=S.nextInt();
                if (month<=12&&month>=1) {
                    if (month==1||month=3)||month=5)||month=7)||month=8)||month=10)||month=12) {
                        System.out.println("It has 31 days");
                }
                else if (month==4||month==6||month==9|month==11) {
                    System.out.println("It has 30 days")
                }
                else if (month==2) {
                    System.out.print("Enter an int giving the year");
                    if (S.hasNextInt()) {
                        int year=S.nextInt();
                        int d;
                        d=year*4;
                        if (d==0) {
                            if (year%100==0&&year%400=0) {
                                System.out.println("it has 28 days");
                            }
                            else {
                                System.out.println("it has 29 days");
                            }
                        }
                        else {
                            System.out.println("it has 28 days");
                        }
                    }
                    else {
                        System.out.ptinyln("error");
                        return;
                    }
                }
            }
            else {
                System.out.println("error");
                return;
            }
        }//end of method
    }//end of class