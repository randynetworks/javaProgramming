package ayoboga.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        deklarasi
        Scanner scann = new Scanner(System.in);
        System.out.print("Masukan Bilangan Angka : ");
        int input = scann.nextInt();

        for (int i = input; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
