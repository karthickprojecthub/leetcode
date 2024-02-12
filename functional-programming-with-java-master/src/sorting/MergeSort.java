package sorting;

public class MergeSort {

    static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l + 1;
        int n2 = r-m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i< n1; ++i){
            L[i] = arr[i + i];
        }

        for(int j = 0; j< n2; ++j){
            R[j] = arr[m+1+j];
        }



    }

    static void sort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r-1)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }

    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 6, 1, 7};
        sort(arr, 0, arr.length-1);

    }


}
