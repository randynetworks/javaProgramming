package ayoboga.com;
import java.util.Scanner;

public class Main {

    public static double tambah(int a, int b){
        return a + b;
    }

    public static double kurang(int a, int b){
        return a - b;
    }
    public static double kali(int a, int b){
        return a * b;
    }
    public static double bagi(int a, int b){
        return a / b;
    }
    public static double akar(int a){
        return Math.sqrt(a);
    }

    public static void main(String[] args) {

//        Deklarasi
        Scanner scann = new Scanner(System.in);
        Double result;

        System.out.print(
                "Hi! \nSelamat datang di Calculator Sederhana\n" +
                        "(*) Untuk Perkalian\n(/) Untuk Pembagian \n(+) Untuk Penjumlahan " +
                        "\n(-) Untuk Pengurangan \n(a) Untuk Akar\n" +
                        "Masukan Aritmatika yang digunakan : "
        );
        var opt = scann.next();
        switch (opt){
            case "a" :
                System.out.print("Masukan Akar : ");
                int z = scann.nextInt();
                System.out.println("Hasil akar dari " + z + " adalah " + akar(z));
                break;
            default:
                System.out.print("Masukan Angka Pertama : ");
                int x = scann.nextInt();
                System.out.print("Masukan Angka Kedua   : ");
                int y = scann.nextInt();

                if (opt.equals("*")){
                    result = kali(x,y);
                } else if (opt .equals("/")){
                    result = bagi(x,y);
                } else if (opt .equals("-")) {
                    result = kurang(x,y);
                } else if (opt .equals("+")){
                    result = tambah(x,y);
                } else {
                    System.out.println("Operator yang dimasukan tidak Valid!");
                    break;
                }
                System.out.println("Hasil dari " + x + " " + opt + " " + y + " adalah " + result);
        }
    }
}
