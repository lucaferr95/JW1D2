package Esercizio3;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un stringa");
        String stringa = scanner.nextLine();

        String sMod = ""; //stringa vuota di appoggio

        while (!stringa.equals(":q")) {
            for (int i = 0; i < stringa.length(); i++) {
                if (i != stringa.length() - 1)
                    sMod = sMod + stringa.charAt(i) + ",";
                else {
                    sMod = sMod + stringa.charAt(i);

                }
            }
            System.out.println(sMod);


        }

    }}

