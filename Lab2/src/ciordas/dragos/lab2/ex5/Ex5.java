package ciordas.dragos.lab1.ex5;

import java.util.Random;

public class Ex5 {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        Random rd = new Random(); // create random vector
        int[] arr = new int[10];

        System.out.println("Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
            System.out.print(arr[i] + " ");
        }


        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println(" After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}