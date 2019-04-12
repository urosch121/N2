package kurs;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Koliko clanova niza zelite: ");
		n = in.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("a[" + i + "] = ");
			a[i] = in.nextInt();
		}
		
		System.out.print("a: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		int k = 0;
		int j = n-1;
		
		while(k < j)
		{
			int t = a[k];
			a[k] = a[j];
			a[j] = t;
			k++;
			j--;
		}

		System.out.print("a: ");
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	
	}
	
	

}
