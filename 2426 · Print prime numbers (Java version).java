// SUSHANT SINHA

// 1418ms 11.26mb ( 85.45% )

/*

 based on Sieve of Eratosthenes

 For more details : https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        // write your code here
        // read data from console

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean ar[]=new boolean[n+1];

		for(int i=2;i<=n;i++)
			ar[i]=true;

		for(int i=2;i<=Math.sqrt(n);i++){
			if(ar[i]){
				int j=i*i;
				while(j<=n){
					ar[j]=false;
					j+=i;
				}
			}
		}

		for(int i=2;i<=n;i++){
			if(ar[i])
				System.out.println(i);
		}

        // output the answer to the console according to the
        // requirements of the question

	}
}