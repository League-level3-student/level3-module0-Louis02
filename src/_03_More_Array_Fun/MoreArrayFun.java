package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun fun = new MoreArrayFun();
		String[] testArray = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		fun.RandomString(testArray);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public void printString(String[] string) {
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public void Reverse(String[] string) {
		for (int i = string.length - 1; i >= 0; i--) {
			System.out.println(string[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public void EveryOther(String[] string) {
		for (int i = 0; i < string.length * 2; i += 2) {
			System.out.println(string[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	public static void RandomString(String[] string) {

		String[] printedWords = new String[string.length];
		int totalPrinted = 0;
		while (totalPrinted < string.length) {
			Random r = new Random();
			String ranWord = string[r.nextInt(string.length)];
			boolean found = false;
			for (int i = 0; i < printedWords.length; i++) {
				if (ranWord.equals(printedWords[i])) {
					found = true;
					break;
				}

			}
			if (!found) {
				printedWords[totalPrinted] = ranWord;
				totalPrinted++;
				System.out.println(ranWord);
			}
		}

	}
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
