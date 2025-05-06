package Esercizio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class es1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String s= scanner.nextLine();
        System.out.println(stringaPariDispari(s));

        System.out.println("Scrivi un anno");
        int ab= scanner.nextInt();
        System.out.println(annoBisestile(ab));
    }
public static boolean stringaPariDispari (String s) {
    if (s.length() % 2 == 0) {

        return true;
    } else {
        return false;
    }}
public static boolean annoBisestile (int ab )
    {if ((ab%4==0 && ab%100!=0) || (ab%100==0&& ab%400==0)) {
    return true;
    } else {
        return false;
    }
    }
}
