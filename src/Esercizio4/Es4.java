package Esercizio4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Scrivi un numero");
        int num= scanner.nextInt();
        for(int i=num; i>=0;i--) {
        System.out.println(i);}
    }
}
