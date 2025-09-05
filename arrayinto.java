import java.util.*;
public class arrayinto {
public static void main(String[] args) {
    int[] arr;
    arr=new int[5];
   
     arr[0]=33;
     arr[1]=32;
     arr[2]=45;
     arr[3]=90;
     arr[4]=99;
     System.out.println(arr.length);
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
}
}