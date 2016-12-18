import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        printReverseArray(arr);
        printArray(arr);
    }


    public static void printReverseArray(int[] arr){
    	int start = 0;
    	int end = arr.length-1;
    	int temp;

    	while(start < end){
    		temp = arr[start];
    		arr[start] = arr[end];
    		arr[end] = temp;
    		start++;
    		end--;
    	}
    }

    public static void printArray(int[] arr){
    	for(int i = 0; i < arr.length; i++){
    		System.out.print(arr[i] + " ");
    	}
    }

}
