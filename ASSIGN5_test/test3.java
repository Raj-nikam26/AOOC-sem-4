package ASSIGN5_test;
import java.util.Scanner;
import ASSIGN5.MathFunction;

public class test3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any decimal number: ");
            double num = sc.nextDouble();
            MathFunction mf = new MathFunction();
            mf.Floor(num);
            mf.Ceil(num);
            mf.Round(num);
        }

}

/*
output:
Enter any decimal number: 25.50
Floor : 25.0
Ceil:26.0
Round of :26

 */