// import java.util.*;

// public class spanofarray {
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     int n=scn.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=scn.nextInt();
//     }
//     int max=arr[0];
//     for(int j=0;j<arr.length;j++){
//         if(arr[j]>max){
//             max=arr[j];
//         }
//     }
//     int min=arr[0];
//     for(int k=0;k<arr.length;k++){
//         if(arr[k]<min){
//             min=arr[k];
//         }
//     }
//     int span=max-min;
//     System.out.print("span is: ");
//     System.out.println(span);
// }
// }

import java.util.*;
public class spanofarray {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no. of elements: ");
    int n=scn.nextInt();
    int[] arr;
    arr=new int[n];
    for(int i=0;i<arr.length;i++){
        System.out.print("Enter element: ");
        arr[i]=scn.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if (arr[i]>max) {
            max=arr[i];
        }
        if (arr[i]<min) {
            min=arr[i];
        }
    }
    int span=max-min;
    System.out.println(span);
}
}