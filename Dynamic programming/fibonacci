import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
    int ans = fib(n,hm);
    
    System.out.println(ans);
    
  }
  
  static int fib(int n,Map hm){
    if(hm.containsKey(n)){
      return (int)hm.get(n);
    }
    int result = 0;
    if(n<2){
      result = n;
    }
    else{
      result = fib(n-1,hm)+fib(n-2,hm);
    }
    hm.put(n,result);
    return result;
  }

}
