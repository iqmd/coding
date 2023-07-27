public class Target {
    public static void main(String[] args) {
        int[] elements = {6,7,8,9,9,9,14,27};

        System.out.println(solve(elements,9)[0]);
        System.out.println(solve(elements,9)[1]);
    }

    static int[] solve(int[] nums,int target){
        int[] range = {-1,-1};
        int i= 0;
        int j= nums.length -1;
        int found=-1;

        while(i < j){
            int mid = i + (j-i)/2;

            if(nums[mid] == target){
                found = mid;
                break;
            }else if(nums[mid]< target){
                i = mid+1;
            }else if(nums[mid]> target){
                j = mid-1;
            }
        }

        if(found == -1){
            return range;
        }

        int ri = 0;
        j = found;

        while(j-ri != 1){
            int mid = ri + (j-ri)/2;

            if(nums[mid] < target){
                ri = mid;
            }else if(nums[mid] == target){
                j= mid;
            }
        }

        i = found;
        int rj = nums.length-1;

        while(rj-i != 1){
            int mid = i + (rj-i)/2;

            if(nums[mid] > target){
                rj= mid;
            }else if(nums[mid] == target){
                i = mid;
            }
        }

        range[0] = ri+1;
        range[1] = rj-1;

        



        return range;
    }
}

