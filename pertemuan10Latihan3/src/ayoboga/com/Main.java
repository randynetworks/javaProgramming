package ayoboga.com;

public class Main {

    public static void main(String[] args) {
        Test tc = new Test();
        tc.setLong(32768);
        tc.visibleFromEntirePackage = 3.1415926535;
        System.out.println(tc.getLong());
        System.out.println(tc.visibleFromEntirePackage);
    }
}
