import java.util.*;
public class NextSmallerElementToTheRight {
public static void display(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
public static int[] solve(int[] arr){
    int[] nse=new int[arr.length];
    Stack<Integer> st=new Stack<>();

    st.push(0);

    for(int i=1;i<arr.length;i++){
        while (st.size()>0 && arr[i]<arr[st.peek()]) {
            int pos=st.peek();
            nse[pos]=arr[i];
            st.pop();
        }
        st.push(i);
    }
    while (st.size()>0) {
        int pos=st.peek();
        nse[pos]=-1;
        st.pop();
    }
    return nse;
}
public static void main(String[] arg){
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no. of elements: ");
    int n=scn.nextInt();

    int[] arr=new int[n];

    for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter element: ");
        arr[i]=scn.nextInt();
    }

    int[] nse=solve(arr);
    display(nse);
}
}