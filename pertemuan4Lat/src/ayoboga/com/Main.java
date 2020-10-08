package ayoboga.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x, y, result = 0;
	String opt;
	Scanner xinput = new Scanner (System.in);
	Scanner yinput = new Scanner (System.in);
	Scanner scan = new Scanner (System.in);

	System.out.print("Masukan angka pertama : ");
	x = xinput.nextInt();
	System.out.print("Masukan angka kedua : ");
	y = yinput.nextInt();
	System.out.print("Masukan Operator : ");
	opt = scan.next();

	if (opt.equals("x")){
		result = x * y;
	} else if (opt.equals("/")){
		result = x / y;
	} else if (opt.equals("+")){
		result = x + y;
	} else if (opt.equals("-")){
		result = x - y;
	}


	if (result > 0){
		System.out.print("Hasil dari " + x + opt + y + "= " + result + ", adalah bilangan positif");
	} else if (result < 0){
		System.out.print("Hasil dari " + x + opt + y + "= " + result + ", adalah bilangan megatif");
	} else {
		System.out.print("Hasil dari " + x + opt + y + "= " + result + ", adalah bilangan netral");
	}

    }
}
