package leecode;

public class WaterCapacity {

    public static int maxArea(int[] height) {
        int maxWater=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currwater=ht*width;
            maxWater=Math.max(maxWater,currwater);
            if(height[lp]<height[rp]){
                lp++;
            }
            else if(height[lp]>height[rp]){
                rp--;
            }
            else{
                lp++;
                rp--;
            }

        }
        return maxWater;
    }

    private static int maxCapacity(int[] arr){
        int p1=0, p2=arr.length-1, max=0;

        while(p1 < p2){
            int currentCapacity = Math.min(arr[p1], arr[p2])* (p2-p1);
            max = Math.max(currentCapacity, max);

            if(arr[p1] < arr[p2]){
                p1++;
            }else{
                p2--;
            }
        }

        return max;
    }

    private static int totalCapacity(int[] arr){
        int left = 0, right = arr.length-1, maxLeft =0, maxRight = 0,totalWater=0;

        while(left <= right){

            if(arr[left] <= arr[right]){
                if(arr[left] > maxLeft){
                    maxLeft = arr[left];
                }else{
                    totalWater = totalWater + maxLeft - arr[left];
                }
                left++;
            }else{
                if(arr[right] > maxRight){
                    maxRight = arr[right];
                }else{
                    totalWater = totalWater + maxRight - arr[right];
                }
                right --;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int[] arr1 = {0,1,0,2,1,0,3,1,0,1,2};
        //int[] arr = {1,1};
        //System.out.println("Max Capacity : "+maxArea(arr));
        System.out.println("Max Capacity : "+maxCapacity(arr));
        System.out.println("Total Capacity :"+totalCapacity(arr1));
    }

}
