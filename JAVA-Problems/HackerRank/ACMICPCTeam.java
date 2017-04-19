package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMICPCTeam {
	public static void main(String args[]) {
		//INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		short N;
		short M;
		byte[][] topics;
		try {
			String input[] = br.readLine().split(" ");
			N = Short.parseShort(input[0]);
			M = Short.parseShort(input[1]);
			topics = new byte[N][M];
			for(short i = 0; i < N; ++i){
				char[] arr = br.readLine().toCharArray();
				for(int j = 0; j < M; ++j){
					topics[i][j] = (byte)(arr[j] - '0');
				}
			}

			short numTeams = 0;
			short maxTopics = 0;
			for(short i = 0; i < N; ++i){
				for(short j = (short)(i+1); j < N; ++j){
					short numTopics = 0;
					for(short k = 0; k < M; ++k){
						numTopics += topics[i][k] | topics[j][k];
					}
					if (maxTopics < numTopics){
						numTeams = 1;
						maxTopics = numTopics;
					} else if(maxTopics == numTopics){
						++numTeams;
					}
				}
			}


			//OUTPUT
			System.out.println(maxTopics);
			System.out.print(numTeams);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}