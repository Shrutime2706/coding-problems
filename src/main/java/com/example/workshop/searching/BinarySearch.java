package com.example.workshop.searching;

public class BinarySearch {
	public static void main(String args[])
	{
		int a[]= {1,3,5,7,9};
		int target=9;
		int s=0;
		int l=a.length-1;
		
		while(s<=l)
			
		{
			int mid=(s+l)/2;
			if(a[mid]==target)
			{
			System.out.print(mid);
			break;
			}
			else if(a[mid]>target)
			{
				l=mid-1;
			}
			else if(a[mid]<target)
			{
				s=mid+1;
			}
			
			
		}}}
