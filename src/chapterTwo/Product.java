package chapterTwo;

import java.util.Scanner;

public class Product {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer");
	int integer1 = input.nextInt();

	System.out.print("Enter second integer");
	int integer2 = input.nextInt();

	System.out.print("Enter third integer");
	int integer3 = input.nextInt();

	int productOf3Integers = integer1 * integer2 * integer3;

	System.out.printf("Product of the three integers is %d%n", productOf3Integers);
		
		}

			}

