// https://oj.masaischool.com/contest/5580/problem/301
// https://oj.masaischool.com/contest/5580/

// Planning for a party Ended
// Description

// Jim and Pam are inviting friends for a party. But, they want to invite only those friends who have helped them in any way. So, they have made two arrays, indicating the number of people they have taken help from. Each person, has been assigned a unique ID, in the form of a number.

// Both, Jim and Pam make their separate invite listAandBbased on the number of people, they have taken help from. Find out if the lists created by the two of them are same or not.

// Note: A person might have helped them multiple times, and obviously would be invited only once


// Input
// The first line of the input containsN, the number of people Pam has taken help from

// Next line containsNspace separated integers, indicating the ID's of the people, Pam has taken help from

// The next line containsM, the number of people Jim has taken help from

// Next line containsMspace separated integers, indicating the ID's of the people, Jim has taken help from

// Constraints

// 1 <=N, M<= 10000

// 1 <=A[i], B[i]<= 10000


// Output
// For each test case, printYes, if the lists created by Jim and Pam are same, else printNo

/*
 * Sample Input 1 

6
1 2 2 3 4 5
6
1 2 3 4 5 5
Sample Output 1

Yes
Sample Input 2 

5
1 2 2 3 4 
6
1 2 3 4 5 5
Sample Output 2

No
 */

import java.util.HashMap;


public class JimPam {
    public static void main(String[] args) {
        int[] arr1= {1,2,2,3,4};
        int[] arr2={1,2,3,4,5,5};
        
        HashMap<Integer,Integer> arrMap1= new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int arr1no=arr1[i];
            if(arrMap1.containsKey(arr1no)){
                int of=arrMap1.get(arr1no);
                int nf= of+1;
                arrMap1.put(arr1no,nf);
            }
            else{
                arrMap1.put(arr1no,1);
            }
        }


        HashMap<Integer,Integer> arrMap2= new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            int arr2no= arr2[i];
            if (arrMap2.containsKey(arr2no)) {
                int of=arrMap2.get(arr2no);
                int nf= of+1;
                arrMap2.put(arr2no,nf);
            }
            else{
                arrMap2.put(arr2no,1);
            }
        }


            if (arrMap1.keySet().equals(arrMap2.keySet())) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }



    }
}
