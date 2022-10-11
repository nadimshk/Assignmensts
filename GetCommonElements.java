// https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/gce1-official/ojquestion

import java.io.*;
import java.util.*;

class GetCommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2= new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> fmap= new HashMap<>();
        for(int val : arr){
            if(fmap.containsKey(val)){
                int of=fmap.get(val);
                int nf= of+1;
                fmap.put(val,nf);
            }
            else{
                fmap.put(val,1);
            }
        }

        for(int val : arr2){
            if(fmap.containsKey(val)){
                System.out.println(val);
                fmap.remove(val);
            }
        }

    }
}