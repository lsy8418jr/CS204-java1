package Homework;

public class TryCatchFixed {

	public static void main(String[] args) {

		int arr[] = { 33, 3, 4, 5 };

		try {

			System.out.println(arr[100]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Now the code is ok");

		}

	}

}
