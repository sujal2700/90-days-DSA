import java.util.*;
public class AddElement{
  public static void addElement(ArrayList <Integer> arrayList, int position, int element){
    if(position<0 || position>arrayList.size()){
      System.out.println("Invalid position");
    }
    arrayList.add(position,element);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    ArrayList <Integer> arr=new ArrayList<>();
    for(int i=0;i<size;i++){
      arr.add(sc.nextInt());
    }
    int position=sc.nextInt();
    int element=sc.nextInt();
    addElement(arr,position,element);
    for(int i=0;i<arr.size();i++){
      System.out.print(arr.get(i) + " ");
    }      
}
}