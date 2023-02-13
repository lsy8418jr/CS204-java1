package Homework;

/*
   method that finds average  
 */
class FindMethod {
	public void methodAverage(int myArray[]) {

		double sum = 0;

		for (int i : myArray) {

			sum += i;
		}

		System.out.println(sum / myArray.length);
	}
}

public class FindAverage {
	public static void main(String[] args) {

		int myArray[] = { 12, 3, 5, 7, 8, 9, 55, 22, 44, 66 }; // declare an array

		FindMethod aa = new FindMethod(); // make an object

		System.out.print("The average of sum of \"myArray\" is  ");
		aa.methodAverage(myArray); // call method

	}
}