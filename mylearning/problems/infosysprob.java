package problems;
import java.util.*;
import java.io.*;

public class infosysprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. rpg game monster killing game
		       Scanner sc = new Scanner(System.in);
		       int n,power,j,i,t,count=0;
		       n = sc.nextInt();
		       power = sc.nextInt();
		       int[] pow = new int[n];
		       int[] bonus = new int[n];
		       for(i=0;i<n;i++)
		       {
		           pow[i] = sc.nextInt();
		       }
		       for(i=0;i<n;i++)
		       {
		           bonus[i] = sc.nextInt();
		       }
		       for(i=0;i<n;i++)
		       {
		           for(j=i+1;j<n;j++)
		           {
		               if(pow[i]>pow[j])
		               {
		                   t = pow[i];
		                   pow[i] = pow[j];
		                   pow[j] = t;
		                   t = bonus[i];
		                   bonus[i] = bonus[j];
		                   bonus[j] = t;
		               }
		           }
		       }
		       for(i=0;i<n;i++)
		       {
		           if(pow[i]<=power)
		           {
		               power+=bonus[i];
		              count+=1;
		           }
		           else
		           {
		               break;
		           }
		       }
		      System.out.println(count);
		      
		      
		      //2. longest increasing subsequence
		      
		      int n1 = sc.nextInt();
		       int c=1;
		       int i1=0,flag=0;
		       int a[] = new int[n];
		       ArrayList<Integer> count1 = new ArrayList<Integer>(n);
		       for(i1=0;i1<n;i1++)
		       {
		           a[i1] = sc.nextInt();
		       }
		       if(a[0]<=a[1])
		       {
		           c = 1;
		       }
		       i=1;
		       while(i1<n)
		       { flag=0;
		           while(i1<n && a[i1-1]<a[i1])
		           {
		               flag = 1;
		               c++;
		               i1++;
		           }
		           if(flag==0)
		           {
		               i1++;
		           }
		           else
		           {
		               count1.add(c);
		           }
		           c=1;
		       }
		       System.out.println(Collections.max(count1));
		       


	}

}
