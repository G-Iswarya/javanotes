

import java.util.*;
public class problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// 1. from the total students print the sum of top k students
		int i,sum=0;
		int students = sc.nextInt();
		int ScoreCount = sc.nextInt();
		int score[] = new int[students];
		for(i=0;i<students;i++)
		{
			score[i] = sc.nextInt();
		}
//		List al = Arrays.asList(score);
//		System.out.println("al list: "+al);
		Arrays.sort(score);
		for(i=students-1;i>=students-ScoreCount;i--)
		{
			sum+=score[i];
		}
		System.out.println(sum);
		
		// 2. order check- height of students
		
		int input = sc.nextInt();
		int count=0;
		int order[] = new int[input];
		int sortt[] = new int[input];
		for(i=0;i<input;i++)
		{
		    order[i] = sc.nextInt();
		}
		sortt = order.clone();
		Arrays.sort(order);
		for(i=0;i<input;i++)
		{
		    if(order[i] != sortt[i])
		    {
		        count+=1;
		    }
		}
		System.out.print(count);
		
		
		// 3. Swap 2 digits to get the greatest even number
		
		int num,flag = 0; char temp;
		num = sc.nextInt();
		String str1 = String.valueOf(num);
		char[] str = str1.toCharArray();
		int len = str.length;
		int lastIndex = -1;
		int firstIndex = -1;
		for(i=0;i<str.length-1;i++)
		{
		    if((str[i]-'0')%2 == 0 && str[len-1]>str[i])
		    {
		        firstIndex = i;
		        break;
		    }
		    if(flag == 0 && (str[len-2-i]-'0')%2==0)
		    {
		        lastIndex = len-2-i;
		        flag = 1;
		    }
		}
		if(firstIndex!= -1)
		{
		    temp = str[len-1];
		    str[len-1] = str[firstIndex];
		    str[firstIndex] = temp;
		}
		else{
		    temp = str[len-1];
		    str[len-1] = str[lastIndex];
		    str[lastIndex] = temp;
		}
		System.out.println(str);
		
		
		
	}

}





