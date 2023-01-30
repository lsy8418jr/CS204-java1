package Homework;
/*Write a JAVA program that has a for loop that loops ten times.
 *  Each time the loop occurs enter a number, if -6 is entered end the loop. 
 *  Find the sum of the numbers entered. Use a for loop
 */
public class Find_6 {

	public static void main(String[] args) {
	int x=0, sum=0;
		for(int i=0;i<10;i++) {
			x=i;
			sum+=x;
			if(x==6) {
				break;
			}
		}
		System.out.println("The sum of the numbers entered is "+sum);
	}

}
