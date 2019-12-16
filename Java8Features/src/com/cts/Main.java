package com.cts;

import java.util.Scanner;

interface AgeCalculator
{
       public void ageCalc(int age); 
}
class Main
{
       public static void main(String args[])
       {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter Age of Candidate : ");
              int age=sc.nextInt();
              AgeCalculator calculate=(x)->{
                     if(age>=18)
                     {
                           System.out.println("Eligible");
                     }
                     else
                     {
                           System.out.println("Not Eligible");
                     }
                     
              };
              sc.close();
              calculate.ageCalc(age);
       }
}

