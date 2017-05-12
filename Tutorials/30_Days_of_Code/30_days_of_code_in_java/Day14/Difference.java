import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	// Add your code here
    Difference(int[] a){
        this.elements = a;
    }
    
    public int computeDifference(){
        int n=elements.length;
        int min=100;
        int max=1;

        for(int i=0;i<n;++i)
        {
            if(elements[i]<min){min=elements[i];}
            if(elements[i]>max){max=elements[i];}
        }
        return maximumDifference=max-min;
    }
    
}