import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int n = sc.nextInt();
    int[] coins = new int[n];
    for(int i=0;i<n;i++){
      coins[i] = sc.nextInt();
    }
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=1;i<amount+1;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i],1+dp[i-coins[j]]);
                }
                else{
                    break;
                }
            }
            System.out.println(i + " "+dp[i]);
        }
        if(dp[amount]<=amount){
            System.out.println (dp[amount]);
        }
        System.out.println(-1);
  }
  
}
