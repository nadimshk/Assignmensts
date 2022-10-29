package Assignments;

import java.util.Scanner;

public class Subarray_and_Sum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        if (sum%k !=0){
            System.out.println("1");
        }
        else{
            int start=0;
            for (int i = start; i < n && arr[i]%k==0;i++) {
                start++;
            }

            int end=n-1;
            for (int i = end; i >=0 && arr[i]%k ==0;i--) {
                end--;
            }

            int size=0;
//            int sum1=0;
            int count=0;

            if (start==n){
                System.out.println("0");
            }else {
                size=Math.max(n-1-start,end);
            }

            int sum1=0;
            for (int i = 0; i < size; i++) {
                sum1+=arr[i];
            }

            if (sum1%k !=0){
                count++;
            }

            for (int i = size; i <n; i++) {
                sum1+=arr[i];
                sum1=sum1-arr[i-size];
                if (sum1%k !=0){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
