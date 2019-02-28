package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String [] array = {"Phone", "Watch", "AirPods", "TV", "Computer"};
		//2. print the third element in the array
System.out.println(array[2]);
		//3. set the third element to a different value
array[2]="SouljaPods";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i <array.length; i++){
			array[i]= "Samsung Fridge";
		}

		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i <array.length; i++){
			System.out.println(array[i]);
		}
		
		
		
		
		
		//7. make an array of 50 integers
		int [] intArray = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for (int i = 0; i<intArray.length; i++) {
	Random r = new Random();
	
	intArray[i]=r.nextInt(50);
}
int smallest = intArray[0];
		//9. without printing the entire array, print only the smallest number on the array

for(int i = 1; i< intArray.length; i++) {
	if(intArray[i]<smallest) {
		smallest = intArray[i];
	}
	
}
System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i<intArray.length; i++) {
System.out.println(intArray[i]);
}
		//11. print the largest number in the array.
		int largest = intArray[0];
		for (int i = 0; i<intArray.length; i++) {
			if(intArray[i]>largest) {
				largest = intArray[i];
			}
		}
		//12. print only the last element in the array
		System.out.println(largest);
	}
}
