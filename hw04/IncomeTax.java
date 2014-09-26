///////////////////////////////////
//Yifan Wong
//hw04 IncomeTax
//09/23/2014
//a program that prompts the user to enter an int that gives the thousands of dollars of income 
//and then writes out the amount of tax on the income
    
    import java.util.Scanner;
    //define a class
    public class IncomeTax {
        //define a method
        public static void main(String[] args) {
            //begin
            Scanner S;
            S=new Scanner( System.in );
            System.out.print("Enter an int giving the number of thousands- ");//input
            if(S.hasNextInt()) {
                int thousands;
                thousands=S.nextInt();
                if(thousands>0) {
                    double tax, income;
                    income=thousands*1000;
                    if (thousands<20) {
                        tax=income*0.05;
                        System.out.println("The tax rate on $"+(int)income+" is 5%, and tax is $"+(int)tax);
                    }
                    else if (thousands>=20&&thousands<40) {
                        tax=income*0.07;
                        System.out.println("The tax rate on $"+(int)income+" is 7%, and tax is $"+(int)tax);
                    }
                    else if (thousands>=40&&thousands<78) {
                         tax=income*0.12;
                        System.out.println("The tax rate on $"+(int)income+" is 12%, and tax is $"+(int)tax);
                    }
                    else if (thousands>=78){
                        tax=income*0.14;
                        System.out.println("The tax rate on $"+(int)income+" is 14%, and tax is $"+(int)tax);
                    }
                    }
                    else {
                        System.out.println("You did not enter a positive int.");
                        return;
                    }
                }
                    else {
                        System.out.println("You did not enter an int.");
                        return;
                    }
            }
        } 