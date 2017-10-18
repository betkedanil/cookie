package lol;

import java.util.Scanner;

public class Taylor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t,elem = 1, tx, x;
        int f=1,count=1;
        System.out.println("Введите точность вычислений");
        t =  sc.nextDouble();
        System.out.println("Введите значение x");
        x =  sc.nextDouble();
        tx=x;
        do{
            elem=elem+tx/f;
            tx=Math.pow(tx,count);
            f=f*count;
            count++;
        }while((tx/f)>=t);
        System.out.println("Значение ряда"+elem);
    }     
}
