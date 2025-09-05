import java.util.*;
public class barchart {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }

    int max=arr[0];
    for(int j=0;j<arr.length;j++){
        if(arr[j]>max){
            max=arr[j];
        }
    }
    for(int k=max;k>=1;k--){
        for(int l=0;l<arr.length;l++){
            if (arr[l]>=k) {
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}
}