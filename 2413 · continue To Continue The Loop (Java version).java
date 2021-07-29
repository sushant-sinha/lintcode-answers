// SUSHANT SINHA

// 1240ms 10.63mb ( 100% )

// using BufferedWriter .write for faster output than System.out.println

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // write your code here
        // read data from console

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BufferedWriter op=new BufferedWriter(new OutputStreamWriter(System.out));
        // output the answer to the console according to the
        // requirements of the question

        for(int i=1;i<=n;i++){
            if(i%3==0)
            continue;

            op.write(i+"\n");
        }

        op.flush();
    }
}