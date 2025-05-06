package Esercizio2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Scrivi un numero da 1 a 3 altrimenti succede il bordello");
        int numero= scanner.nextInt();
        switch (numero){
            case 1-> System.out.println("uno");
            case 2-> System.out.println("due");
            case 3-> System.out.println("tre");
            default -> System.out.println("SEI UNA BESTIA");
        }
    }
}
