package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"one ", "two", "three", "four,", "five"};
		
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2]= "what number are you?";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		
		//6. make an array of 50 integers
         int[] age = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		
		for (int i=0;i<age.length;i++) {
			int randy = new Random().nextInt(300);
			age[i]=randy;
		}
		//7. use a for loop to make every value of the integer array a random number
		for(int h =0; h<50;h++) {
	 for(int i = 0;i<age.length-1;i++) {
		 if(age[i]>age[i+1]) {
			 int temp = age[i+1];
			 age[i+1]=age[i];
			 
			 
		 }
	 
						
						
	 }
		}
		System.out.println(0);
		//8. without printing the entire array, print only the smallest number in the array
		for (int i=0;i<age.length;i++) {
		     System.out.println(age[i]);
		}
		//10. print the largest number in the array.
		System.out.println(age[49]);
	}
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	
}
