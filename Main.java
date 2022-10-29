package Assignments;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        for (int k = 0; k < t; k++) {
            int n= sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }

            Stack<Integer> stack = new Stack<>();
            int[] arr1= new int[n];

            for (int i = n-1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek()<=arr[i] ){
                    stack.pop();
                }

                if (stack.isEmpty()){
                    arr1[i]=-1;
                }
                else{
                    arr1[i]=stack.peek();
                }

                stack.push(arr[i]);
            }
        }
    }

}
