package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BotSavesPrincess {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	BigInteger first = new BigInteger(String.valueOf(scanner.nextInt()));
    	BigInteger second = new BigInteger(String.valueOf(scanner.nextInt()));
    	BigInteger nThTerm = new BigInteger(String.valueOf(scanner.nextInt()));
    	BigInteger total = new BigInteger("0");
    	
    	for(int i = 0; i < Integer.parseInt(nThTerm.toString()) - 2; i++) {
    		total = first.add(second.multiply(second));
    		first = second;
    		second = total;
    	}
    	System.out.print(total.toString());
    }
}