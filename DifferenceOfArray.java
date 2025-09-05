// import java.util.*;
// public class DifferenceOfArray {
// public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     System.out.print("Enter no. of elements of array 1: ");
//     int n1=scn.nextInt();
//     int[] arr1=new int[n1];
//     for(int i=0;i<arr1.length;i++){
//         System.out.print("Enter element: ");
//         arr1[i]=scn.nextInt();
//     }

//     System.out.print("Enter no. of elements of array 2: ");
//     int n2=scn.nextInt();
//     int[] arr2=new int[n2];
//     for(int i=0;i<arr2.length;i++){
//         System.out.print("Enter element: ");
//         arr2[i]=scn.nextInt();
//     }

//     int[] sum= new int[n1>n2?n1:n2];

//     int i=arr2.length-1;
//     int j=arr1.length-1;
//     int k=sum.length-1;

//     int c=0;

//     while (k>=0) {
//         int d=c;
//         if (i>=0) {
//             d+=arr2[i];
//             c=0;
//         }
//         if (j>=0) {
//             if (d>=arr1[j]) {
//                 d=d-arr1[j];
//                 c=0;
//             }
//             else{
//                 d=(d+10)-arr1[j];
//                 c=-1;
//             }
//         }
//         sum[k]=d;

//         j--;
//         i--;
//         k--;
//     }
//     for(int val:sum){
//         System.out.println(val);
//     }
// }
// }

import java.util.*;
public class DifferenceOfArray {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    
    System.out.print("Enter no. of elements of arr1: ");
    int n1=scn.nextInt();
    int[] arr1=new int[n1];
    for(int i=0;i<arr1.length;i++){
        System.out.print("Enter element: ");
        arr1[i]=scn.nextInt();
    }

    System.out.print("Enter no. of elements of arr2: ");
    int n2=scn.nextInt();
    int[] arr2=new int[n2];
    for(int i=0;i<arr2.length;i++){
        System.out.print("Enter element: ");
        arr2[i]=scn.nextInt();
    }
    int[] diff=new int[n2];

    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=diff.length-1;

    int c=0;
    
    while (k>=0) {
        int d=0;
        int arr1v=i>=0?arr1[i]:0;
        if (arr2[j]+c>=arr1v) {
            d=arr2[j]+c-arr1v;
            c=0;
        }
        else{
            d=arr2[j]+c+10-arr1v;
            c=-1;
        }
        diff[k]=d;
        i--;
        j--;
        k--;
    
    }
    int idx=0;
    while (idx<diff.length) {
        if (diff[idx]==0) {
            idx++;
        }
        else{
            break;
        }
    }
    while (idx<diff.length) {
        System.out.println(diff[idx]);
        idx++;
    }

    


}
}