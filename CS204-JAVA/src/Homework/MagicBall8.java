/*Write a JAVA program that emulates a magic eight ball
Seyun Lee (P00685281)
*/

package Homework;

import java.util.Random;

public class MagicBall8 {

	public static void main(String[] args) {

		// create 20 integers from 0 to 19
		Random randNum = new Random();
		int magicNum = randNum.nextInt(20);
		String str;
		switch (magicNum) {
		case 0:
			str = "It is certain.";
			break;
		case 1:
			str = " It is decidedly so.";
			break;
		case 2:
			str = "Without a doubt.";
			break;
		case 3:
			str = "Yes definitely.";
			break;
		case 4:
			str = "You may rely on it.";
			break;
		case 5:
			str = "As I see it, yes.";
			break;
		case 6:
			str = "Most likely.";
			break;
		case 7:
			str = " Outlook good.";
			break;
		case 8:
			str = " Yes.";
			break;
		case 9:
			str = " Signs point to yes.";
			break;
		case 10:
			str = " Reply hazy, try again.";
			break;
		case 11:
			str = " Ask again later.";
			break;
		case 12:
			str = " Better not tell you now.";
			break;
		case 13:
			str = "Cannot predict now.";
			break;
		case 14:
			str = "Concentrate and ask again.";
			break;
		case 15:
			str = "Don't count on it.";
			break;
		case 16:
			str = "My reply is no.";
			break;
		case 17:
			str = "My sources say no.";
			break;
		case 18:
			str = "Outlook not so good.";
			break;
		case 19:
			str = "Very doubtful.";
			break;
		default:
			str = "Invalid Number";
		}
		
		System.out.println(str);
	}

}
