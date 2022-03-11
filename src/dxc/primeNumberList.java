package dxc;

import java.util.Scanner;

public class primeNumberList {

	public static void main(String[] args) {
		int flag;
		System.out.println(" Prime number between 2 numbers : Enter first :");
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();

		System.out.println(" Prime number between 2 numbers : Enter second :");
		Scanner a = new Scanner(System.in);
		int input2 = a.nextInt();

		for (int i = input1; i <= input2; i++) {
			if (i == 0 || i == 2)
				continue;
			flag = 1;

			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				System.out.println(" " + i);
			}

		}
		sc.close();
	}

}