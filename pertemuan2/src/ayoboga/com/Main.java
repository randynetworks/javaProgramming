package ayoboga.com;

public class Main {

    public static void main(String[] args) {
//        CASE
        int st = 1;
        String serve = null;
        System.out.println("1. Nasi Goreng " +
                "\n2. Nasi Pandang" +
                "\n3. Nasi Rames");
        System.out.print("Pilihan Anda: ");

        switch (st) {
            case 1 :
                serve = "Nasi Goreng siap dihidangkan";
                break;
            case 2 :
                serve = "Nasi Pandang siap dihidangkan";
                break;
            case 3 :
                serve = "Nasi Rames siap dihidangkan";
                break;
            default :
                serve = "Engga ada yang di serve, kamu belum milih";
                break;
        }
        
        System.out.println(serve);
        



//      IF statement 1
//        int x;
//        x = -2;
//        if (x < 0) {
//            System.out.println ("ABCD");
//            System.out.println ("EFGH");
//            System.out.println ("XYZ");
//            }

    //  IF ELSE IF ELSE
//        char firstInitial = 'a';
//        if (firstInitial == 'a') {
//            System.out.println("Nama anda pasti Asep!");
//        }else if (firstInitial == 'b') {
//            System.out.println("Nama anda pasti Brodin!");
//        }else if (firstInitial == 'c') {
//            System.out.println("Nama anda pasti Cecep!");
//        }else {
//            System.out.println("Nama anda tidak terkenal!");
//        }
    }
}
