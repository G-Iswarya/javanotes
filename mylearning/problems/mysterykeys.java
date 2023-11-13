package problems;
import java.util.*;

public class mysterykeys {

	static ArrayList<Integer> isPrime(int n,ArrayList<Integer> prime)
    { 
        for(int i=3;i<n;i++)
        { int p=0;
            for(int j=2;j<=Math.pow(j,0.5)+1;j++)
            {
                if(i%j == 0)
                {
                    p = 1;
                    break;
                }
            }
            if(p==0)
            {
                prime.add(i);
            }
        }
        return prime;
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count=0,i,j,k;
       ArrayList<Integer> prime = new ArrayList<Integer>(n);
       prime.add(2);
       prime = isPrime(n,prime);
       for(i=0;i<prime.size();i++)
       {
           for(j=i+1;j<prime.size();j++)
           {
               for(k=j+1;k<prime.size();k++)
               {
                   if((prime.get(i)^prime.get(j)^prime.get(k))==0)
                   {
                       count+=1;
                   }
               }
           }
       }
       System.out.println(count);
	}

}
