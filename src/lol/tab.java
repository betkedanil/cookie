package lol;

import java.util.Scanner;

public class tab {
    public static void main(String[] args) {
        System.out.println("Задайте нижний предел табуляции: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Задайте верхний предел табуляции: ");
        double b = sc.nextDouble();
        System.out.println("Задайте шаг табуляции: ");
        double c = sc.nextDouble();
        double D=a,s=0;
        do{
            s=Math.sin(D);
            System.out.println("sin(x)=: "+s);
            D=D+c;
        }while(D<=b);
    }
}
