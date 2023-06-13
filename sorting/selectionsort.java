public class Main{
	public static void main(String args[]){
	        int A[] = {23,1,45,12,6,5,43,76,14,90,87};
		selectionsort(A);
		for(int i =0 ; i < A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void selectionsort(int A[]){
		for(int i = 0; i < A.length; i++){
			for(int j= i+1; j < A.length ; j++){
				if(A[j] < A[i]){
					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
	}
}
