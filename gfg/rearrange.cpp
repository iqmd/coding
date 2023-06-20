//https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1
class Solution{
    public:
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    void arrange(long long arr[], int n) {
        // Your code here
        arr[0] = transform(arr[0],arr);
    }

    int transform(int i,long long arr[]){
        if(arr[i] == 0){
            arr[i] = arr[0];
            return 0;
        }
        int ni = arr[i];
        arr[i]= transform(arr[i],arr);
        return  ni;

    }
};
