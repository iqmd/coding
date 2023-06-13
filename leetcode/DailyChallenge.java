public class DailyChallenge{
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
    public List<String> summaryRanges(int[] nums){
        List<String> result = new ArrayList<>();
        String range = "";
        int start, end;
        start = end = nums[0];
        int istart = 0;

        for(int i = 0; i < nums.length; i++){
            if(start + (i-istart) == nums[i]){
                end = nums[i];
            }else{
                if(start != end)
                range = String.format("%d->%d",start,end);
                else
                range = String.format("%d",end);
                result.add(range);

                start = end = nums[i];
                istart = i;
            }
        }
        return result;

    }
}
