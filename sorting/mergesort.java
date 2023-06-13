public class Main{
	public static void main(String args[]){
	    int A[] = {23,1,45,12,6,5,43,76,14,90,87};
		mergesort(A);
		for(int i =0 ; i < A.length; i++){
			System.out.print(A[i]+" ");
		}
	}

	public static void mergesort(int A[]){

		int length = A.length;
		if(length <= 1) return;
		int mid = A.length/2;
		int left[] = new int[mid];
		int right[] = new int[length - mid];
		for(int i = 0; i < mid; i++){
			left[i] = A[i];
		}
		for(int j = mid; j < length; j++){
			right[j-mid] = A[j];
		}
		mergesort(left);
		mergesort(right);
		merge(left,right,A);

	}
	public static void merge(int[] left, int[] right, int[] A){

		int i = 0, j = 0, k =0;
		
		while(i < left.length && j < right.length){
			if(left[i] < right[j]){
				A[k] = left[i];
				i++;
			}else{
				A[k] = right[j];
				j++;
			}
			
			k++;
		}
		while(i < left.length){
			A[k] = left[i];
            i++;
            k++;
		}

		while(j < right.length){
			A[k] = right[j];
            j++;
            k++;
		}
	}
}
