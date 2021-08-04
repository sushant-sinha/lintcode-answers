import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // write your code here
		
        Scanner sc=new Scanner(System.in);
        double dif=sc.nextDouble()/sc.nextDouble();

        int ans=0;

        while(dif>1){
            dif/=2;
            ans++;
        }

        System.out.println("Need to fold "+ans+" times");
    }
}