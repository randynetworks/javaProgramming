package ayoboga.com;

public class Main {

    public static void main(String[] args) {
//	for
        for (int i = 1; i <= 50; i++){
            System.out.println("Hasil dari " + i + "^" + i + "= " + i*i);
        }

//        while
        int x = 1;
        while (x <= 50){
            System.out.println("Hasil dari " + x + "^" + x + "= " + x*x);
            x++;
        }

//        do while
        int y = 1;
        do {
            System.out.println("Hasil dari " + y + "^" + y + "= " + y*y);
            y++;
        } while (y <= 50);
    }
}
