package method;

import java.util.Scanner;

public class Binary_Search_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arry= {10,12,20,33,35,50,55,65,80,90};
				System.out.print("Enter Search Data:");
				int data=sc.nextInt();
				search(arry,data);
		}

	private static void search(int[] arry, int data) {
		// TODO Auto-generated method stub
		int first=0;
		int last=arry.length-1;
		int mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(data<arry[mid]) {
				last=mid-1;
			}
			else if(data>arry[mid])
			{
				first=mid+1;
			}
			else {
				System.out.println(data+ " found at"+mid);
				break;
			}
		}
		if(first>last) {
			System.out.println(data+ " not found in a given array");
		}
	}
	}


