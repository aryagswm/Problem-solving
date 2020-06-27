import java.io.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int[] selection = select(n,arr);
    System.out.println("selection sort: ");
    for(int i=0;i<n;i++){
      System.out.println(selection[i]);
    }
    int[] bubbles = bubble(n,arr);
    System.out.println("Bubble sort: ");
    for(int i=0;i<n;i++){
      System.out.println(bubbles[i]);
    }
    int[] insert = insertion(n,arr);
    System.out.println("Insertion sort: ");
    for(int i=0;i<n;i++){
      System.out.println(insert[i]);
    }
    int[] merges = sort(arr,0,n-1);
    System.out.println("Merge sort: ");
    for(int i=0;i<n;i++){
      System.out.println(merges[i]);
    }
  }
  public static int[] select(int n, int[] arr){
    for(int i=0;i<n-1;i++){
      int min = arr[i];
      for(int j=i+1;j<n;j++){
        if(arr[j]<min){
          min = arr[j];
          arr[j]=arr[i];
          arr[i]=min;
        }
        else{
          continue;
        }
      }
    }
    return arr;
  }
  public static int[] bubble(int n, int[] arr){
      for(int i=0;i<n-1;i++){
        int flag = 0;
        for(int j=0;j<n;j++){
        if(arr[i]>arr[j]){
          int val = arr[i];
          arr[i] = arr[j];
          arr[j] = val;
          flag = 1;
        }
        }
        if(flag ==0){
          break;
        }
      }
      return arr;
  }
  public static int[] insertion(int n, int[] arr){
    for(int i=1;i<n;i++){
        int val = arr[i];
        int hole = i;
        while(hole>0 && arr[hole-1]>val){
          arr[hole] = arr[hole-1];
          hole = hole-1;
        }
        arr[hole] = val;
    }
    return arr;
  }
  public static int[] sort(int[] arr,int l,int n){
    if(l<n){
    int m = (n+l)/2;
    sort(arr,l,m);
    sort(arr,m+1,n);
    merge(arr,l,m,n);
    }
    return arr;
  }
  public static int[] merge(int[] arr, int l , int m, int n){
    int n1 = m-l+1;
    int n2 = n-m;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for(int i=0;i<n1;i++){
      L[i] = arr[l+i];
    }
    for(int j=0;j<n2;j++){
      R[j] = arr[m+1+j];
    }
    int i=0; int j=0;int k=l;
    while(i<n1 && j<n2){
        if(L[i]<=R[j]){
            arr[k] = L[i];
            i++;
        }
        else{
          arr[k] = R[j];
          j++;
        }
        k++;
    }
    while(i<n1){
      arr[k] = L[i];
      i++;
      k++;
    }
    while(j<n2){
      arr[k] = R[j];
      j++;
      k++;
    }
    return arr;
  }
  
}
