import java.util.*;
public class Reversal{
  public static void reverse(int[] arr){
    int start=0;
    int end=arr.length-1;
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;end--;
    }
  }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int[] arr=new int[size];
     for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();
     }
    reverse(arr);
    for(int i=0;i<size;i++){
      System.out.println(arr[i] + " ");
    }    
  }
}