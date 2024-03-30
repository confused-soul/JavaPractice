package Programs;

public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1, 8, 3, 4, 6, 8, 5, 6, 7};
        int max = 0;
        for(int i = 0; i<height.length-1; i++){
            for(int j = i+1; j < height.length; j++){
                int v = (j-i)*Math.min(height[i],height[j]);
                if( v > max)
                    max = v;
            }
        }
        System.out.println(max);
    }
}
