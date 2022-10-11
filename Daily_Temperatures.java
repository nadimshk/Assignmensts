package Assignments;

import java.util.Scanner;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases=sc.nextInt();

        for (int t = 0; t < testcases; t++) {
            int n= sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }

            Stack<Integer> stack= new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!stack.empty() && arr[stack.peek()]<arr[i]){
                    arr[stack.peek()]=i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
    }
}
