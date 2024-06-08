/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it can trap after raining.
 *      ____
 *     |    |
 * |___|    | 
 * |   |    |
 * |   |    |
 * ________________________________
 * 
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int n=height.length;
        //leftMax
        int[] leftMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //rightMax
        int[] rightMax=new int[n];
        rightMax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(height[j],rightMax[j+1]);
        }
        int waterLevel=0;
        //loop
        for(int i=0;i<n;i++){
            waterLevel+=(Math.min(leftMax[i],rightMax[i]))-height[i];
        }

        return waterLevel;
    }
}
