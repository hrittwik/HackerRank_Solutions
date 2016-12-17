import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int T = in.nextInt();

    	for(int i = 0; i <= T; i++){
    		String S = in.next();
    		StringPrint(S);
    	}
    	in.close();

    }

    public static void StringPrint(String S){

    	char[] myCharArray = S.toCharArray();
    	String evenChar = "";
    	String oddChar = "";

    	for(int j = 0; j < S.length(); j++){

    		if(j % 2 == 0){
    			evenChar += myCharArray[j];
    		}else{
    			oddChar += myCharArray[j];
    		}
    	}
    	System.out.println(evenChar + " " + oddChar);
    }

}
