package Assignments;

import java.util.Scanner;

public class BoundaryTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][]arr= new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        int minr=0;
        int minc=0;
        int maxr=m-1;
        int maxc=n-1;

        for (int i = minr,j=minc; j<=maxc;j++) {
            System.out.print(arr[i][j]+" ");
        }
        minr++;
        for (int i = minr,j=maxc; i <=maxr; i++) {
            System.out.print(arr[i][j]+" ");
        }
        maxc--;
        for (int i = maxr,j=maxc; j >=minc;j--) {
            System.out.print(arr[i][j]+" ");
        }
        maxr--;
        for (int i = maxr,j=minc;i>=minr;i--) {
            System.out.print(arr[i][j]+" ");
        }
    }


}
