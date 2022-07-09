package com.example.workshop;

public class Selectionsort{
	
	public static void main(String[] args) {
		int a[]= {7,2,6,4,0};
        int n=a.length;
        int temp;
        for(int i=0;i<n-1;i++)
        {
            int min=a[i];
            int min_index=i;
            
            for(int j=i;j<n;j++)
        {
           if (min>a[j])
           {
               min=a[j];
               min_index=j;
            }
        }
        // swap(min&a[i])
            temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
		
	}
        System.out.print("Now the Array after Sorting is :\n");  
	       for( int i=0; i<n; i++)  
	       {  
	           System.out.print(a[i]+ "  ");  
	       }
	}
}
