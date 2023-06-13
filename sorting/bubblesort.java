public class BubbleSort{
    public static void main(String args[]){
        int nums[] = {8,5,4,9,1,2,6,77,32,12,45,0};
        
        
        for(int j=0; j < nums.length; j++){
        for(int i = 0; i < nums.length-1 ; i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
            
            }
        }
        
        for(int i =0;  i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        }
    }
