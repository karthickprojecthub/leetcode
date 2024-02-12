package sorting;

public class QuickSort1 {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        printArr(arr);
    }


    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];

        int i = (low-1);

        for(int j = low; j <=high-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    static void quickSort(int[] arr, int low, int high){

        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = {10,3,5,2,6,8};
        int size = arr.length;
        printArr(arr);
        quickSort(arr, 0, size-1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}
