package ayoboga.com;

import java.util.Scanner;

public class Main {

    //Exchange Shorting Function
    void ExchangeSort (int arr[])
    {
        int i, j, temp;
        for ( i = 0; i < arr.length - 1; i ++ )
        {
            for ( j = i + 1; j < arr.length; j ++ )
            {
                if( arr[ i ] > arr[ j ] )
                {
                    // Pertukaran
                    temp = arr[ i ];
                    arr[ i ] = arr[ j ];
                    arr[ j ] = temp;
                }
            }
        }
    }

    //Insertion Shorting Function
    void InsertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Shorting function
    void SelectionSort(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_index = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            // tukar yang paling minimum ke index awal
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Short Function
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // menukar arr[j+1] dan arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    // Cetak Array yang tersusun
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Main ob = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("======== SHORTING MENGGUNAKAN JAVA =========");
//        System.out.println("============================================");
//        System.out.print("Masukan total Array : ");
//        int total = sc.nextInt();
//        int angka[] = new int[total];
//        System.out.println("============================================");
//
//        for(int i=0; i<total;i++)
//        {
//            System.out.print("Masukan angka ke-" + (i + 1) + " : ");
//            angka[i]=sc.nextInt();
//        }
//        System.out.println("Angka disimpan!");
//        System.out.println("============================================");
//        System.out.println("JENIS SHORTING YANG TERSEDIA");
//        System.out.println("(1) Bubble Sort \t|\t (2) Selection Sort\n(3) Exchange Sort \t|\t (4) Insertion Sort");
//        System.out.println("*)Pilih 1 angka saja ya...");
//        System.out.println("============================================");
//        System.out.print("Masukan jenis sortingnya : ");
//        String jenis = sc.next();
//        String titleSorting = "";
//
//        switch (jenis) {
//            case "1" :
//                // Bubble Sort
//                ob.bubbleSort(angka);
//                titleSorting = "Bubble Sort";
//                break;
//
//            case "2" :
//                // Selection Sort
//                ob.SelectionSort(angka);
//                titleSorting = "Selection Sort";
//                break;
//
//            case "3" :
//                // Exchange Sort
//                ob.ExchangeSort(angka);
//                titleSorting = "Exchange Sort";
//                break;
//
//            case "4" :
//                // Insertion Sort
//                ob.InsertionSort(angka);
//                titleSorting = "Insertion Sort";
//                break;
//        }
//        System.out.println("============================================");
//        System.out.println("================== OUTPUT ==================");
//        System.out.println("Sebelum Tersusun :");
//        ob.printArray(angka);
//
//        System.out.println("Setelah Tersusun pake "+ titleSorting +" :");
//        ob.printArray(angka);
//        System.out.println("=============== TERIMA KASIH ===============");
//        System.out.println("============================================");


//        PILIH SHORTING TERLEBIH DAHULU

        System.out.println("********************************************");
        System.out.println("Shorting nya apa ?");
        System.out.println("(1) Bubble Sort \t|\t (2) Selection Sort\n(3) Exchange Sort \t|\t (4) Insertion Sort");
        System.out.println("********************************************");
        System.out.print("Masukan jenis sorting : ");
        String jenis = sc.next();
        String titleSorting = "";
        System.out.println("********************************************");
        System.out.print("Masukan total Array : ");
        int total = sc.nextInt();
        int angka[] = new int[total];
        for(int i=0; i<total;i++)
        {
            System.out.print("Masukan angka ke-" + (i + 1) + " : ");
            angka[i]=sc.nextInt();
        }
        System.out.println("****************** OUTPUT ******************");
        System.out.println("Sebelum Tersusun :");
        ob.printArray(angka);
        switch (jenis) {
            case "1" :
                // Bubble Sort
                ob.bubbleSort(angka);
                titleSorting = "Bubble Sort";
                break;

            case "2" :
                // Selection Sort
                ob.SelectionSort(angka);
                titleSorting = "Selection Sort";
                break;

            case "3" :
                // Exchange Sort
                ob.ExchangeSort(angka);
                titleSorting = "Exchange Sort";
                break;

            case "4" :
                // Insertion Sort
                ob.InsertionSort(angka);
                titleSorting = "Insertion Sort";
                break;
        }


        System.out.println("Setelah Tersusun dengan "+ titleSorting +" :");
        ob.printArray(angka);
        System.out.println("********************************************");

    }
}
