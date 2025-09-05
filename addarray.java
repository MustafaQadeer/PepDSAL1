import java.util.*;
public class addarray {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter size of first array: ");
    int n1=scn.nextInt();
    System.out.print("Enter size of second array: ");
    int n2=scn.nextInt();
    int[] arr1=new int[n1];
    int[] arr2=new int[n2];
    for(int i=0;i<arr1.length;i++){
        int no=i+1;
        System.out.print("Enter element "+ no + " of first array");
        arr1[i]=scn.nextInt();
    }
    for (int i = 0;i<arr2.length;i++) {
        int no=i+1;
        System.out.print("Enter element "+ no +" of second array");
        arr2[i]=scn.nextInt();
    }
    if(arr1.length==arr2.length){
        
    }
}
}