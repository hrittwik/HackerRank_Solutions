import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        ArrayList<Integer> sumOfhg = new ArrayList<Integer>();
        // loops over the 2d array and collects hourglass sum
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
            	sumOfhg.add(hourGlasses(i, j, arr));
            }
        }
        System.out.print(Collections.max(sumOfhg));
        //System.out.print(sumOfhg);

    }
    
    //loops over the hourglass and returns sum of the values
    public static int hourGlasses(int k, int l, int[][] a){
    	int sum = 0;
    	for(int m = k; m < k+3; m++){
    		for(int n = l; n < l+3; n++ ){
    			
    			if( m == k+1 ){
    				sum += a[m][n+1];
    				//System.out.print(a[m][n+1]);
    				break;
    			}else{
    				sum+= a[m][n];
    				//System.out.print(a[m][n]);
    			}
    			
    		}
    		//System.out.println(sum);
    		
    	}
    	return sum;
    }



}

