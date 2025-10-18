import java.util.*;
public class NextGreaterElementToTheLeft {
public static void display(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
public static int[] solve(int[] arr){
    int[] nge=new int[arr.length];
    Stack<Integer> st=new Stack<>();

    st.push(arr.length-1);

    for(int i=arr.length-2; i>=0;i--){
        while (st.size()>0 && arr[i]>arr[st.peek()]) {
            int pos=st.peek();
            nge[pos]=arr[i];
            st.pop();
        }
        st.push(i);
    }
    while (st.size()>0) {
        int pos=st.peek();
        nge[pos]=-1;
        st.pop();
    }
    return nge;
}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no. of elements: ");
    int n=scn.nextInt();

    int[] arr=new int[n];

    for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter element: ");
        arr[i]=scn.nextInt();
    }

    int[] nge=solve(arr);
    display(nge);
}
}