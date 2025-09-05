import java.util.*;
public class findinginarray {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        System.out.print("Enter element: ");
        arr[i]=scn.nextInt();
    }
    System.out.print("Enter element to be found: ");
    int d=scn.nextInt();
    int res=-1;
    for(int j=0;j<arr.length;j++){
        if(arr[j]==d){
            res=j;
            break;
        }
    }
    System.out.println(res);

}
}