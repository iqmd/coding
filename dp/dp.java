public class DP{
		public static void main(String args[]){
				long int mem[] = new long int[51];
				for(long int i = 0; i < 50; i++){
						System.out.prlong intln(fib(i,mem));
				}
		}

		public static long int fib(long int n, long int[] mem){
			if(n == 0 || n == 1){
					return n;
			}	
			if(mem[n] != 0){
					return mem[n];
			}
			mem[n] = fib(n-1,mem) + fib(n-2,mem);
			return mem[n];
		}
}
