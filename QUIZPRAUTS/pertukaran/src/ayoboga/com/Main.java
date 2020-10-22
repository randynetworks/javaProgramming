package ayoboga.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Deklarasi
        List<Integer> vector = new ArrayList<Integer>();
        Scanner scann = new Scanner(System.in);


        // List
        System.out.print("Masukan total List nya : ");
        int total = scann.nextInt();

        for (int i = 0; i <= total - 1; i++){
            System.out.print("Masukan Angka ke-" + (i + 1) + " : ");
            int angka = scann.nextInt();
            vector.add(angka);
        }

        System.out.println("Sebelum data di Swap: " + vector);
        Collections.swap(vector, 0, total - 1);
        System.out.println("\nSetelah Data di Swap: " + vector);
    }
}
