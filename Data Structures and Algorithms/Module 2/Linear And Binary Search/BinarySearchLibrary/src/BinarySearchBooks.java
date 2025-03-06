public class BinarySearchBooks {

    public int left;
    public int right;

    public int bSearch(int[] array, int target){
        left = 0;
        right = array.length-1;

        while(left <= right){

            int mid = left +((right-left)/2);

            if(array[mid] == target){
                return mid;
            }
            if(array[mid] > target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }
}
