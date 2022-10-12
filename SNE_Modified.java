package Assignments;

import java.util.Scanner;
import java.util.Stack;

public class SNE_Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                count++;
            }

            stack.push(arr[i]);
        }

        System.out.println(count);
    }
}
