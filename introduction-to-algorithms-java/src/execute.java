public class execute {
    public static void main(String[] args){
        int[] arr= {-1, 20, -56, 886, 887, 91, -100, 7000};
        chapterFour c = new chapterFour();

        System.out.println("Full Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");

        triple t = c.maxSubArray(arr,0,arr.length-1);

        System.out.printf("The max subarray is %d from indicies %d to %d\n", t.value, t.low, t.high);
    }
}
