import java.util.*;
public class LargestAreaOfHistogram {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter no. of elements: ");
    int n=scn.nextInt();
    int[] arr=new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i]=scn.nextInt();
    }

    int[] rb=new int[n];
    Stack<Integer> st=new Stack<>();
    st.push(arr.length-1);
    rb[arr.length-1]=arr.length;
    for(int i=arr.length-2;i>=0;i--){
        while (st.size()>0 && arr[i]<=arr[st.peek()]) {
            st.pop();
        }
        if (st.size()==0) {
            rb[i]=arr.length;
        }
        else{
            rb[i]=st.peek();
        }
        st.push(i);

    }
    
    int[] lb=new int[n];
    Stack<Integer> nst=new Stack<>();
    nst.push(0);
    lb[0]=-1;
    for(int i=1;i<arr.length;i++){
        while (nst.size()>0 && arr[i]<=arr[nst.peek()]) {
            nst.pop();
        }
        if (nst.size()==0) {
            lb[i]=-1;
        }
        else{
            lb[i]=nst.peek();
        }
        nst.push(i);

    }


    int maxarea=0;
    for (int i = 0; i < arr.length; i++) {
        int width=rb[i]-lb[i]-1;
        int area=arr[i]*width;
        if (area>maxarea) {
            maxarea=area;
        }
    }
    System.out.println(maxarea);
}
}