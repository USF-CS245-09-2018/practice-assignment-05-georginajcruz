

public class MergeSort implements SortingAlgorithm{



	public void sort(int[] a){
		if (a.length>1)
			mergeSort(a, 0, a.length-1);
	}

	int[] mergeSort(int[] arr, int left, int right){
		if (right>left){
			int mid = (left+right)/2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, right, mid);
		}

		
		return arr;
	}

	int[] merge(int[] arr, int left, int right, int mid){
		int[] leftArr = new int[mid-left];
		int[] rightArr = new int[right-mid+1];

		left=0;
		right=0;
		int index=0;

		while (left<leftArr.length && right<rightArr.length){
			if(leftArr[left]<rightArr[right])
				arr[index++]=leftArr[left++];
			else
				arr[index++]=rightArr[right++];
		}

		while(left<leftArr.length){
			arr[index++]=leftArr[left++];
		}
		while(right<rightArr.length){
			arr[index++]=rightArr[right++];
		}
		
		return arr;

	}


}


