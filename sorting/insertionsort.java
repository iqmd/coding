public class Main{
	public static void main(String args[]){
	        int A[] = {23,1,45,12,6,5,43,76,14,90,87};
		insertionsort(A);
		for(int i =0 ; i < A.length; i++){
			System.out.print(A[i]+" ");
		}
	}
	public static void insertionsort(int A[]){
		for(int i = 1; i < A.length; i++){
				int inserted = A[i];
				for(int j = i; j >= 0 ; j--){
						if(A[j] >  inserted){
								int temp = A[j];
								A[j] =  A[j+1];
								A[j+1] = temp;
						}
				}
		}
	}
}
