package ayoboga.com;

public class Main {

    public static void main(String[] args) {
//        CASE
        int st = 1;
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Pandang");
        System.out.println("3. Nasi Rames");
        System.out.print("Pilihan Anda: ");

        switch (st) {
            case 1 :
                System.out.println("Nasi Goreng siap dihidangkan");
            case 2 :
                System.out.println("Nasi Pandang siap dihidangkan");
            case 3 :
                System.out.println("Nasi Rames siap dihidangkan");
        }


//      IF statement 1
        int x;
        x = -2;
        if (x < 0) {
            System.out.println ("ABCD");
            System.out.println ("EFGH");
            System.out.println ("XYZ");
            }

    //  IF ELSE IF ELSE
        char firstInitial = 'a';
        if (firstInitial == 'a') {
            System.out.println("Nama anda pasti Asep!");
        }else if (firstInitial == 'b') {
            System.out.println("Nama anda pasti Brodin!");
        }else if (firstInitial == 'c') {
            System.out.println("Nama anda pasti Cecep!");
        }else {
            System.out.println("Nama anda tidak terkenal!");
        }
    }
}
