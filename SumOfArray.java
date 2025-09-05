import java.util.*;
public class SumOfArray {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    
    System.out.print("Enter no. of elements of first array: ");
    int n1=scn.nextInt();
    
    int[] arr1=new int[n1];
    for(int i=0;i<arr1.length;i++){
         System.out.print("Enter element: ");
        arr1[i]=scn.nextInt();
    }
   
    System.out.print("Enter no. of elements of second array: ");
    int n2=scn.nextInt();
    
    int[] arr2=new int[n2];
    for(int i=0;i<arr2.length;i++){
         System.out.print("Enter element: ");
        arr2[i]=scn.nextInt();
    }
    
    int[] sum=new int[n1>n2? n1:n2];

    int i=arr1.length -1;
    int j=arr2.length -1;
    int k=sum.length -1;

    int c=0;
    while (k>=0) {
        int d=c;
        if (i>=0) {
            d+=arr1[i];
        }
        if (j>=0) {
            d+=arr2[j];
        }

        c=d/10;
        d=d%10;

        sum[k]=d;

        i--;
        j--;
        k--;


        
    }
    if (c!=0) {
        System.out.println(c);
    }
    for(int val:sum){
        System.out.println(val);
    }
    


}
}