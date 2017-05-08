import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be    named Solution. */
    	Scanner in = new Scanner(System.in);
    	int num = in.nextInt();
    	
    	String decimalToBinary = decimalToBinary(num);
    	System.out.println(numberOfOne(decimalToBinary));
    	in.close();
    }
    
    public static String decimalToBinary(int n){
    	if(n == 0){
    		return "0";
    	}
    	String binary = "";
    	
    	while(n > 0){
    		int remainder = n % 2;
    		n = n/2;
    		binary = remainder + binary;
    	}
    	return binary;
    	
    }
    
    public static int numberOfOne(String s){
    	char one = '1';
    	char[] binary = s.toCharArray();
    	int count = 0, consecutive = 0;
    	
    	for(int i = 0; i < binary.length; i++){
    		if(binary[i] == one){
    			count ++;
    			if(count > consecutive){
    				consecutive = count;
    			}
    		} else {
    			count = 0;
    		}
    	}
    	return consecutive;
    }
}
