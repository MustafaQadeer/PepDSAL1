// import java.util.*;
// public class NextGreaterElementToTheRight {
// public static void main(String[] args) {
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter size of array: ");
//     int n=scn.nextInt();

//     int[] arr1= new int[n];

//     for (int i = 0; i < arr1.length; i++) {
//         System.out.print("Enter array element: ");
//         arr1[i]=scn.nextInt();
//     }

//     int[] arr2=new int[n];
    
//     for(int i=0;i<arr1.length;i++){
//         int res=-1;
//         for(int j=i+1;j<arr1.length;j++){
//             if (arr1[j]>arr1[i]) {
//                 res=arr1[j];
//                 break;
//             }
//          }
//          arr2[i]=res;         

//     }

//     for(int k=0;k<arr2.length;k++){
//         System.out.print(arr2[k]+" ");
//     }


// }
// }

// import java.util.*;
// public class NextGreaterElementToTheRight {
// public static void display(int [] arr){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// public static int[] solve(int[] arr){
//     int[] nge=new int[arr.length];
//     Stack<Integer> st=new Stack<>();

//     nge[arr.length-1]=-1;
//     st.push(arr[arr.length-1]);

//     for(int i=arr.length-2;i>=0;i--){
//         while (st.size()>0 && arr[i]>=st.peek()) {
//             st.pop();
//         }
//         if (st.size()==0) {
//             nge[i]=-1;
//         }
//         else{
//             nge[i]=st.peek();
//         }
//         st.push(arr[i]);
//     }
//     return nge;
// }
// public static void main(String[] args) {
//     Scanner scn= new Scanner(System.in);
//     System.out.print("Enter no. of elements of array: ");
//     int n=scn.nextInt();

//     int[] arr=new int[n];

//     for(int i=0;i<arr.length;i++){
//         System.out.print("Enter element: ");
//         arr[i]=scn.nextInt();
//     }
//     int[] nge=solve(arr);
//     display(nge);

// }
// }

import java.util.*;
public class NextGreaterElementToTheRight {
public static void display(int [] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static int[] solve(int[] arr){
    int[] nge=new int[arr.length];

    Stack<Integer> st= new Stack<>();

    st.push(0);

    for(int i=1;i<arr.length;i++){
        while (st.size()>0 && arr[i]>=arr[st.peek()]) {
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
    Scanner scn= new Scanner(System.in);
    System.out.print("Enter no. of elements of array: ");
    int n=scn.nextInt();

    int[] arr=new int[n];

     xtInt();
    }
    int[] nge=solve(arr);
    display(nge);

}
}