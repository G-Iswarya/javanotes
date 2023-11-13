//JAGGED ARRAY - DIFFERENT NO. OF COLUMNS
import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
public class arrays {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String[] geeks = {"Rahul", "Utkarsh",
				"Shubham", "Neelam"};

		// Conversion of array to ArrayList using Arrays.asList
		List<String> al = new ArrayList<String>();
		
		// adding elements of array to arrayList.
		Collections.addAll(al, geeks);
		System.out.println(al);
		List<String> l = new ArrayList<String>(Arrays.asList(geeks));
		System.out.println(l);
		
		//convert arrayList to array
		String[] arr = new String[l.size()];
		arr = l.toArray(arr);
		for(String i: arr)
		
		System.out.println(i);

//_____________________________________________
		
		
		int a1[][] = new int[2][];
		a1[0] = new int[4];
		a1[1] = new int[5];
		int c = 0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				a1[i][j] = c++;
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
	//FINAL ARRAY
		
				final int[] numbers = { 1, 2, 3, 4, 5 };
				// Attempting to reassign the array reference will
				// result in a compilation error: numbers = new
				// int[] {6, 7, 8, 9, 10};

				// However, individual elements of the array can
				// still be modified:
				System.out.println(numbers);//address of 1st element of array
				numbers[0] = 10;
				for(int i:numbers)
				{
					System.out.println(i);
				}
				
				
	//REFLECTION ARRAY
				// Java code to create an integer array of size 5,
				// using the Array class:


						// Get the size of the array
						int sizeOfArray = 5;

						// Create an integer array
						// using reflect.Array class
						// This is done using the newInstance() method

//						int[] intArray = (int[])Array.newInstance(
//							int.class, sizeOfArray);
						int[] intArray = (int[])Array.newInstance(int.class, 5);
					
						intArray[0] = 10;
						Array.set(intArray, 2, 12);
						// Printing the Array content
						System.out.println(Arrays.toString(intArray));
						System.out.println(Array.get(intArray, 4));


	}

}
