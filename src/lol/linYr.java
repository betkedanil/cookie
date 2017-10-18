package lol;

import java.util.Scanner;

/**
 * Created by Student on 17.10.17.
 */
public class linYr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Задайте коэфициенты для 1-го уравнения: ");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        System.out.println("Задайте коэфициенты для 2-го уравнения: ");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        System.out.println("Получилось:");
        System.out.println(a1+"x+"+b1+"y="+c1);
        System.out.println(a2+"x+"+b2+"y="+c2);
        double y,x;
        x =(c1*b2-b1*c2)/(a1*b2-b1*a2);
        y=(a1*c2-c1*a2)/(a1*b2-b1*a2);
        System.out.println("x="+x+" y="+y);
    }
}
