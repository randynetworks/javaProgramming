package ayoboga.com;

public class Main {

    static void printArray(int[] array){

        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int[] array)
    {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {  System.out.println("Sort Pass Number "+(i+1));
            for(int j=1; j < (n-i); j++)
            {
                System.out.println("Membandingkan "+ array[j-1]+ " dan " + array[j]);
                if(array[j-1] > array[j])
                {
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j]  + " Lebih besar dari " + array[j-1]);
                    System.out.println("Elemen Swapping: Array Baru Setelah Swap");
                    printArray(array);
                }
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        int arr[] ={10, 15, 25, 19};
        System.out.println("---Array sebelum Bubble Sort---");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("---Array setelah Bubble Sort---");
        printArray(arr);
    }
}
