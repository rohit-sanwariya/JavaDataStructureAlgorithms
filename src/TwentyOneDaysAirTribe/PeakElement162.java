package TwentyOneDaysAirTribe;

public class PeakElement162 {
    public int findPeakElement(int[] nums) {
        int l = 0,r = nums.length-1, m  = 0;
        while(l<=r){
              m = Math.floorDiv(l+r,2);

                if(m> 0 && nums[m]>nums[m-1]){
                    r = m-1;
                }
                else if(m<nums.length && nums[m+1] > nums[m] ){
                    l = m + 1;
                }
                else{
                    return m ;
                }

        }
        return 0;
    }


}
