package ayoboga.com;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    String name, npm, index = "";
    int quiz, kehadiran, uts, uas, mutu = 0;

    Scanner scan = new Scanner (System.in);

    System.out.print("Masukan Nama Lengkap : ");
    name = scan.nextLine();

    System.out.print("Masukan NPM : ");
    npm = scan.nextLine();

    System.out.print("Masukan Nilai Kehadiran : ");
    kehadiran = scan.nextInt();

    System.out.print("Masukan Nilai Quiz : ");
    quiz = scan.nextInt();

    System.out.print("Masukan Nilai UTS : ");
    uts = scan.nextInt();

    System.out.print("Masukan Nilai UAS : ");
    uas = scan.nextInt();

    kehadiran *= 0.2;
    quiz *= 0.2;
    uts *= 0.25;
    uas *= 0.35;

    mutu = kehadiran + quiz + uts + uas;

    if (mutu > 85) {
        index = "A";
    } else if (mutu > 69) {
        index = "B";
    } else if (mutu > 59) {
        index = "C";
    } else if (mutu > 44) {
        index = "D";
    } else if (mutu < 45) {
        index = "E";
    }
    System.out.println("Hi! " + name + ", " + "Index kamu = " + index);

    }
}
