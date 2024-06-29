package TwentyOneDaysAirTribe;

public class ContainerWithMostWater {

    public int maxAreaBrute(int[] height) {
        int response = 0;
        int l=0,r = height.length-1;

        while(l<r){
            int area = (r-l) * Integer.min(height[l],height[r]);
            response = Integer.max(area,response);
            if(height[l]<height[r]){
                l++;
            } else if (height[l]>=height[r]) {
                r--;
            }
        }

        return response;

    }
}
