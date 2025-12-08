package javacode.MoureDevCampus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestJava01 {
    public static void main(String[] args) {
        int num;
        int totalNums;
        boolean esPar=false;
        Scanner sc = new Scanner(System.in);
        try{
System.out.println("Introduce un número");
        num = sc.nextInt();
        System.out.println("El número introducido es: "+num);
        if (num%2==0){
            esPar=true;
        }     
        System.out.println("¿El nº introducido es par? "+esPar);
        } catch (InputMismatchException e){
            System.out.println("Mete un nº pixita");
        }
        

        sc.close();
    }
}
