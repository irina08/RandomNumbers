import java.util.*;
 
/*
	This program will randomly generate 2 ArrayList with length = 500: 
	numbers1 - without any given range (from -2,147,483,648 to +2,147,483,647)
	numbers2 - in given range between 0 and 1000, 1000 is not included.	
*/

public class TheSmallestNumber 
{
	public static void main(String ... args) 
	{
        Random r = new Random();
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		int length = 500;
		int min1, min2;
		
		// add 500 random numbers without any given range 
        for (int i = 0; i < length; i++) 
		{
            numbers1.add(r.nextInt());
		}
		
		Collections.sort(numbers1); 
		
		//print sorted numbers1
		System.out.println("Randomly generated numbers1 after sorting:");
		for (Integer n : numbers1)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		min1 = numbers1.get(0);
		System.out.println("The smallest number in the given first 500 numbers is: " + min1);
		
		
		// add 500 random numbers in given range between 0 and 1000, 1000 is not included
        for (int j = 0; j < length; j++) 
		{
            numbers2.add(r.nextInt(1000));
		}
		
		Collections.sort(numbers2); 
		
		//print sorted numbers2
		System.out.println("Randomly generated numbers2 after sorting:");
		for (Integer num : numbers2)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
		min2 = numbers2.get(0);
		System.out.println("The smallest number in the given second 500 numbers is: " + min2);
		
	}
}
		
		