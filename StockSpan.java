import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;
public class StockSpan {
public static void display(int[] ss){
    for(int i=0;i<ss.length;i++){
        System.out.print(ss[i]+" ");
    }
}
public static int[] solve(int[] arr){
    int[] ss= new int[arr.length];

    Stack<Integer> st=new Stack<>();

    ss[0]=1;
    st.push(0);

    for(int i=1;i<arr.length;i++){
        while (st.size()>0 && arr[i]>arr[st.peek()]) {
            st.pop();
        }
        if (st.size()==0) {
            ss[i]=i+1;
        }
        else{
            ss[i]=i-st.peek();
        }
        st.push(i);
    }

    return ss;


}
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter the no. of elements: ");
    int n=scn.nextInt();

    int[] arr= new int[n];

    for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter element: ");
        arr[i]=scn.nextInt();
    }

    int[] ss=solve(arr);

    display(ss);
}
}