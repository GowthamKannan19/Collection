package collection1;

import java.util.Scanner;

public class ConditionalState {
	public static void main(String[] args) {
		int num;
		int number;
		int shoot;
		int weight;
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter your number");
		System.out.println("Enter your age");
		System.out.println("enter your height");
		System.out.println("enter your weight");

		num = aa.nextInt();
		number = aa.nextInt();
		shoot = aa.nextInt();
		weight = aa.nextInt();
		if (num > 0) {
			System.out.println(num + "this is postive");

		} else {
			System.out.println(num + "this is false");
		}
		if (number < -5) {
			System.out.println(number + "this is true");

		} else {
			
			System.out.println(number + "this is false");
		}
		if (shoot > 20) {
			System.out.println(shoot + "this is true");

		} else
			System.out.println(shoot + "this is fase");
		if (weight >= 50) {
			System.out.println(weight + "this is true");

		} else {
			System.out.println(weight + "this is false");
		}
	}

}