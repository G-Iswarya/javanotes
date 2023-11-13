package kvaluentTest;

import java.util.*;

public class Q4_stepstoDestination {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,maxindex=0, maxi=0;
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int count=0;
		int[] arr = new int[len];
		for(i=0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
		i = 0;
		while(i<arr.length-1)
		{ 
		maxi = 0;
		if(i+arr[i]>=len)
		{
		    count++;
		    break;
		}
		for(j=i+1;j<=i+arr[i];j++)
		{
			if(maxi<arr[j])
			{
			    maxi = arr[j];
			    maxindex = j;
			}
		} 
		i = maxindex;
		count++;
		}
		System.out.println(count);}}
