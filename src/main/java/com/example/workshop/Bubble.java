package com.example.workshop;

public class Bubble
{
	public static void main (String args[])
	{
		int a[]= {7,2,6,4,0};
        int n=a.length;
        int temp;
        for(int i=0;i<n;i++)
        {	
        	for (int j=0;j<n-1;j++)
        	{
        		if(a[j]>a[j+1])
        		{
        			temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
        	}
        }
        System.out.println("Now the Array after Sorting is :\n");  
	       for( int i=0; i<n; i++)  
	       {  
	           System.out.print(a[i]+ "  ");  
	       }
	}
}
