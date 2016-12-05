package HackerRank;

import java.util.Scanner;

public class JavaOneDArrayHard {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0; i < testCases; i++) {
			int arrLen = sc.nextInt();
			int maxjump = sc.nextInt();
			int posArray[] = new int[arrLen+maxjump+1];
			for(int j = 0; j < arrLen; j++) {
				posArray[j] = sc.nextInt();
			}
			int pos = 0;
			boolean isPossible = false;
			boolean isRight = true;
			if(maxjump < arrLen) {
				while(pos <= arrLen) {
					if(posArray[pos] == posArray[pos + maxjump]) {
						pos += maxjump;
					} else if(posArray[pos] == posArray[pos + 1]) {
						pos += 1;
					} else {
						isRight = false;
						for(int j = 1; j < maxjump; j++) {
							try {
								if(posArray[pos] == posArray[pos-j]) {
									if(posArray[pos] == posArray[pos + maxjump - j] && posArray[pos] == posArray[pos - j]) {
										pos += (maxjump - j);
										isRight = true;
										break;
									}
								} else {
									break;
								}
							} catch (Exception e) {
								break;
							}
						}
						if(!isRight) break;
					}
				}
				if(isRight) isPossible = true;
				else isPossible = false;
			} else {
				isPossible = true;
			}
			if(isPossible) System.out.print("YES\n");
			else System.out.print("NO\n");
		}
	}
}
