package com.company;
import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Height in Inches ");
        double height = sc.nextDouble();
        System.out.println("Weight in Pounds ");
        double weight = sc.nextDouble();

        double BMI = (weight/(height*height)) * 703;
        System.out.println("Your BMI is " + String.format("%.2f",BMI));


        if(BMI>=18.5 && BMI<=25){
            System.out.println("You are within the ideal weight range");
        }
        else if(BMI>25){
            System.out.println("You are Overweight");
        }
        else if(BMI<18.5){
            System.out.println("You are Underweight");
        }
    }
}
