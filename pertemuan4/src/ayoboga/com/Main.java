package ayoboga.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Double angka,ww;
        Scanner baca = new Scanner (System.in);
        String isi;
        System.out.println("Masukan angka : ");
        angka = baca.nextDouble();
        if ( angka > 1000)
        {
            System.out.println("kebesaran");
        }
        else
        {
            ww = angka * 3.785;
            System.out.println(angka + "dikonversi menjadi liter sebanyak " + ww);
        }
    }
}
