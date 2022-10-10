package Assignments;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases=sc.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n=sc.nextInt();
            int[] arr= new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
                                                        //1 3 2 4
            Stack<Integer> stack = new Stack<>();
            int[] arr1= new int[n];
            for (int i = n-1; i >=0 ; i--) {
                while (!stack.empty() && stack.peek()<=arr[i]){
                    stack.pop();
                }

                if (stack.empty()){
                    arr1[i]=-1;
                }
                else{
                    arr1[i]=stack.peek();
                }

                stack.push(arr[i]);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr1[i]+" ");
            }
        }
    }

}
