import java.util.*;

public class QuickSort {

    public static void quicksort(int[] arr, int start, int end) {
        if(start < end){
		int pivotIdx = partition(arr, start, end);
		quicksort(arr, start, pivotIdx - 1);
		quicksort(arr, pivotIdx + 1, end);
	}
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = end;
	int idx = start - 1;
	for(int j = start; j < end; j++){
		if(arr[j] <= arr[pivot]){
		idx++;
		int temp = arr[idx];
		arr[idx] = arr[j];
		arr[j] = temp;
		}
	}
	idx++;
	int temp = arr[idx];
	arr[idx] = arr[pivot];
	arr[pivot] = temp;
	
	return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // number of elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {      // input array
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);          // call quicksort

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // print sorted array
        }
    }
}
