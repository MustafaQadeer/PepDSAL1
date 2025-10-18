import java.util.*;

public class revise1 {
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static int[] solve(int[] arr){
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        nge[arr.length-1]=-1;
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i++){
            while (st.size()>0 && arr[i]>=st.peek()) {
                st.pop();
            }
            if (st.size()==0) {
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scn.nextInt();
        }
        
        int[] nge=solve(arr);
        display(nge);
    }
}