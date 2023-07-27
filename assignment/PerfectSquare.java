public class PerfectSquare {
    public static void main(String[] args) {
        int[] ps = new int[10];
        int n = 14;
        for(int i=0 ; i < 10; i++){
            ps[i] = (i+1)*(i+1);
        }
        for(int i =0; i< ps.length; i++){
            System.out.println(ps[i]);
        }
        int sum =0;
        int count = 0;
        for(int i=ps.length-1; i >= 0; i--){
            if(ps[i] < n){
                if(sum != n){
                    if(sum+ps[i] > n){
                    continue;
                    }
                    sum += ps[i];
                    count++;
                }
               
            }
        }
        for(int i=ps.length-1; i >= 0; i--){
            if(n%ps[i] == 0){
                if(sum != n){
                    count = n/ps[i];
                    break;
                }else{
                    count = Math.min(count,n/ps[i]);
                    break;
                }
            }
        }

        System.out.println(count);
        
    }

}
