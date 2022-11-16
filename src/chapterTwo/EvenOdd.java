package chapterTwo;

import java.util.Scanner;

	public class EvenOdd {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.print("Please enter a  number:");
			int enteredNumber = input.nextInt();

				if (enteredNumber % 2 == 0)
					System.out.println(enteredNumber + " is an even number");

				if (enteredNumber % 2 != 0)
					System.out.println(enteredNumber + " is an odd number");

						}

							}