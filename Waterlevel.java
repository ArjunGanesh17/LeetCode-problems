import java.util.*;
public class Waterlevel {

    public static int waterLevel(int[] height){
        int maxWater=Integer.MIN_VALUE;
        int fp=0;
        int sp=height.length-1;
        while(fp<sp){
            int ht=Math.min(height[sp],height[sp]);
            int dist=sp-fp;
            int currWater=ht*dist;
            maxWater=Math.max(maxWater,currWater);
            
            if(height[fp]<height[sp]){
                fp++;
            }
            else{
                sp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,8,3,7};
        System.out.println(waterLevel(height));

    }
}
