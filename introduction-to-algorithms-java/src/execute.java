public class execute {
    public static void main(String[] args){
        int[] arr= {-1, 20, -56, 886, 887, 91, -100, 7000};
        //int[] arr= {-1,2,4,-5,6,8,-10};
        chapterFour c = new chapterFour();

        System.out.println("Full Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");

        triple t = c.maxSubArray(arr,0,arr.length-1);
        triple t2 = c.linearMaxSubArray(arr);

        System.out.printf("The max subarray is %d from indicies %d to %d\n", t.value, t.low, t.high);
        System.out.printf("The max subarray is %d from indicies %d to %d\n", t2.value, t2.low, t2.high);
    }
}
