package arrays;

public class SparseVector {

    private int[] nums;

    SparseVector(int[] nums) {
        this.nums = nums;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        if(this.nums.length != vec.getNums().length){
            return 0;
        }

        int sum =0;

        for(int i=0; i<this.nums.length; i++){
            sum += this.nums[i] * vec.getNums()[i];
        }

        return sum;
    }

    public int[] getNums() {
        return nums;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
