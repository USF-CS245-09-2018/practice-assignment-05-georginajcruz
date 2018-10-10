

public class QuickSort implements SortingAlgorithm{



	public void sort(int[] a){

		int left = 0; 
		int right = a.length-1;
		quickSort(a, left, right);
		

	}

	public int[] quickSort(int[] arr, int left, int right){
		if (left>=right){
			return arr;
		}

		int pivot = left;
		int l = left;
		int r = right; 
		while (l<=r){
			if (arr[l]<=arr[pivot] && l<=right)
				l++;
			if(arr[r]>=arr[pivot] && r>=l)
				r--;
			if(l<=r && l<=right){
				if (arr[l]>=arr[pivot]&& arr[r]<=arr[pivot]){
					int temp = arr[l];
					arr[l] = arr[r];
					arr[r] = temp;
				}
			}



		}	

	
		int temp = arr[pivot];
		arr[pivot] = arr[r];
		arr[r]= temp;


		quickSort(arr, left, r-1);
		quickSort(arr, r+1, right);
		


		return arr;
		


	}


}


