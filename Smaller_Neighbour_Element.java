import java.util.Scanner;
import java.util.Stack;

public class Smaller_Neighbour_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases= sc.nextInt();

        for (int t = 0; t < testcases; t++) {
            int n=sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                while(!stack.empty() && stack.peek()>=arr[i]){
                    stack.pop();
                }

                if(stack.empty()){
                    System.out.print("-1"+" ");
                }
                else{
                    System.out.print(stack.peek()+" ");
                }
                stack.push(arr[i]);
            }

            System.out.println();
        }
    }

}
