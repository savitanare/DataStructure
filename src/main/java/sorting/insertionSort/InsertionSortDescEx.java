package sorting.insertionSort;

public class InsertionSortDescEx {

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 2, 1};

        for(int i = 1; i< arr.length; i++){
            int curr = arr[i];
            int j = i - 1;

            while(j >= 0 && curr > arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;

        }
        printArray(arr);

    }
}
