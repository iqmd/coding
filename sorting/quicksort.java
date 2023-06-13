public class QuickSort{
	public static void main(){
	    int A[] = {23,1,45,12,6,5,43,76,14,90,87};
		quicksort(A);
		for(int i =0 ; i < A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void quicksort(int[] A, int low, int high){
			if(low <= hight) return;
			
			int pivot = partition(A,low,high);
			quicksort(array, low, pivot-1);
			quicksort(array, pivot+1, hight);

	}

	
	public static void parition(int[] A, int low, int high){
			int pivot = A[high];
			int i = start - 1;

			for(int j = start ; j <= end -1; j++){
					if(A[j] < pivot){
							i++;
							int temp = A[i];
							A[i] = A[j];
							A[j] = temp;
					}
			}
						
			}
}
