package ayoboga.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //        Deklarasi
        Double tugas2 = 0.0, tugas = 0.0, score = 0.0;
        String mutu = "";

        Scanner scann = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Mutu Mahasiswa");
        System.out.print("Masukan Nilai Kehadiran : ");
        Double absent = scann.nextDouble();
        System.out.print("Masukan Nilai Tugas 1   : ");
        Double tugas1 = scann.nextDouble();
        System.out.print("Ada Tugas 2 ? (Y/N)     : ");
        String opt = scann.next();

        if (opt.equals("Y") || opt.equals("y")) {
            System.out.print("Masukan Nilai Tugas 2   : ");
            tugas2 = scann.nextDouble();
        }

        System.out.print("Masukan Nilai UTS       : ");
        Double uts = scann.nextDouble();
        System.out.print("Masukan Nilai UAS       : ");
        Double uas = scann.nextDouble();

        if (tugas2 == 0.0) {
            tugas = tugas1 / 2;
        } else {
            tugas = tugas1 + tugas2 / 2;
        }

        score = (0.25 * tugas) + (0.35 * uts) + (0.4 * uas);

        if (absent < 75 || score <= 58.0) {
            mutu = "E";
        } else if (score >= 80.0) {
            mutu = "A";
        } else if (score <= 79.0) {
            mutu = "B";
        } else if (score <= 68.0) {
            mutu = "C";
        } else if (score <= 59.0) {
            mutu = "D";
        }

        System.out.println("=================");
        System.out.println("Nilai Kehadiran Kamu : " + absent);
        System.out.println("Nilai Tugas 1        : " + tugas1);
        System.out.println("Nilai Tugas 2        : " + tugas2);
        System.out.println("Nilai UTS            : " + uts);
        System.out.println("Nilai UAS            : " + uas);
        System.out.println("Mutu Nilai           : " + mutu);
        System.out.println("=================");

    }
}
