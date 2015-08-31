package HackerRank;

import java.util.Scanner;

public class TheTimeInWords {
	public static void main(String args[]) {
		String singleNumbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
		String numbersEndsWithZero[] = {"", "ten", "twenty"};
		String numbersAfterTen[] = {"eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen"};

		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int reverseMinute = 0;
		if(minutes > 30) {
			reverseMinute = 60 - minutes;
		}
		String answerString = null;
		if(minutes == 0) {
			answerString = singleNumbers[hours] + " o' clock";
		} else if(minutes == 15) {
			answerString = "quarter past " + singleNumbers[hours];
		} else if(minutes == 30) {
			answerString = "half past " + singleNumbers[hours];
		} else if(minutes == 45) {
			answerString = "quarter to " + singleNumbers[(hours == 12) ? 1 : hours+1];
		} else if(minutes > 0 && minutes < 15) {
			answerString = singleNumbers[minutes] + " minutes past " + singleNumbers[hours];
		}  else if(minutes > 15 && minutes <= 20) {
			answerString = singleNumbers[minutes] + " minutes past " + singleNumbers[hours];
		} else if(minutes > 20 && minutes < 30) {
			answerString = numbersEndsWithZero[minutes/10] + " " + singleNumbers[minutes%10] + " minutes past " + singleNumbers[hours];
		} else if(reverseMinute > 0 && reverseMinute < 15) {
			answerString = singleNumbers[reverseMinute] + " minutes to " + singleNumbers[(hours == 12) ? 1 : hours+1];
		}  else if(reverseMinute > 15 && reverseMinute <= 20) {
			answerString = singleNumbers[reverseMinute] + " minutes to " + singleNumbers[(hours == 12) ? 1 : hours+1];
		} else if(reverseMinute > 20 && reverseMinute < 30) {
			answerString = numbersEndsWithZero[reverseMinute/10] + " " + singleNumbers[reverseMinute%10] + " minutes to " + singleNumbers[(hours == 12) ? 1 : hours+1];
		}
		System.out.print(answerString);
	}
}