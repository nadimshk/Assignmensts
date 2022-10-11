public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,1,8,9,2};
        int n=arr.length;
        
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if (arr[min]>arr[j]) {
                    min=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

        for (int j = 0; j < arr.length; j++) {
            
            System.out.print(arr[j]+" ");
        }
    }
}
