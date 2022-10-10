package Assignments;

import java.util.Scanner;
import java.util.Stack;

public class Alan_Christopher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases=sc.nextInt();

        for (int t = 0; t < testcases; t++) {
            String str= sc.next();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                if (!stack.empty() && str.charAt(i)=='#'){
                        stack.pop();
                }
                else if (str.charAt(i) != '#'){
                    stack.push(str.charAt(i));
                }
            }

            for (Character ch:stack) {
                System.out.print(ch);
            }

            System.out.println();


        }
    }
}
