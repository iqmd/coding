import java.util.HashMap;
public class PerfectSquareDP {
    static int Mincount = Integer.MAX_VALUE;
    static HashMap<Integer,Integer> vals = new HashMap<>();
    public static void main(String[] args) {
        int[] ps = new int[10];
        for(int i=0 ; i < 10; i++){
            ps[i] = (i+1)*(i+1);
        }

        solve(6,0,ps,0);
        System.out.println(Mincount);

        

    }

    static void solve(int n,int sum, int[] ps,int count){
        if(vals.containsKey(sum)){
            vals.put(sum,Math.min(vals.get(sum),count));
            return;
        }
         if(sum == n){
            Mincount = Math.min(Mincount,count);
            return;
        }
        if(sum > n){
            return;
        }

       
        

        for(int i=0; i < ps.length; i++){
            sum += ps[i];
            count++;
            solve(n,sum,ps,count) ;
            sum -= ps[i];
            count--;

        }
    }
}
